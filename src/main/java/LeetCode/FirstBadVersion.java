package LeetCode;

public class FirstBadVersion {

  private VersionControl versionControl;
  public boolean solution(int n, int firstBadVersion) {

    versionControl = new VersionControl(firstBadVersion);
    int result = search(0, n);


    return result == firstBadVersion;
  }

  private int search(int first, int last) {
    if (first+1 >= last) {
      return versionControl.isBadVersion(first) ? first: last;
    }
    int mid = first + (last - first)/2;

    if(versionControl.isBadVersion(mid)) {
      return search(first, mid);
    }
    return search(mid+1, last);
  }

}

class VersionControl {
  int firstBadVersion;

  public VersionControl(int firstBadVersion) {
    this.firstBadVersion = firstBadVersion;
  }

  boolean isBadVersion(int version) {
    return version >= firstBadVersion;
  }
}
