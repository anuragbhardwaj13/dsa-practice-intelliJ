package SlidingWindow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(300);
//        list.add(40);
//        list.add(100);
//        int n=5;
//        int k=2;
//        System.out.println(maximumSumSubarray(k,list,n));

        int[] arr = new int[]{1, 2,1,3};
        int K = 2;
        int N = arr.length;
        System.out.println(lenOfLongSubarr(arr, N, K));
    }

    public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here
        long maxSum = Integer.MIN_VALUE;
        long sum = 0;
        int i = 0;
        for (int j = 0; j < N; j++) {
            sum += (long) Arr.get(j);
            if (j - i + 1 == K) {
                maxSum = Math.max(sum, maxSum);
                sum = sum - Arr.get(i);
                i++;
            }
        }
        return maxSum;
    }

    public static int lenOfLongSubarr(int A[], int N, int K) {
        //Complete the function
        int start = 0;
        int end = 0;
        int len;
        int sum = 0;
        int maxLen = 0;
        while (end < N && start <= end) {
            sum += A[end];
            if (sum < K) {
                end++;
            } else if (sum == K) {
                maxLen = Math.max(end - start + 1, maxLen);
                sum-=A[start];
                end++;
                start++;
            }else if(sum>K){
                while(sum>K){
                    sum=sum-A[start];
                    start++;
                    if(sum==K){
                        maxLen=Math.max(end - start + 1,maxLen);
                    }
                }
                end++;

            }

        }
        return maxLen;
    }
}