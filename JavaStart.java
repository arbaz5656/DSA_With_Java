//import java.util.*;
//public class JavaStart {
//    public static void print(String name){
//        System.out.println(name);
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        print(name);
//    }
//}

//public class JavaStart {
//    public static void main(String[] args) {
//        float va = 28.8F;
//        System.out.println(va);
//        int vb = 8 + (int) 28.9F;
//        System.out.println(vb);
//    }
//}

//public class JavaStart {
//    public static void Func(int a,int b,int c){
//        if (a > b){
//            if (a > c){
//                System.out.println(a);
//            }
//            else {
//                System.out.println(c);
//            }
//        }
//        else {
//            if (b>c){
//                System.out.println(b);
//            }
//            else {
//                System.out.println(c);
//            }
//            }
//
//        }
//
//    public static void main(String[] args){
//        Func(2,8,9);
//
//    }
//}


//public class JavaStart {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//swap the value using the 3rd variable
//public class JavaStart {
//    public static void main(String[] args){
//        int a=10;
//        int b=5;
//        int temp=a;
//            a=b;
//            b=temp;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//    }
//}

//swap the value whitout using the 3rd variable
//public class JavaStart {
//    public static void main(String[] args){
//        int a=5;
//        int b=10;
//        System.out.println("intial a:"+a);
//        System.out.println("intial b:"+b);
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//    }
//}

//*****
//*   *
//*   *
//*   *
//*****
//import java.util.*;
//public class JavaStart {
//    public static void main(String [] args){
//        for (int i=1;i<=5;i++){
//            for (int j=1;j<=5;j++){
//                if (i==1 || j==1 || i==5 || j==5){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//*****
//****
//***
//**
//*
//public class JavaStart {
//    public static void main(String[] args) {
//        for (int i=5;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//12345
//1234
//123
//12
//1
//public class JavaStart {
//    public static void main(String[] args){
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}


//start learning Arrays
//min:1
//max:12
////min max withouth inbuild function
//public class JavaStart {
//    public static void maxmin(int arr[]){
//        int min=arr[0];
//        int max=arr[0];
//        if(arr==null || arr.length==0){
//            return;
//        }
//        for (int i=0;i<=arr.length-1;i++){
//            if (arr[i] < min){
//                min=arr[i];
//            }
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println("min:"+min);
//        System.out.println("max:"+max);
//
//    }
//    public static void main(String[] args){
//        int arr[]={2,8,12,9,1};
//        maxmin(arr);
//    }
//}

//min max using inbuild method Arrays
//import java.util.Arrays;
//public class JavaStart {
//    public static void minmaxusinginbuidfunction(int arr[],int n){
//        Arrays.sort(arr);
//        int min=arr[0];
//        int max=arr[n-1];
//        System.out.println("Min:"+min);
//        System.out.println("Max:"+max);
//    }
//    public static void main(String[] args){
//        int arr[]={2,8,12,9,1};
//        int n= arr.length;
//        minmaxusinginbuidfunction(arr,n);
//    }
//}

//Reverse the Array
//public class JavaStart {
//    public static void reverse(int arr[],int n){
//        for (int i= arr.length-1;i>=0;i--){
//            System.out.print(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={2,7,1,9,3};
//        int n= arr.length;
//        reverse(arr,n);
//    }
//}

//reverse the array in 2nd method
//public class JavaStart {
//    public static void reverse(int arr[],int n){
//        int f=0;
//        int l=arr.length-1;
//        while (f<l){
//            int temp=arr[l];
//            arr[l]=arr[f];
//            arr[f]=temp;
//            f++;
//            l--;
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={2,4,1,3,9,5};
//        int n=arr.length;
//        reverse(arr,n);
//        for (int i=0;i<=n-1;i++){
//            System.out.println(arr[i]);
//        }
//    }
//}


//sum all the array number
//public class JavaStart {
//    public static void sum_all_array_number(int arr[],int n){
//        int initial=0;
//        for (int i=0;i<=n-1;i++){
//            initial=initial+arr[i];
//        }
//        System.out.println(initial);
//    }
//
//    public static void main(String[] args) {
//        int arr[]={2,4,8,10};
//        int n= arr.length;
//        sum_all_array_number(arr,n);
//
//    }
//}

//check duplicate
//import java.util.Arrays;
//public class JavaStart {
//    public static boolean duplicate(int arr[],int n){
//        Arrays.sort(arr);
//        for (int i=0;i<=arr.length-1;i++){
//            if(arr[i]==arr[i+1]){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        int arr[]={1,2,2,3};
//        int n= arr.length;
//        System.out.println(duplicate(arr,n));
//    }
//}


//Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
//Output: 7
//
//public class JavaStart {
//    public static int  kth_smallest(int arr[],int K){
//        return arr[K-1];
//    }
//
//    public static void main(String[] args) {
//        int arr[]={7,2,3,8,1};
//        int K = 3;
//        System.out.println(kth_smallest(arr,K));
//    }
//}

//
//public class JavaStart {
//    public static int  kth_smallest(int arr[],int K){
//        return arr[K+1];
//    }
//
//    public static void main(String[] args) {
//        int arr[]={3,2,1,5,6,4};
//        int K = 2;
//        System.out.println(kth_smallest(arr,K));
//    }
//}

//find even and odd
//public class JavaStart {
//    public static void main(String[] args) {
//        int n=10;
//        if (n%2==0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("Odd");
//        }
//    }
//}

//c
// heck wether number is prime or not
//public class JavaStart {
//    public static void main(String[] args) {
//        int num=10;
//        int count=0;
//        for (int i=1;i<=num;i++){
//            if(num%i==0){
//                count++;
//            }
//        }
//        if (count==2){
//            System.out.println("p");
//        }
//        else {
//            System.out.println("not p");
//        }
//    }
//}
//
//public class JavaStart {
//    public static void main(String[] args) {
//        int n=5;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j=i;j>=1;j--){
//                System.out.print(j);
//            }
//            for (int j=2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}
//
//public class JavaStart {
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for (int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
//
//public class JavaStart {
//    public static void name() {
//        int count=1;
//        if(count<=10){
//            System.out.println("arbaz");
//            count++;
//            main(null);
//        }
//    }
//    public static void main(String[] args) {
//        name();
//    }
//}

//REverse the number
//public class JavaStart {
//    public static void main(String[] args) {
//        int n=565628;
//        int rev=0;
//        for (int i=0;i<=n;i++){
//           int last_digit=n%10;
//            System.out.print(last_digit);
//           n=n/10;
//        }
//        System.out.println();
//    }
//}

//factorail
//import java.util.Scanner;
//public class JavaStart {
//    public static void main(String[] args) {
//        Scanner obj=new Scanner(System.in);
//        System.out.println("enter the number:");
//        int n= obj.nextInt();
//        int m=1;
//        for (int i=1;i<=n;i++){
//                m=i*m;
//        }
//        System.out.println(m);
//    }
//}

//public class JavaStart{
//    public static void main(String[] args){
//        int n=1234;
//        int sum=0;
//        while (n>0){
//            int last_digit=n%10;
//            sum=sum+last_digit;
//            n=n/10;
//        }
//        System.out.println(sum);
//    }
//}

//Bubble sort
//public class JavaStart {
//    public static void Bsort(int arr[],int n){
//        for (int i=0;i<n-1;i++){
//            for (int j=0;j<n-1-i;j++)
//            if ((arr[j]>arr[j+1])){
//                int temp=arr[j];
//                arr[j]=arr[j+1];
//                arr[j+1]=temp;
//            }
//        }
//    }
//
//    public static void print(int arr[]) {
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={5,3,4,1,2};
//        int n=arr.length;
//        Bsort(arr,n);
//        print(arr);
//
//    }
//}
//
//simple access loop
//public class JavaStart {
//    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5};
//        System.out.println(arr.length);
//        for (int i=1;i<= arr.length-2;i++){
//            System.out.print(arr[i]);
//        }
//    }
//}

//Selection Sort
//public class JavaStart {
//    public static void Selectionsort(int arr[]){
//        for (int i=0;i< arr.length-1;i++){
//            int min=i;
//            for (int j=i+1;j< arr.length;j++){
//                if(arr[min] > arr[j]) {
//                    min = j;
//                }
//            }
//                int temp=arr[min];
//                arr[min]=arr[i];
//                arr[i]=temp;
//        }
//    }
//    public static void print(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={5,3,4,1,2};
//        int n= arr.length;
//        Selectionsort(arr);
//        print(arr);
//    }
//}


//insertion sort
//public class JavaStart {
//    public static void Insertion_sort(int arr[]){
//        for (int i=1;i< arr.length;i++){
//            int curr=arr[i];
//            int prev=i-1;
//            while (prev >=0 && arr[prev]>curr ){
//                arr[prev+1]=arr[prev];
//                prev--;
//            }
//            arr[prev+1]=curr;
//        }
//    }
//
//    public static void print(int arr[]) {
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        int arr[]={5,4,1,3,2};
//        Insertion_sort(arr);
//        print(arr);
//
//    }
//}

//String start
//Find palindrom or not
//public class JavaStart {
//    public static boolean Palindrom(String str) {
//        int n=str.length();
//        for (int i=0;i<str.length()/2;i++){
//
//            if (str.charAt(i) != str.charAt(n-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void print(String str) {
//        for (int i=0;i<str.length();i++){
//            System.out.print(str.charAt(i)+" ");
//        }
//    }
//    public static void main(String[] args) {
//        String str=new String("raccar");
////        String str="pppppo";
//        System.out.println(Palindrom(str));
//        print(str);
//    }
//}

//import java.util.*;
//public class JavaStart {
//    public static float find_shortes_direction(String str) {
//        int x=0;
//        int y=0;
//        for (int i=0;i<str.length();i++){
//            char direction=str.charAt(i);
//            if(direction == 'N'){
//                y++;
//            }
//            else if (direction == 'E'){
//                x++;
//            }
//            else if(direction == 'S'){
//                y--;
//            }else if(direction == 'W'){
//                x--;
//            }
//        }
//        int x2=x*x;
//        int y2=y*y;
//        return (float) Math.sqrt(x2+y2);
//    }
//    public static void main(String[] args) {
//        String str="WNEENESENNN";
//        System.out.println(find_shortes_direction(str));
//    }
//}

//equal
//public class JavaStart {
//    public static void main(String[] args) {
//        String fisrt="arbaz";
//        String second="arbaz";
//        String thired=new String("arbaz0");
//
//        if (thired.equals(second)){
//            System.out.println("equal");
//        }
//        else {
//            System.out.println("not equal");
//        }
//
//    }
//}


// substring
//public class JavaStart {
//    public static void main(String[] args) {
//        String str="hello world";
//        String b=str.substring(1,3);
//        System.out.println(b);
//    }
//}

//Tocamoare
//public class JavaStart {
//    public static void main(String[] args) {
////        String arr[]={"apple","mango","banana"};
//        String arr[]={"Khan","Ansari","Shaikh"};
//        String large=arr[0];
//        for (int i=1;i<arr.length;i++){
//            if(large.compareTo(arr[i])<0){
//                large=arr[i];
//            }
//        }
//        System.out.println(large);
//
//    }
//}

//public class JavaStart {
//    public static void main(String[] args) {
//        String str="arbaz";
//        System.out.println( str.toUpperCase());
//        System.out.println(str);
//        char ch=Character.toUpperCase(str.charAt(0));
//        System.out.println(ch);
////        String builder
//        StringBuilder st=new StringBuilder(str);
//
//        System.out.println(st);
//
//
//    }
//}
//

//convert first letter to upper case
//public class JavaStart {
//    public static String programmeupercase(String str) {
//        StringBuilder strB=new StringBuilder("");
//        char ch=Character.toUpperCase(str.charAt(0));
//        strB.append(ch);
//        for (int i=1;i<str.length();i++){
//            if (str.charAt(i) == ' ' && i<str.length()-1){
//                strB.append(str.charAt(i));
//                i++;
//                strB.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else {
//                strB.append(str.charAt(i));
//            }
//        }
//        return strB.toString();
//
//    }
//    public static void main(String[] args) {
//        String str=new String("hello world       ");
//        System.out.println(programmeupercase(str));
//    }
//}

////StringBuffer
//public class JavaStart {
//    public static void Reversethestring(String str) {
//        StringBuilder strBu=new StringBuilder("");
//        for (int i=0;i<str.length();i++){
//            strBu.append(str.charAt(i));
//        }
//        strBu.reverse();
//        System.out.println(strBu);
//    }
//    public static void main(String[] args) {
//        String str=new String("arbaz");
//        Reversethestring(str);
//    }
//}

//import java.util.Scanner;
//
//public class JavaStart {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n=sc.nextInt();
//        int count=1;
//        for (int i=1;i<=n;i++){
//            count=i*count;
//        }
//        System.out.println(count);
//    }
//}

//public class JavaStart {
//    public static void main(String[] args) {
//        int n=10;
//        int a=0;
//        int b=1;
//        for (int i=0;i<n;i++){
//            System.out.println(a);
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//
//    }
//}
//write a code to get sum of two matrices
//public class JavaStart {
//    public static void print_2D_array(int farr2D[][],int sarr2D[][],int sum[][]) {
//        for (int i=0;i< farr2D.length;i++){
//            for (int j=0;j< sarr2D[0].length;j++){
//                sum[i][j]=farr2D[i][j]+sarr2D[i][j];
//                System.out.print(sum[i][j]);
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int farr2D[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int sarr2D[][]={{1,2,3},{4,5,6},{7,8,9}};
//        int sum[][]=new int[3][3];
//        print_2D_array(farr2D,sarr2D,sum);
//    }
//}

//check if a number is even or odd
//public class JavaStart {
//    public static void main(String[] args) {
//        int n=24;
//        if (n%2==0){
//            System.out.println("number is even");
//        }
//        else {
//            System.out.println("number is odd");
//        }
//    }
//}

