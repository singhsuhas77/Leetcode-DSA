class Solution {
    private MountainArray mountainArray;
    private int targetValue;

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int arrayLength = mountainArr.length();
        int left = 0;
        int right = arrayLength - 1;

        while (left < right) {
            int mid = (left + right) >>> 1;
            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int peakIndex = left;
        this.mountainArray = mountainArr;
        this.targetValue = target;
        int resultInAscending = binarySearch(0, peakIndex, 1);

        return resultInAscending == -1 ?
                binarySearch(peakIndex + 1, arrayLength - 1, -1) :
                resultInAscending;
    }

    private int binarySearch(int left, int right, int direction) {
        while (left < right) {
            int mid = (left + right) >>> 1;
            if (direction * mountainArray.get(mid) >= direction * targetValue) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return mountainArray.get(left) == targetValue ? left : -1;
    }
}