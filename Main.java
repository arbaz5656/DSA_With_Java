public class Main {

//    linear search number found out function 1
    //    public static int linearsearch(int[] lis, int key){
//        for (int i=0;i < lis.length;i++){
//            if (lis[i]==key){
//                return i;
//            }
//        }
//
//        return -1;
//    }

//Hw is not proper run
//    public  static void linearhw(String[] ar, String key){
//        for (int i=0;i<ar.length;i++){
//            if (ar[i]==key){
//                return i;
//            }
//        }
//        return key;
//    }

//    min max
//    public static int apnacollegeminmax(int [] array1){
//        int max=Integer.MIN_VALUE;
//        int min=Integer.MAX_VALUE;
//        for (int i=0;i<array1.length;i++){
//            if (max<array1[i]){
//                max=array1[i];
//            }
//            if (min>array1[i]){
//                min=array1[i];
//            }
//        }
//        System.out.println(min);
//        return max;
////    }

//    binary binarysearch using for loop
//    public static int binarysearch(int[] arr,int key){
//        int start=0;
//        int end=arr.length;
//        for (int i=0;i<end;i++) {
//            int mid = (start + end) / 2;
//            if (arr[mid]==key){
//                return mid;
//            }
//            else if (arr[mid]<key){
//                start=mid+1;
//            }
//            else  {
//                end=mid-1;
//            }
//        }
//        return -1;
//    }
//Pairs in array
//
//    public static void pairsinarray(int[] arr ){
//        int totalpair=0;
//        for (int i=0;i< arr.length;i++){
//            int current=arr[i];
//            for (int j=i+1;j< arr.length;j++) {
//                System.out.print("(" + current + "," + arr[j] + ")");
//                totalpair++;
//            }
//            System.out.println();
//        }
//        System.out.println("Total Pair: "+totalpair);
//    }


//    public static void subarray(int[] arr){
//        int subarray=0;
//        for (int i=0;i<arr.length;i++) {
//            int start=i;
//            for (int j = i; j < arr.length; j++)
//            {
//                int end=j;
//                for (int k = i; k <= j; k++) {
////                    System.out.print("("+arr[k]+","+arr[j]+")");
//                    System.out.print(arr[k]+" ");
//                }
//                subarray++;
//                System.out.println();
//                 }
//            System.out.println();
//            }
//        System.out.println("subarray :"+subarray);
//    }

    public static void main(String[] args)
    {
        System.out.println("Hello world!");

//
//checking only normal array
//                int [] arr =new int[6];
//                arr[0]=0;
//                arr[1]=1;
//                arr[2]=2;
//                arr[3]=3;
//                arr[4]=4;
//                arr[5]=5;
//
//                for (int i=0;i<arr.length;i++){
//                    System.out.println(arr[i]);
//                }
//linear search of an array found number .1
//int lis[]={2, 4, 6, 8, 10, 12};
//int key=10;
//int v=linearsearch(lis,key);
//if (v==-1){
//    System.out.println("Not found");
//}
//else {
//    System.out.println( "Key found in " + v +" index.");
//}



//Hw is not proper run
//
//        String[] ar={"apple","banana","oranage","chiku"};
//        String key="orange";
//        String v1=linearhw(ar,key);
//        if (v1== -1){
//            System.out.println("Result not found");
//        }
//        else
//        {
//            System.out.println("Find :" +v1);
//        }

//minmaxby apna college
//        int[] array1={1,2,4,7,3,9,6};
//        int varaible=apnacollegeminmax(array1);
//        System.out.println(varaible);
//

//        binary binarysearch using for loop
//        int[] arr={3,6,9,12,15,18,21};
//        int key=21;
//
//        int varaible=binarysearch(arr,key);
//        System.out.println(varaible);


//Pairs in array
//          int[] arr={4,5,6,7,8,9};
//          pairsinarray(arr);
//
//            int[] arr={2,4,6,8,10};
//            subarray(arr);

    }
}
