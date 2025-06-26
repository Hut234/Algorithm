class Solution {

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        long start = -10000000000L;
        long end = 10000000000L;
         while(start <= end) {
            long mid = (start + end) / 2;
            if(count(mid, nums1, nums2) >= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static long count(long standard, int[] nums1, int[] nums2) {
        long count = 0;
        for (int x : nums1) {
            if (x > 0) {
                long target = standard < 0  && standard % x != 0 ? standard / x - 1 : standard / x;
                count += upperBoundary(target, nums2) + 1;
            } else if (x < 0) {
                long target = standard < 0  && standard % x != 0 ? standard / x + 1 : standard / x;
                count += nums2.length - lowerBoundary(target, nums2);
            } else if (standard >= 0) {
                count += nums2.length;
            }
        }
        return count;
    }
    
    public static int upperBoundary(long standard, int[] nums2) {
        int start = 0, end = nums2.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums2[mid] <= standard) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }


    public static int lowerBoundary(long standard, int[] nums2) {
        int start = 0, end = nums2.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums2[mid] >= standard) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}