class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] arr = new int[intervals.length][2];

        int index = 0;

        arr[0][0] = intervals[0][0];
        arr[0][1] = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= arr[index][1]) {

                arr[index][1] = Math.max(arr[index][1], intervals[i][1]);

            } else {

                index++;

                arr[index][0] = intervals[i][0];
                arr[index][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(arr, index + 1);
    }
}