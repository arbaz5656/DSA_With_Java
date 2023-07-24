
//create 2D Array and print
//import java.util.Scanner;
//
//public class Array2D {
//    public static void main(String[] args){
//        int arr2D[][]=new int[4][3];
//        int n=arr2D.length;
//        int m=arr2D[0].length;
//        System.out.println(n);
//        System.out.println(m);
//        Scanner obj=new Scanner(System.in);
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                arr2D [i][j]=obj.nextInt();
//            }
//        }
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr2D[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//}


//Search an element in an 2DArray
//
//import java.util.Scanner;
//
//public class Array2D {
//    public static boolean Search(int arr2D [] [], int key){
//        for (int i=0;i<arr2D.length;i++){
//            for (int j=0; j<arr2D[0].length; j++){
//                if (arr2D[i][j]==key){
//                    System.out.println("Key Found index:i="+i+",j="+j);
//                    return true;
//                }
//            }
//        }
//        System.out.println("Key not found.");
//        return false;
//
//    }
//
//    public static void main(String[] args){
//        int arr2D[][]=new int[4][3];
//        int n=arr2D.length;
//        int m=arr2D[0].length;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the 2D array Value: ");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                arr2D [i][j]=obj.nextInt();
//            }
//        }
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr2D[i][j]+ " ");
//            }
//            System.out.println();
//        }
//
//        Search(arr2D,6);
//    }
//}

//public static boolean Search(int arr2D [] [], int key){
//        for (int i=0;i<arr2D.length;i++){
//            for (int j=0; j<arr2D[0].length; j++){
//                if (arr2D[i][j]==key){
//                    System.out.println("Key Found index:i="+i+",j="+j);
//                    return true;
//                }
//            }
//        }
//        System.out.println("Key not found.");
//        return false;
//
//    }
//
//    public static void main(String[] args){
//        int arr2D[][]=new int[4][3];
//        int n=arr2D.length;
//        int m=arr2D[0].length;
//        Scanner obj=new Scanner(System.in);
//        System.out.print("Enter the 2D array Value: ");
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                arr2D [i][j]=obj.nextInt();
//            }
//        }
//
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.print(arr2D[i][j]+ " ");
//            }
//            System.out.println();
//        }
//
//        Search(arr2D,6);
//    }
//}

//print simple 2D array
//public class Array2D {
//    public static void printsimple2Darrys(int arr2[][]){
//        for (int i=0;i<arr2.length;i++){
//            for (int j=0;j<arr2[0].length;j++){
//                System.out.print(arr2[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args){
//        int arr2[][]={{1,2,3},
//                {4,5,6},{7,8,9}};
//        printsimple2Darrys(arr2);
//
//    }
//}

// 2D array using Spiral
//
//public class Array2D {
//    public static void Spiral(int arr2[][]){
//        int startcolumn=0;
//        int startrow=0;
//        int endcolumn=arr2.length-1;
//        int endrow=arr2[0].length-1;
//            while (startcolumn<=endcolumn &&startrow<=endrow){
//                for (int j=startcolumn;j<=endcolumn;j++){
//                    System.out.print(arr2[startrow][j]+" ");
//                }
//                for (int i=startrow+1;i<=endcolumn;i++){
//                    System.out.print(arr2[i][endcolumn]+" ");
//                }
//                for (int j=endcolumn-1;j>=startcolumn;j--){
//                    if (startrow==endrow) {
//                        break;
//                    }
//                    System.out.print(arr2[endrow][j]+" ");
//                }
//                for (int i=endrow-1;i>=startrow+1;i--){
//                    if (startcolumn==endcolumn) {
//                        break;
//                    }
//                    System.out.print(arr2[i][startcolumn]+" ");
//                }
//
//                startcolumn++;
//                startrow++;
//                endcolumn--;
//                endrow--;
//
//            }
//        System.out.println();
//    }
//
//
//    public static void main(String[] args){
//        int arr2[][]={{1,2,3,4},
//                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        Spiral(arr2);
//
//    }
//}

// Sum of daignol Element
//public class Array2D {
//    public static int daignoal(int arr[][]){
////        Complexity of big o(n^2)
////        int sum=0;
////        for (int i=0;i<arr.length;i++){
////            for (int j=0;j<arr[0].length;j++){
////                if (i==j){
////                    sum+=arr[i][j];
////                }
////                if (i+j==arr.length-1){
////                    sum+=arr[i][j];
////                }
////            }
////        }
////        return sum;
//
//
////        Complexity of big o(n)
////        int sum=0;
////        for (int i=0;i< arr.length;i++){
////            sum=sum+arr[i][i];
//////            System.out.println(sum+">>>>"+arr[i][i]);
////            if (i != arr.length-1-i)  //i+j=n-1; j=n-1-i; (j=arr.length-1-i;)
////            {
////                sum=sum+arr[i][arr.length-1-i];
////            }
////        }
////        return sum;
//    }
//    public static void main(String [] args){
//        int arr[][]={{1,2,3,4},
//                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        System.out.println(daignoal(arr));
//    }
//}


//Search in Sorted Matrix
//public class Array2D {
//    public static boolean search(int arr[][],int key){
//        int i=0;
//        int j=arr.length-1;
//        while (i<arr.length && j>=0){
//            if (key==arr[i][j]){
//                System.out.println("key Found at: "+i+"&"+j+" index");
//                return true;
//            }
//            else if (key<arr[i][j]) {
//                j--;
//            }
//            else {
//                i++;
//            }
//        }
//        System.out.println("Key not found");
//        return false;
//    }
//    public static void main(String[] args){
//        int arr[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
//        search(arr,100);
//
//    }
//}

//Q.1
//public class Array2D {
//    public static void Q1(int arr[][]){
//        int intiatl=0;
//        for (int i=0;i<arr.length;i++){
//            for (int j=0;j<arr[0].length;j++){
//                if (arr[i][j]==7){
//                    intiatl++;
//                }
//            }
//        }
//        System.out.println("7 is number of time:"+intiatl);
//    }
//
//    public static void main(String[] args){
//        int arr[][]={{4,7,8},{8,8,7}};
//        Q1(arr);
//
//    }
//}

//Q.2
//public class Array2D {
//    public static void main(String [] args){
//        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
//        int sum=0;
//            for (int j=0;j< arr[0].length;j++){
//                sum+=arr[1][j];
////                System.out.println(arr[1][j]);
//            }
//        System.out.println(sum);
//    }
//}

//Q.3
//Transposition of matrix

//public class Array2D {
//    public static void trasposition(int arr[][]) {
//        int row = 2;
//        int column = 3;
//        int transpose[][] = new int[column][row];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                transpose[j][i] = arr[i][j];
////                System.out.println(transpose+" "+arr[i][j]);
//                System.out.println(transpose[j][i]);
//            }
//
//        }
//
//    }
//    public static void main(String [] args){
//        int arr[][]={{1,2,3},{9,8,7}};
//        trasposition(arr);
//    }
//
//}