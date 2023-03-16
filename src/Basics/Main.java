package Basics;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DecimalToBinary(30));
//        var starttime= System.nanoTime();
//        System.out.println("Is odd ? : "+evenOddDecimal(7));
//        var endtime=System.nanoTime();
//        var timetaken=endtime-starttime;
//        var timetakeninMiliSeconds= TimeUnit.MICROSECONDS.convert(timetaken, TimeUnit.NANOSECONDS);
//        System.out.println("Time Taken by Decimal "+timetakeninMiliSeconds);
//
//        starttime= System.nanoTime();
//        System.out.println("Is odd ? : "+evenOddBit(7));
//        endtime=System.nanoTime();
//        timetaken=endtime-starttime;
//        timetakeninMiliSeconds= TimeUnit.MICROSECONDS.convert(timetaken, TimeUnit.NANOSECONDS);
//        System.out.println("Time Taken by Bit "+timetakeninMiliSeconds);

//        System.out.println(NumberOf1_bits(11));

//        System.out.println(5^5);

//        System.out.println(DecimalToBinary_bits(10));

//        System.out.println(rev(-120));
//        System.out.println(powerOfTwo(-4));
//        System.out.println(complimentOfBase10(5));
//        System.out.println(checkPrime(9));
        System.out.println(sieveOfEratosthenes(15));
    }


    public static int sieveOfEratosthenes(int n){
        boolean[] primes=new boolean[n+1];
        // make all element true
        Arrays.fill(primes,true);
        //mark 0 and 1
        primes[0]=false;
        primes[1]=false;
        int count=0;
        for(int i=2;i<n;i++){
            if(primes[i]){
                count++;
//                System.out.println(i);
                for(int j=2*i;j<n;j=j+i){
                    primes[j]=false;
                }
            }
        }
        return count;
    }

    public static boolean checkPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int complimentOfBase10(int n){
        int num=n;
        int mask=0;
        while(num!=0){
            mask=mask<<1|1;
            num=num>>1;

        }
        return (~n&mask);
    }

    public static boolean powerOfTwo(int n){
//        if(NumberOf1_bits(n)==1){
//            return true;
//        }else return false;
        if(n<0){
            return false;
        }
        while(n!=0){
            int lb=n&1;
            n=n>>1;
            if(lb==1&&n!=0){
                return false;
            }


        }
        return true;
    }
    public static int rev(int n){
        int res=0;

        while(n!=0){
        int lastDigit=n%10;
if(res<Integer.MIN_VALUE/10||res>Integer.MAX_VALUE/10){
    return 0;
}
        res=res*10+lastDigit;

        n=n/10;
        }
        return res;
    }
    public static int NumberOf1(int n){
        int count=0;
        String binary="11111111111111111111111111111101";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static int NumberOf1_bits(int n){
        int count=0;
        while (n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static String DecimalToBinary(int n){
        String res="";
        while(n>0){
            int rem=n%2;
            n=n/2;
            res=rem+res;
        }
        return res;

    }
    public static String DecimalToBinary_bits(int n){
        String res="";
        while(n!=0){
            res=(n&1)+res;
            n=n>>1;
        }
        return res;
    }
    public static boolean evenOddDecimal(int n){
        if(n%2!=0){
            return true;
        }
        return false;
    }
    public static boolean evenOddBit(int n){
        if((n&1)==1){
            return true;
        }
        return false;
    }
    
}