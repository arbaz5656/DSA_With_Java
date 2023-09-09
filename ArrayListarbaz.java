import java.util.ArrayList;
//public class ArrayListarbaz {
//    public static void main(String[] args){
//        ArrayList<Integer> v1= new ArrayList<>();
//        v1.add(1);
//        v1.add(2);
//        v1.add(3);
//        v1.add(4);
//        System.out.println(v1);
//        int element=v1.get(3);
//        System.out.println(element);
//
//        int rem= v1.remove(1);
//        System.out.println(rem);
//        System.out.println(v1);
//        int set= v1.set(0,1);
//        int set1= v1.set(1,2);
//        int set2= v1.set(2,3);
////        int set3= v1.set(3,4);
//
////        System.out.println(set);
//        System.out.println(v1);
//        boolean v2=v1.contains(3);
//        boolean v3=v1.contains(7);
//        System.out.println(v2);
//        System.out.println(v3);
//        v1.add(0,0);
//        System.out.println(v1);
//        int v5=v1.get(3);
//        System.out.println(v5);
//
//
//    }
//}
//

//public class ArrayListarbaz {
//    public static void main(String[] args){
////        Operations
//        ArrayList<String> fruite= new ArrayList<>();
//        fruite.add("apple");
//        fruite.add("banana");
//        fruite.add("orange");
//        fruite.add("pomegranate");
//        System.out.println(fruite);
//        System.out.println(fruite.get(3));
//        System.out.println(fruite.remove(3));
//        System.out.println(fruite);
//        System.out.println(fruite.set(1,"carrot"));
//        System.out.println(fruite);
//        System.out.println(fruite.contains("orange"));
//        System.out.println(fruite.contains("pomegrante"));
////        Method Size insted of lenght
//        int size=fruite.size();
//        System.out.println(size);
//        for (int i=0;i<fruite.size();i++){
//            System.out.println(fruite.get(i));
//        }
//        System.out.println();
////        reverse
//        for (int i=fruite.size()-1;i>=0;i--){
//            System.out.println(fruite.get(i));
//        }
//        System.out.println();
//    }
// }
//

//Practice the same reverse operation in array
//public class ArrayListarbaz {
//    public static void main(String[] args){
//        int arr[]=new int[5];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=4;
//        arr[4]=5;
//        System.out.println(arr[3]);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
////        revers the array
//        for (int i=arr.length-1;i>=0;i--){
//            System.out.print(arr[i] +" ");
//
//
//        }
//        System.out.println();
//
//
//    }
//}

//find maximum and minimum in arraylist

//public class ArrayListarbaz {
//    public static void main(String[] args){
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);
//        list.add(3);
//        list.add(6);
//        int max=Integer.MIN_VALUE;
//        for (int i=0;i<list.size();i++){
//            if(max<list.get(i)){
//                max=list.get(i);
//            }
//        }
//        System.out.println(max);
//        int min=Integer.MAX_VALUE;
//        for (int i=0;i<list.size();i++){
//            if(min>list.get(i)){
//                min=list.get(i);
//            }
//        }
//        System.out.println(min);
//    }
//}
//

//
////        swap
//        System.out.println(list);
////        int a= list.get(1);
////        System.out.println(a);
////        int b= list.get(3);
//                int temp= list.get(1);
//                list.set(1,list.get(3));
//                list.set(3,temp);
//                System.out.println(list);

//Swap 2 number
//public class ArrayListarbaz {
//    public static void swap(ArrayList<Integer> var){
//        int temp=var.get(1);
//        var.set(1,var.get(3));
//        var.set(3,temp);
//
//    }
//    public static void main(String[] args){
//        ArrayList<Integer> var=new ArrayList<>();
//        var.add(2);
//        var.add(5);
//        var.add(9);
//        var.add(3);
//        var.add(6);
//        System.out.println(var);
//        swap(var);
//        System.out.println(var);
//    }
//}

//reverse an Arraylist
//import java.util.Collections;
//public class ArrayListarbaz {
//    public static void main(String[] args){
//        ArrayList<Integer> var=new ArrayList<>();
//        var.add(2);
//        var.add(5);
//        var.add(9);
//        var.add(3);
//        var.add(6);
//        System.out.println(var);
//        Collections.sort(var);
//        System.out.println(var);
//        Collections.sort(var,Collections.reverseOrder());
//        System.out.println(var);
//
//    }
//}

//multi-dimentional Array
//public class ArrayListarbaz {
//    public static void main(String[] args){
//        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
//        ArrayList<Integer> list1= new ArrayList<>();
//        ArrayList<Integer> list2= new ArrayList<>();
//        ArrayList<Integer> list3= new ArrayList<>();
//        for (int i=1;i<=5;i++){
//            list1.add(i*1);
//            list2.add(i*2);
//            list3.add(i*3);
//        }
//        main.add(list1);
//        main.add(list2);
//        main.add(list3);
//        list3.remove(3);
//        list3.remove(1);
//        System.out.println(main);
//        for (int i=0;i<main.size();i++) {
//            ArrayList<Integer> current = main.get(i);
//            for (int j = 0; j <current.size(); j++) {
//                System.out.print(current.get(j) + " ");
//            }
//
//            System.out.println();
//        }
////        System.out.println(main);
//    }
//}


//Pair sum 1
//public class ArrayListarbaz {
//    public static boolean pairsum1(ArrayList<Integer> list,int T){
//        for (int i=0;i<list.size();i++){
//            for (int j=i+1;j<list.size();j++){
//                if (list.get(i)+list.get(j)==T){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        ArrayList<Integer> list =new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(pairsum1(list,30));
//    }
//}


//pair sum approch with 2 pointer
//public class ArrayListarbaz {
//    public static boolean pairsum1(ArrayList<Integer> list,int T){
//        int lp=0;
//        int rp=list.size()-1;
//        for (int i=0;i<list.size();i++){
//                if (list.get(lp)+list.get(rp)==T){
//                    return true;
//                }
//                else if (list.get(lp)+list.get(rp)>T) {
//                    rp--;
//                }
//                else if (list.get(lp)+list.get(rp)<T) {
//                    lp++;
//                }
//        }
//
//        return false;
//    }
//    public static void main(String[] args){
//        ArrayList<Integer> list =new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        System.out.println(pairsum1(list,50));
//    }
//}


//Monotonic ArrayList
//public class ArrayListarbaz {
//    public static  boolean isMonotonic(ArrayList<Integer> A) {
//        boolean inc = true;
//        boolean dec = true;
//        for (int i=0; i<A.size()-1; i++) {
//            if (A.get(i) > A.get(i+1))
//                inc = false;
//            if (A.get(i) < A.get(i+1))
//                dec = false;
//        }
//        return inc || dec;
//    }
//    public static void main(String[] args){
//        ArrayList<Integer> A= new ArrayList<>();
//        A.add(1);
//        A.add(2);
//        A.add(2);
//        A.add(3);
//        System.out.println(isMonotonic(A));
//        System.out.println(A);
//
//    }
//
//}