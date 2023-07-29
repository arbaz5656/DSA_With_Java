//public class Bitmanupulation {
//    public static void main(String[] args){
////        &
////        System.out.println(8 & 6);
////        |
////        System.out.println(5 | 6);
////        ^
////        System.out.println(5^6);
////        ~
////        System.out.println(~5);
////        <<
////        System.out.println(5<<3);
////        >>
////       System.out.println(6>>1);
//    }
//}

import java.util.Scanner;

//check if number is even or odd
//public class Bitmanupulation {
//    public static void evenodd(){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int n= obj.nextInt();
//        int bitmask=1;
//        if ((n & bitmask)==0){
//            System.out.println("Number is Even.");
//        }
//        else{
//            System.out.println("Number is odd.");
//        }
//
//    }
//    public static void main(String[] args){
//        evenodd();
//
//    }
//}


//operations
//Get ith bit
//public class Bitmanupulation {
//public static void main(int n,int i){
//    int bitmask=1<<i;
//    if ((n & bitmask)==0){
//        System.out.println("ith bit is:"+0);
//    }
//    else {
//        System.out.println("ith bit is:"+1);
//    }
//}
//public static void main(String[] args){
//    main(15,2);
//}
//
//}

//set ith bit
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int n=10;
//        int i=2;
//        int bitmask=1<<i;
//        System.out.println(n | bitmask);
//
//    }
//}

//clear ith bit
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int n=10;
//        int i=1;
//        int bitmask=~(1<<i);
//        System.out.println(n & bitmask);
//    }
//}

//public class Bitmanupulation {
//    public static void main(String[] args){
//        int n=10;
//        int i=2;
//        int newbit=0;
//        if (newbit==0){
//            System.out.println(n & ~(1<<i));
//        }
//        else {
//            System.out.println(n | (1<<i));
//        }
//    }
//}

//clear last i bit
//public class Bitmanupulation {
//    public static int clearlastbit(int n,int i){
//        int bitmask=-1<<i;
//        return n & bitmask;
//    }
//    public static void main(String[] args ){
//        System.out.println(clearlastbit(15,2));
//    }
//}


//clear range of bits
//public class Bitmanupulation {
//    public static int clearrange(int n,int i,int j){
//        int a=~0<<(j+1);
//        int b=(1<<i)-1;
//        int bitmask=a|b;
//        return n & bitmask;
//    }
//    public static void main(String[] args){
//
//        System.out.println(clearrange(10,2,4));
//
//    }
//}


//check if number is power is 2 or not
//public class Bitmanupulation {
//    public static boolean power2(int n){
//        return (n &(n-1))==0;
//    }
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number:");
//        int n=obj.nextInt();
//        System.out.println(power2(n));
//
//    }
//}


//count set bits of number
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int count =0;
//        int n=15;
//        while (n>0){
//            if ((n & 1)!=0){
//                count++;
//            }
//            n=n>>1;
//        }
//        System.out.println(count);
//    }
//}


//fast Exponention
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int ans=1;
//        int n=5;
//        int a=3;
//        while (n>0){
//            if ((n&1)!=0){
//                ans=ans*a;
//            }
//            a=a*a;
//            n=n>>1;
//        }
//        System.out.println(ans);
//    }
//}

//Q1
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int x=10;
//        System.out.println(x^x);
//    }
//
//}

//Q2 swap two number without using third variable
//using xor
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int a=5;
//        int b=10;
//        a=a^b;
//        b=a^b;
//        a=a^b;
//        System.out.println("A is:"+a+" B is:"+b);
//    }
//}

//normally
//public class Bitmanupulation {
//    public static void main(String[] args){
//        int a=5;
//        int b=10;
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("A is:"+a+" B is:"+b);
//    }
//}

//Q.4
//public class Bitmanupulation {
//    public static void main(String [] args){
//        for (char i='A';i<='Z';i++){
//            System.out.print((char) (i | ' '));
//        }
//    }
//}