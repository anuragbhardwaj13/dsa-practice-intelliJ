package Reccursion;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        System.out.println(sumOfN(3));
//        int[] arr=new int[]{1,2,3,4,5,6};
//        reverseArray(arr,0,arr.length-1);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
//
//        int[] arr=new int[]{3,1,2,4,5};
//        ArrayList<Integer> list=new ArrayList<>();
//        int count=0;
////        printSubSequence(arr,list,0,0,3);
//        boolean res=printOneSubSequenceWithSumK(arr,list,0,0,6);
//        System.out.println(res);
//double n=4;
//int r=-1;
//
//System.out.println(func(n,1,r,1));

//        int[] arr = new int[]{4,5,6,7,0,1,2};
//        int n= arr.length;
//        System.out.println(findMin(arr));
        int[] nums=new int[]{-228,-447,624,-914,-26,362,262,-770,-944,-548,159,-467,733,-441,-777,119,-945,-692,946,428,-593,-394,415,243,421,-118,-432,759,886,796,-532,-66,60,477,-244,144,-182,85,234,50,783,189,-280,-365,-180,-725,266,-77,-25,-668,413,-928,-633,-381,474,105,416,677,-367,-999,-958,199,480,-238,379,651,-930,-307,81,-455,-338,-684,-490,-9,-349,500,-662,407,555,-202,-57,-884,-392,303,753,754,-86,-726,539,711,686,-969,-643,-877,136,-140,-579,-936,-864,331,126,69,-736,-469,440,312,-372,-820,527,612,-350,22,697,42,-512,-409,735,-326,-239,-821,-644,-145,-934,-391,-713,-319,309,-834,-483,-743,267,311,89,887,15,-446,667,683,-485,437,-514,646,4,112,34,62,-428,-887,736,456,-784,760,-763,-922,-706,-360,663,921,-388,304,378,90,-926,-924,-172,359,462,507,-417,779,-897,436,377,-294,-41,-707,757,447,-4,-774,563,21,-844,990,635,59,51,-480,230,-390,898,582,313,866,-899,-383,232,-277,-503,947,-40,242,484,-663,956,772,722,-427,360,-476,790,-170,525,-652,-923,893,-661,-916,-639,-114,797,-837,873,-802,10,-741,219,511,523,543,-526,-137,-351,-437,33,-704,-571,150,-867,695,320,-468,673,-769,170,227,-203,983,-962,-241,-156,-559,952,974,-520,420,709,-344,110,-764,589,573,963,668,-404,475,452,-674,-461,319,909,788,302,396,30,-130,-377,-589,-64,86,-525,-591,979,128,-355,780,-331,-935,19,467,458,424,-761,-601,554,-160,-883,-895,223,87,-866,365,399,117,542,301,639,-69,-50,-771,-313,239,68,-978,308,-687,-950,-700,-965,855,404,220,-426,-305,-868,703,-846,-724,161,941,862,-882,347,-767,160,777,-656,-157,167,-421,823,-537,654,248,-632,-793,-953,258,-779,-105,-785,-216,614,-766,-647,-961,-139,929,894,-122,-804,414,-612,678,46,509,815,179,572,-21,-459,-599,810,-486,-184,116,-384,154,-111,-410,849,-992,273,-946,621,-502,-813,617,-323,578,2,259,-297,829,-539,743,690,-197,381,655,-745,-213,726,872,-717,295,122,-666,937,-748,-2,576,804,163,858,532,-221,-493,-431,660,799,-959,851,-786,841,-829,-931,149,-46,-583,-546,-551,-269,734,225,-735,-144,-913,-376,-231,-624,927,-848,-53,-191,-983,-554,403,518,-374,-605,-496,-727,-696,771,521,538,-826,-545,446,-242,547,685,361,896,-472,47,-183,-957,299,216,-501,672,385,181,491,-58,767,550,402,58,749,251,139,354,520,294,-345,-411,610,-102,-445,425,334,-159,300,375,-675,-912,-266,865,-941,704,676,982,-929,-549,-509,345,-742,665,247,-533,-634,-15,439,245,93,-273,557,-259,638,-971,-681,969,-695,781,836,-373,-622,-818,-201,450,986,-150,-136,-361,73,-547,913,-951,156,-433,371,811,111,412,564,-49,-947,-165,-733,-536,763,-142,-113,75,-406,-879,92};
        System.out.println(countOperationsToEmptyArray(nums));
    }
    public static int findMin(int[] arr) {
        int n=arr.length;
        int i=0;
        int j=n-1;
        //

        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int next=arr[(mid+1)%n];
            int prev=arr[(mid+n-1)%n];
            if(arr[mid]<=prev && arr[mid]<=next)
                return mid;

            if(arr[mid]<=arr[j])
            {
                j=mid-1;
            }
            else if(arr[mid]>=arr[i])
            {
                i=mid+1;
            }

        }
        return 0;
    }

    public static long countOperationsToEmptyArray(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            list.add(i);

        }
        long count=0;
        while(!list.isEmpty()){
            if(list.get(0)==Collections.min(list)){
                list.remove(list.get(0));
            }else{
                int curr=list.get(0);
                list.remove(0);
                list.add(curr);
            }
            count++;
        }
        return count;

    }
    public static boolean checkMin(ArrayList<Integer> list,int n){
        for(int i:list){
            if(n<i){
                return true;
            }
        }
        return false;
    }


    public static int findFirst(int[] arr, int k) {
        int res = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                res = mid;
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    public static int findLast(int[] arr, int k) {
        int res = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) {
                res = mid;
                low = mid + 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    public static int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else if (arr[mid] < arr[mid - 1]) {
                    high = mid - 1;
                }
            } else if (mid == 0) {
                if (arr[0] > arr[1]) {
                    return 0;
                } else {
                    return 1;
                }


            } else if (mid == n - 1) {
                if (arr[n - 1] > arr[n - 2]) {
                    return n - 1;
                } else {
                    return n - 2;
                }


            }


        }
        return 0;
    }


    public static double func(double n, int i, int r, double res) {

        if (i > r) {
            return res;
        }

        if (r < 0) {
            res = 1 / (res * n);
        } else {
            res = (res * n);
        }

        double result = func(n, i + 1, r, res);
        return result;
    }

    public static int sumOfN(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }

    public static void reverseArray(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;

        reverseArray(arr, low + 1, high - 1);
    }


    public static void printSubSequence(int[] arr, ArrayList<Integer> list, int index, int sum, int target) {
        if (index >= arr.length) {
            if (sum == target) {
                System.out.println(list);
            }
            return;
        }
        sum += arr[index];
        list.add(arr[index]);
        printSubSequence(arr, list, index + 1, sum, target);
        sum -= list.get(list.size() - 1);
        list.remove(list.size() - 1);
        printSubSequence(arr, list, index + 1, sum, target);
    }

    public static boolean printOneSubSequenceWithSumK(int[] arr, ArrayList<Integer> list, int index, int sum, int target) {
        if (index >= arr.length) {
            if (sum == target) {
                System.out.println(list);
                return true;
            } else return false;

        }
        sum += arr[index];
        list.add(arr[index]);
        if (printOneSubSequenceWithSumK(arr, list, index + 1, sum, target)) return true;
        sum -= list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if (printOneSubSequenceWithSumK(arr, list, index + 1, sum, target)) return true;
        return false;
    }
}
;