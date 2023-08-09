
//print N number in decrising order using recursion
//public class Recursion {
//    public static void Decrising(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }
//        System.out.println(n);
//        Decrising(n-1);
//    }
//
//    public static void main(String[] args){
//        int n=10;
//        Decrising(n);
//    }
//}




//print N number in incrising order using recursion
//My logic
//public class Recursion {
//    public static void Incrising(int n){
//        if (n==10){
//            System.out.println(10);
//            return;
//        }
//        System.out.println(n);
//        Incrising(n+1);
//    }
//
//    public static void main(String[] args){
//        int n=1;
//        Incrising(n);
//    }
//}
//



//print N number in incrising order using recursion
// Apna college logic
//public class Recursion {
//    public static void incrising(int n){
//        if (n==1){
//            System.out.println(1);
//            return;
//        }
//        incrising(n-1);
//        System.out.println(n);
//
//    }
//
//    public static void main(String[] args){
//        int n=5;
//        incrising(n);
//    }
//}


//normal calculate factorial
//public class Recursion {
//    public static void main(String[] args) {
//        int n = 5;
//        int fac=1;
//        for (int i = 1; i <= n; i++) {
//            fac=fac*i;
//        }
//        System.out.println(f);
//    }
//}

//find factorial number of n using recursion
//public class Recursion {
//    public static int Factorial(int n){
//        if (n==0){
//            return 1;
//        }
//        Factorial(n-1);
//        int fn=n*Factorial(n-1);
//        return fn;
//    }
//    public static void main(String[] args){
//        int n=6;
//        System.out.println(Factorial(n));
//    }
//}


//sum of n natural number in normal
//public class Recursion {
//    public static void main(String[] args){
//        int n=5;
//        int sum=0;
//        for (int i=1;i<=n;i++){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//    }
//}


//Sum of N natural number using Recursion
//public class Recursion {
//    public static int natural_number(int n){
//        if (n==1){
//            return 1;
//        }
//        natural_number(n-1);
//        int sum=n + natural_number(n-1);
//        return sum;
//    }
//    public static void main(String[] args){
//        int n=6;
//        System.out.println(natural_number(n));
//    }
//}

//print Fibonachi number in normal
//public class Recursion {
//    public static void main(String [] args){
//        int n=5;
//        int a=0;
//        int b=1;
//        for (int i=0;i<=n;i++){
//            System.out.print(a+ " ");
//            int c=a+b;
//            a=b;
//            b=c;
//        }
//    }
//}

//check fibonaci of number nth term using Recursion
//public class Recursion {
//    public static int Fibonaci(int n){
//        if (n==0 || n==1){
//            return n;
//        }
//        int fib1= Fibonaci(n-1);
//        int fib2= Fibonaci(n-2);
//        int fn=fib1+fib2;
//        return fn;
//
//    }
//    public static void main(String[] args){
//        int n=7;
//        System.out.println(Fibonaci(n));
//
//    }
//}


//If array is sorted or not Normal
//public class Recursion {
//    public static void main(String[] args){
//        int array[]={1,2,3,6,5};
//        int n=array.length;
//        for (int i=0;i<n-1;i++){
//            if (array[i]<=array[i+1]){
//                System.out.println("Array is sorted.");
//            }
//            else {
//                System.out.println("Array is not sorted.");
//            }
//        }
//    }
//}


//If array is sorted or not Using Recursion
//public class Recursion {
//    public static boolean Sortedarr(int array[],int i) {
//        if (i== array.length-1){   //agar sirf array me 1 value rahi to true return karega.
//            return true;
//        }
//        if (array[i]>array[i+1]){
//                return false;
//        }
//        return Sortedarr(array,i+1);
//    }
//    public static void main(String[] args){
//        int array[]={1,2,3,4,5};
//        System.out.println(Sortedarr(array,0));
//
//    }
//}

//
////first occorance using recursion
//public class Recursion{
//    public static int first_Occorance(int arr[],int key,int i) {
//        if (i==arr.length ){
//            return -1;
//        }
//
//            if (arr[i] == key) {
//                return i;
//            }
//            return first_Occorance(arr, key, i+1 );
//        }
//        public static void main (String[]args){
//        int arr[]={2,5,6,8,9,0,4,2};
//            System.out.println(first_Occorance(arr,8,0));
//
//        }
//    }



//Last occorance using recursion
//public class Recursion{
//    public static int last_Occorance(int arr[],int key,int i) {
//        if (i==arr.length ){
//            return -1;
//        }
//        int isFound=last_Occorance(arr, key, i+1 );
//        if ( isFound==-1 && arr[i] == key) {
//            return i;
//        }
//        return isFound;
//    }
//    public static void main (String[]args){
//        int arr[]={6,2,5,6,8,9,0,4,2};
//        System.out.println(last_Occorance(arr,6,0));
//
//    }
//}

//
////Power of x^n
//public class Recursion {
//    public static int power(int x,int n){
//        if (n==0){
//            return 1;
//
//        }
//        return x *power(x,n-1);
//
//    }
//    public static void main(String[] args){
//        System.out.println(power(2,5));
//
//    }
//}



//Power of x^n
//public class Recursion {
//    public static int power(int x,int n){
//        if (n==0){
//            return 1;
//        }
////        even
//        int half=power(x,n/2);
//        int halfsqure=half*half;
////        odd
//        if (n%2 != 0){
//            halfsqure=2*half*half;
//
//        }
//        return halfsqure;
//
//    }
//    public static void main(String[] args){
//        System.out.println(power(2,5));
//
//    }
//}


//Tiling problem
//public class Recursion {
//    public static int TileingProblem(int n){
//        if (n==0 || n==1){
//            return 1;
//        }
//        int fnm1=TileingProblem(n-1);
//        int fnm2=TileingProblem(n-2);
//
//        int Totalways=fnm1+fnm2;
//        return Totalways;
//
//
//    }
//    public static void main(String[] args){
//        System.out.println(TileingProblem(4));
//    }
//}


//Remove duplicate In a string recursion
//public class Recursion {
//    public static void Dpulicate(String str,int index,StringBuilder newstr,boolean map[]){
////        base
//        if (index== str.length() ){
//            System.out.println(newstr);
//            return;
//        }
////        Kaam
//        char ch= str.charAt(index);
//        if (map[ch-'a'] == true){
////            Duplicate
//            Dpulicate(str,index+1,newstr,map);
//        }else {
//        map[ch-'a']=true;
//        Dpulicate(str,index+1,newstr.append(ch),map);
//    }}
//    public static void main(String[] args){
//        String str="shaikharbaz";
//        Dpulicate(str,0,new StringBuilder(""),new boolean[26]);
//    }
//}


//Friends pairing Problem
//public class Recursion {
//    public static int Friendspairing(int n){
////        base
//        if (n==1 || n==2){
//            return n;
//        }
//
////        kaam
//        int fnm1=Friendspairing(n-1);
//        int fnm2=Friendspairing(n-2);
//
////        inner function call
//        int totalways=fnm1+(n-1)*fnm2;
//        return totalways;
//
//    }
//
//    public static void main(String[] args){
//        System.out.println(Friendspairing(4));
//
//    }
//}

//Binary string
//public class Recursion {
//    public static void BinaryString(int n,int Lastplace,String str){
////        Base case
//        if (n==0){
//            System.out.println(str);
//            return;
//        }
////        kaam
//        BinaryString(n-1,0,str+"0");
//        if (Lastplace==0){
//            BinaryString(n-1,1,str+"1");
//        }
//    }
//    public static void main(String[] args){
//        BinaryString(3,0,"");
//
//    }
//}


//Q.1
//public class Recursion {
//    public static void   findinteger(int arr[],int key,int i){
//        if (i==arr.length){
//            return;
//        }
//
//        if (arr[i]==key){
//            System.out.print( i+" ");
//        }
//        findinteger(arr,key,i+1);
//
//    }
//    public static void main(String[] args){
//        int arr[]={3,2,4,5,6,2,7,2,2};
//        findinteger(arr,2,0);
//
//    }
//}


//Q.2
//public class Recursion {
//    static String words[]={"Zero","one","two","three","four","Five","Six","seven","Eight","Nine"};
//    public static void printdigits(int number){
//        if (number==0){
//            return;
//        }
//        int lastdigit=number%10; //4
//        printdigits(number/10);   //123
//        System.out.print(words[lastdigit]+" ");  //lastdigit is index 1 then print One
//
//    }
//    public static void main(String[] args){
//        printdigits(1234);
//
//    }
//}

//Q.3

//public class Recursion {
//    public static int length(String str){
//        if (0==str.length()){
//            return 0;
//        }
////        char ch=str.charAt(i);
////        System.out.print(ch);
//        return length(str.substring(1))+1;  //new portion start
//
//    }
//    public static void main(String[] args){
//        String str="Arbaz";
//        System.out.println(length(str));
//    }
//}
