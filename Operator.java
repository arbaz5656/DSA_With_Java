//public class Operator {
//    public static void main(String[] args) {
//        int a1 = 1;
//        a1++;
//        System.out.println(a1);
//
//
//        int q = 9;
//        int p = 2;
//        int modulus = q % p;
//        System.out.println(modulus);
//    }
//}


//Logical Operator
//public class Operator {
//    public static void main(String[] args){
//
//        System.out.println(5<7 && 4>3) ;
//    }
//}

//assignment operator
//public class Operator {
//    public static void main(String[] args){
//        int a=5;
////        a=a+5;
//        a+=5;
//        System.out.println(a);
//    }
//}


//Q.1
//public class Operator{
//    public static void main(String[] args){
//        int x = 2, y = 5;
//        int exp1 = (x * y / x);
//        int exp2 = (x * (y / x));
//        System.out.println(exp1 );
//        System.out.print(exp2);
//    }
//}
// Answer is: 5 And 4


//Q.2
//public class Operator {
//    public static void main(String[] args) {
//        int x = 200, y = 50, z = 100;
//        if (x > y && y > z) {
//            System.out.println("Hello");
//        }
//        if (z > y && z < x) {
//            System.out.println("Java");
//        }
//        if ((y + 200) < x && (y + 150) < z) {
//            System.out.println("Hello Java");
//        }
//    }
//}

//Answer is: Java

//Q.3
//public class Operator {
//    public static void main(String[] args){
//        int x, y, z;
//        x = y = z = 2;
//        x += y;
//        y -= z;
//        z /= (x + y);
//        System.out.println(x + " " + y + " " + z);
//    }
//}
//Answer is:4, 0,0

//float me convert karne k baad z
//public class Operator {
//    public static void main(String[] args){
//        int x, y;
//        float z;
//        x = y  = 2;
//        z=2;
//        x += y;
//        y -= z;
////        z /= (x + y);
//        z=z/(x+y);
//        System.out.println(x + " " + y + " " + z);
//    }
//}

//
//public class Operator {
//    public static void main(String[] args){
//        int x = 9, y = 12;
//        int a = 2, b = 4, c = 6;
//        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
//        System.out.println(exp);
//    }
//}
//first periority is () and 2nd is *
//43+234+1
//Answer is : 278

//Q.5
public class Operator {
    public static void main(String[] args){
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
}

//first periorty is () and 2nd is / and 3rd is *
//exp1-5*2+2=20
//exp2-5*2+5*2=20
//Answer is: 20,20


