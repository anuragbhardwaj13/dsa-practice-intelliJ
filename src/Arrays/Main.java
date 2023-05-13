package Arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//    MyArray numbers=new MyArray(5);
////    numbers.insert(10);
////    numbers.insert(20);
////    numbers.insert(30);
////    numbers.insert(40);
////    numbers.insert(50);
////    System.out.println(numbers);
////        System.out.println(numbers.indexOf(30));
//      int[] arr=new int[]{ 10,20,30,40,50,9};
//        System.out.println(checkSorted(arr));
//    int[] nums=new int[]{3,2,2,1,3};
//        System.out.println(singleNum(nums));

//        int[] nums=new int[]{2,7,11,15,12,9};
//        int[] res=twoSum(nums,11);
//        for(int i:res){
//            System.out.println(i);
//        }

//        int[] nums=new int[]{2,0,2,1,1,0};
//        sortColors(nums);
//        for(int i:nums){
//            System.out.print(i+" ");
//        }


//        int[] nums=new int[]{1,2,3,4,5,6};
//        System.out.println(nums[6-3+1]);
//        leftRotateBy1(nums);
//        for(int i:nums){
//            System.out.print(i+" ");
//        }

//        int[] nums=new int[]{15, 12, 0, 0, 0, 2, 2 ,19 ,6 ,17, 16, 20, 0 ,2 ,16 ,0 ,10, 0, 14, 15};
//        pushZerosToEnd(nums,20);
//                for(int i:nums){
//            System.out.print(i+" ");
//        }

//        int[] a=new int[]{1,2,3,4,5,6};
//        int[] b=new int[]{1,4,5,6,7};
//        System.out.println(findUnion(a,b,a.length,b.length));

//        printIsosceles(4);

//        int[] a=new int[]{3,1,3,3,2};
//        int size=5;
//        System.out.println(majorityElement(a,size));

//        int[] nums=new int[]{1,2,34,3,5,4,21};
//        System.out.println(longestConsecutive(nums));

//        int[] nums=new int[]{1,2,3};
//        int k=3;
//        System.out.println(subarraySum(nums,k));

//        int r=5;
//        System.out.println(generate(5));
//        System.out.println(nthRowOfPascalTriangle(r));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        System.out.println(subarraysXor(list,4));
    }


    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> row,pre=null;
        for(int i=0;i<numRows;i++){
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(pre.get(j-1)+pre.get(j));
                }

            }
            pre=row;
            result.add(row);
        }
        return result;
    }

    public static ArrayList<Long> nthRowOfPascalTriangle(int numRows) {
        // code here
        ArrayList<ArrayList<Long>> result=new ArrayList<>();
        ArrayList<Long> row,pre=null;
        for(int i=0;i<numRows;i++){
            row=new ArrayList<Long>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add((long)1);
                }else{
                    row.add((long)(pre.get(j-1)+pre.get(j)));
                }

            }
            pre=row;
            result.add(row);
        }
        return result.get(numRows-1);
    }
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int start=0,end=0;
        int n=nums.length;
        int count=0;
        while(end<n&&start<n){
            sum+=nums[end];
            if(sum<k){
                end++;
            }
            else if(sum>k){
                while(sum>k) {
                    sum -= nums[start];
                    start++;
                }
                end++;

            }else if(sum==k){
                count++;
                sum-=nums[start];
                start++;
                end++;
            }
        }
        return count;
    }
    public static int longestConsecutive(int[] nums) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for (int i:nums){
            set.add(i);

        }
        int i=0;
        while(i<nums.length){
            int num=nums[i];
            if(set.contains(num-1)){
                i++;
            }else{
                while(set.contains(num++)){
                    count++;
                }
            }
            i++;
        }
        return count;
    }
    public static int[] findDifferenceArray(int N,int A[])
    {
        int[] res=new int[N];
        for(int i=0;i<N;i++){
            res[i]=(minLeft(A,i)-minRight(A,i));
        }
        return res;
    }
    public static int minLeft(int[] arr,int in){
        if(in==0){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<in;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public static int minRight(int[] arr,int in){
        if(in==arr.length-1){
            return 0;
        }
        int min=Integer.MAX_VALUE;
        for(int i=in+1;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public static int majorityElement(int a[], int size)
    {
        // your code here
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<size;i++){
            if(i>0&&a[i]>a[i-1]){
                count=0;
            }
            count++;
            if(count>size/2){
                return a[i];
            }

        }
        return -1;
    }
    public static boolean checkSorted(int[] arr){
        int i=0;
        boolean ifYes=true;
        while(i<arr.length-1) {
            if (arr[i] < arr[i + 1]) {
                System.out.println(arr[i]);
                ifYes = true;
                i++;
            } else {
                ifYes = false;
                System.out.println(arr[i]);
                break;
            }

        }
        return ifYes;
    }
    public static int singleNum(int[] nums){
        int res=nums[0];
        for(int i =1;i<nums.length;i++){
            res=res^nums[i];
            System.out.println(res);
        }
        return res;
    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int targetSum=target-nums[i];
            if(map.containsKey(targetSum)){
                return new int[]{map.get(targetSum),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};

    }

    public static void sortColors(int[] nums){
        int low=0;
        int mid=0;
        int high=nums.length-1;
        int temp=0;
        while(mid<=high){
            //if 0 throw in left
            if(nums[mid]==0){
                //swap(nums[low],nums[mid]);
                temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                //swap(nums[mid],nums[high]);
                temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void leftRotateBy1(int[] arr){
        int left=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            arr[i]=left;
        }
    }

    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
       int j=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
           if(arr[i]==0){
               j=i;
               break;
           }
        }
       for(int i=j+1;i<n;i++){
           if(arr[i]!=0){
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               j++;
           }
       }
    }
    public static ArrayList<Integer> findUnion(int a[], int b[], int m, int n)
    {
        // add your code here
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<m&&j<n){
            if(a[i]<=b[j]){
                if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }

        while(i<m){
            if(list.isEmpty() || list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        while(j<n){
            if(list.isEmpty() || list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();

        int i=0;
        int j=0;
        int m=nums1.length;
        int n=nums2.length;
        while(i<m&&j<n){
            if(nums1[i]==nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i]<nums2[j]) {
                i++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }
        }
        int[] res=new int[set.size()];
        int index=0;
        for (int num:set){
            res[index++]=num;
        }
        return res;
    }
    public static void printIsosceles(int n){
        int space=0;
        int star=n*2-1;
        for(int row=0;row<n;row++){
            for(int i=0;i<space;i++){
                System.out.print(" ");
            }
            space+=1;
            for(int i=star;i>0;i--){
                System.out.print("*");
            }
            star-=2;
            System.out.println();
        }
    }
    public static int subarraysXor(ArrayList<Integer> A, int B) {
        // Write your code here.
        HashMap<Integer,Integer> visited = new HashMap<Integer,Integer>();
        int c = 0;
        int cpx = 0;
        int n = A.size();
        for(int i = 0;i<n;i++) {
            cpx = cpx ^ A.get(i);
            if(visited.get(cpx^B) != null)
                c += visited.get(cpx ^ B);
            if(cpx == B) {
                c++;
            }
            if(visited.get(cpx) != null)
                visited.put(cpx, visited.get(cpx) + 1);
            else
                visited.put(cpx, 1);
        }
        return c;
    }
}

