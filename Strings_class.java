//import java.util.Scanner;

//public class Strings_class {
//    public static void main(String[] args){
//declare string in 2 ways
//        String st="Shaikh";
//        System.out.print(st);
//        String str=new String(" Arbaz");
//        System.out.println(str);
//
//User to input string
//        Scanner obj=new Scanner(System.in);
////        String stri=obj.next();
//        String stri=obj.nextLine();
//        System.out.println(stri);

// count lenght of string
//          String s="Shaikh Arbaz";
//        System.out.println(s.length());

//    }
//}

//
//public class Strings_class {
//    public static void stringloop(){
//        String str="Apple is a fruit";
////        indexig of string
////        System.out.println(str.charAt(0));
//
//        for (int i=0;i<str.length();i++){
//            System.out.println(str.charAt(i));
//        }
//    }
//    public static void main(String[] args){
//        stringloop();
//    }
//}


//Palindrom
//public class Strings_class {
//    public static boolean palindrom(){
////        not plindrom string
////        String pal="arbaz";
////        palindrom string
//        String pal="racecar";
//        int n=pal.length();
//        for (int i=0;i<n/2;i++){
//            if (pal.charAt(i) == pal.charAt(n-1-i)){
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        System.out.println(palindrom());
//
//    }
//}


//Rout(E,W,S,N)
//public class Strings_class {
//    public static float smallestrout(String str){
//        int x=0;
//        int y=0;
//        for (int i=0;i<str.length();i++){
//            char dir=str.charAt(i);
//            if (dir == 'N'){
//                y++;
//            }
//            else if (dir =='S') {
//                y--;
//            } else if (dir=='W') {
//                x--;
//            }
//            else if (dir=='E'){
//                x++;
//            }
//        }
//        int X2=x*x;
//        int Y2=y*y;
//        return (float) Math.sqrt(X2+Y2);
//
//
//    }
//    public static void main(String[] args){
//        String str="WNEENESENNN";
////        String str="NNN";
//
//        System.out.println(smallestrout(str));
//    }
//}

//
////Substring
//public class Strings_class {
//    public static String Substring( String str,int ss,int es){
//        String sum="";
//        for (int i=ss;i<es;i++){
//            sum=sum+str.charAt(i);
//        }
//
//        return sum ;
//    }
//    public static void main(String[] args){
//        String str="Helloworld";
////        System.out.println(str.substring(0,4));
////        System.out.println(Substring(str,0,4));
//    }
//}

//
//public class Strings_class {
//    public static void main(String[] args){
//        String name[]={"khan","ansari","Shaikh"};
////        String name[]={"apple","mango","banana"};
//        String largest=name[0];
//        for (int i=1;i<name.length;i++){
//            if (largest.compareToIgnoreCase(name[i])<0) {
//                largest = name[i];
//            }
//        }
//        System.out.println(largest);
//    }
//}

//Stringbuilder
//public class Strings_class {
//    public static void main(String []args){
//        StringBuilder obj=new StringBuilder("");
//        for (char i='s';i<='z';i++){
//            obj.append(i);
//        }
//        System.out.println(obj);
//    }
//}

//conver first letter to Upper case
//public class Strings_class {
//    public static String Uppercase(String str){
//        StringBuilder obj=new StringBuilder("");
//        char ch=Character.toUpperCase(str.charAt(0));
//        obj.append(ch);
//        System.out.println(ch);
//        for (int i=1;i<str.length();i++){
//            if (str.charAt(i)==' ' && i<str.length()-1){
//                obj.append(str.charAt(i));
//                i++;
//                obj.append(Character.toUpperCase(str.charAt(i)));
//            }
//            else {
//                obj.append(str.charAt(i));
//            }
//        }
//
//        return obj.toString();
//
//
//    }
//    public static void main(String[] args ){
//        String str="my name is shaikh arbaz.";
//        System.out.println(Uppercase(str));
//
//    }
//}


//compresion of string
//public class Strings_class {
//    public static String Compresion(String str) {
//        String newstring="";
//        for (int i=0;i<str.length();i++)
//        {
//            Integer count=1;
//            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
//                count++;
//                i++;
//            }
//            newstring=newstring+str.charAt(i);
//            if (count>1){
//                newstring=newstring+count.toString();
//
//            }
//        }
//    return newstring;
//    }
//    public static void main(String[] args){
//        String str="abcd";
//        System.out.println(Compresion(str));
//
//    }
//}

//Q.1
//import java.util.Scanner;
//
//public class Strings_class {
//    public static void vowel(){
//        System.out.println("Enter your String:");
//        String str=new Scanner(System.in).next();
//        int count=0;
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
//                count++;
//            }
//        }
//        System.out.println("Count of vovel:"+count);
//
//    }
//    public static void main(String[] args){
//        vowel();
//
//
//    }
//}

//Q.2
