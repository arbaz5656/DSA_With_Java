//Function
//public class Function {
//    public static void swap(){
//        int temp=0;
//        int a=5;
//        int b=10;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
//    }
//    public static void main(String[] args){
//        swap();
//    }
//}

//Function Argument And Swap
//public class Function {
//    public static void Swap(int a,int b){
//        int temp=0;
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("Value A:"+a+" Value B: "+b);
//
//    }
//    public static void main(String[] args){
//        Swap(5,10);
//    }
//}


//Function Argument And Swap varible value without using Third variable
//public class Function {
//    public static void Swap(int a,int b){
//        a=a+b;
//        b=a-b;
//        a=a-b;
//        System.out.println("Value A:" + a +" Value B: "+b);
//    }
//    public static void main(String[] args){
//        Swap(5,10);
//    }
//}
//

//Factorial of a number
//
//import java.util.Scanner;
//
//public class Function {
//    public static int factorial(int number){
//        int f=1;
//        for (int i=1;i<=number;i++){
//            f*=i;
////            System.out.println(i);
//             }
//        return f;
//    }
//    public static void main(String[] args){
//        Scanner obj= new Scanner(System.in);
//        System.out.print("Enter the Number:");
//        int number= obj.nextInt();
//        System.out.println(factorial(number));
//
//    }
//}


//Binomial coeficient
//public class Function {
//    public static int factorial(int number){
//        int f=1;
//        for (int i=1;i<=number;i++){
//            f*=i;
////            System.out.println(i);
//             }
//        return f;
//    }
//    public static int binomail(int n,int r){
//        int f_n=factorial(n);
//        int f_r=factorial(r);
//        int f_nmr=factorial(n-r);
//        int binomail =f_n/(f_r*f_nmr);
//        return binomail;
//        }
//
//    public static void main(String[] args){
//        System.out.println(binomail(5,2));
//    }
//}


////Fuction overloading
//public class Function {
//    public static int func(int a,int b){
//        return a+b;
//    }
//    public static int func(int a,int b, int c){
//        return a+b+c;
//    }
//    public static void main(String[] args){
//        System.out.println(func(9,8));
//        System.out.println(func(5,5,3));
//    }
//}


////Fuction overloading with using data type
//public class Function {
//    public static int func(int a,int b){
//        return a+b;
//    }
//    public static float func(int a,float b, int c){
//        return a+b+c;
//    }
//    public static void main(String[] args){
//        System.out.println(func(9,8));
//        System.out.println(func(5,5.6f,3));
//    }
//}


//Prime Number or not
//
//public class Function {
//    public static void prime(){
//        int n=8;
//        int p=0;
//        for (int i=2;i<n-1;i++){
//            if (n%i==0){
//                p++;
//            }
//            System.out.println(p);
//        }
//        if (p==0){
//            System.out.println("prime");
//        }
//        else {
//            System.out.println("not prime");
//        }
//    }
//    public static void main(String[] args){
//        prime();
//    }
//}

//
//print 1 to 100 prime number
//public class Function {
//    public static void primeprint( int n){
//
//        int temp=0;
//        for (int i=1;i<=n;i++){
//            for (int j=2;j<=i-1;j++){
//                if (i%j==0) {
//                    temp++;
//
//                }
//            }
//            if (temp==0){
//                System.out.println(i);
//            }
//            else {
//                temp=0;
//            }
//
//        }
//
//
//    }
//    public static void main(String[] args) {
//        primeprint(100);
//
//    }
//}


//Q.1
// Write a Java method to compute the average of three numbers..
//public class Function {
//    public static int averagenumber(int a,int b, int c){
//        int d=(a+b+c)/3;
//        return d;
//    }
//    public static void main(String[] args){
//        System.out.println(averagenumber(3,3,3));
//
//    }
//}

//Q.2

//import java.util.Scanner;
//
//public class Function {
//    public static void evenodd(){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the Number: ");
//        int num= obj.nextInt();
//        if (num%2==0){
//            System.out.println("even");
//        }
//        else {
//            System.out.println("odd");
//        }
//    }
//    public static void main(String[] args){
//        evenodd();
//
//
//    }
//}

//Q.5
//Write a Java method to compute the sum of the digits in an integer.
public class Function {
    public static int sumofint(int n){
        int sumofdigit=0;
        while (n>0){
            int lastdigit=n%10;
            sumofdigit+=lastdigit;
            n/=10;
        }
        return sumofdigit;
    }
    public static void main(String[] args){
        System.out.println(sumofint(12345));

    }
}