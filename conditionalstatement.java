//if else
//public class conditionalstatement {
//    public static void main(String[] args){
//        int a=9;
//        int b=4;
//        if (a>b){
//            System.out.println("largest number."+a);
//        }
//        else {
//            System.out.println("smallest number."+b);
//        }
//
//    }
//}


//number is e
//import java.util.Scanner;
//public class conditionalstatement {
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number to check number is even or odd: ");
//        int var=obj.nextInt();
//        if (var%2==0){
//            System.out.println("The number is Even.");
//        }
//        else {
//            System.out.println("The number is odd.");
//        }
//    }
//}


import java.util.Scanner;

//if else and else_if
//licence validation system
//public class conditionalstatement {
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter your Age: ");
//        int var= obj.nextInt();
//        if (18 >=var || 100<=var){
//            System.out.println("Sorry...........\nyou are not Eligible for licence,complete your age and expire.");
//        }
//        else if (18<=var ) {
//            System.out.println("you Are Eligible for licence.");
//            }
//        else {
//            System.out.println("Envalid Age!");
//        }
//    }
//}


//
////income tax calculator
//public class conditionalstatement {
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter your income: ");
//        int income=obj.nextInt();
//        int tax;
//        if (income < 500000){
//            tax=0;
//        }
//        else if (income>500000 && income<1000000){
//            System.out.println("you tax pay 20%.");
//            tax= (int) (income*0.2);
//
//        }
//        else {
//            System.out.println("you pay tax 30%.");
//            tax=(int) (income*0.3);
//        }
//        System.out.println("Your tax is :"+tax);
//    }
//}

//ternary operator
//public class conditionalstatement {
//    public static void main(String[] args){
//        int i=2;
//        String type=((i%2!=0)?"odd":"even");
//        System.out.println(type);
//    }
//}


//Q.1
//Write a Java program to get a number from the user and print whether it is
//positive or negative.
//public class conditionalstatement {
//    public static void main(String[] args ){
//        int i=1;
//        if (i>0){
//            System.out.println("Number is positive.");
//        }
//        else {
//            System.out.println("Number is Negative.");
//        }
//    }
//}


//Q.2
//Finish the following code so that it prints You have a fever if your temperature
//        is above 100 and otherwise prints You don't have a fever.
//public class conditionalstatement {
//    public static void main(String[] args){
//        double temp = 103.5;
//        if (temp>100){
//            System.out.println("you Have a fever.");
//        }
//        else {
//            System.out.println("you dont have afever.");
//        }
//    }
//}


//Q.3
//Write a Java program to input week number(1-7) and print day of week name
//        using switch case.
//public class conditionalstatement {
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int week_number= obj.nextInt();
//        switch (week_number){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thusday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Enter correct number:");
//
//        }
//    }
//}


//Q.4
//What will be the value of x & y in the following program:
//public class conditionalstatement {
//    public static void main(String args[]) {
//        int a = 63, b = 36;
//        boolean x = (a < b ) ? true : false;
//        int y= (a > b ) ? a : b;
//        System.out.println(x+" " +y);
//    }
//}
//Answer is : x=fals, y=63.

//Q.5
//leap year calculator
//public class conditionalstatement {
//    public static void main(String[] args){
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the year to Check its leap year or Not: ");
//        int year=obj.nextInt();
//        if ((year%100==0 && year%400==0) || year%100!=0 && year%4==0){
//            System.out.println("Leap year");
//        }
//        else {
//            System.out.println("Not a leap year");
//        }
//
//    }
//}