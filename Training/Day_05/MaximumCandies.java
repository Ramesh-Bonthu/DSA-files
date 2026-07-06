package Training.Day_05;

import java.util.*;

class MaximumCandies {

    public static int maximumCandies(int[] candies, int k) {

        int n = candies.length;
        Arrays.sort(candies);

        int l = candies[0];
        int r = candies[0];

        for (int i = 1; i < n; i++) {
            r += candies[i];
        }

        int max = r;
        int ans = 0;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (mid * k > max) {
                r = mid - 1;
            } else {

                if (isSafe(candies, k, mid)) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }

        return ans;
    }

    public static Boolean isSafe(int[] candies, int k, int cand) {

        int i = search(candies, cand);
        int n = candies.length;

        int anum = k - (n - i);

        if (anum <= 0)
            return true;

        return false;
    }

    public static int search(int[] candies, int tar) {

        int st = 0;
        int en = candies.length;
        int ans = 0;

        while (st < en) {

            int mid = st + (en - st) / 2;

            if (candies[mid] >= tar) {
                ans = mid;
                en = mid;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] candies = {8};
        int k = 3;
        System.out.println(maximumCandies(candies, k));
    }
}