//Bubble sort
//public class Sortingalgorithm {
//    public static void bubblesrot(int arr[]){
//        for (int turn=0;turn<arr.length-1;turn++){
//            for (int j=0;j<arr.length-1-turn;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//
//    }
//    public static void printsort(int arr[]){
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println();
//    }
//    public static void main(String[] args){
//        int arr[]={4,5,1,3,2};
//        bubblesrot(arr);
//        printsort(arr);
//
//
//
//    }
//}


//selection sort

//public class Sortingalgorithm {
//    public static void Selectionsort(int arr[]){
//        for (int i=0;i<arr.length-1;i++){
//            int minpos=i;
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[minpos]>arr[j]){
//                    minpos=j;
//                }
//            }
//            int temp=arr[minpos];
//            arr[minpos]=arr[i];
//            arr[i]=temp;
//        }
//    }
//    public static void print(int arr[]){
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args){
//        int arr[]={5,4,1,3,2};
//        Selectionsort(arr);
//        print(arr);
//    }
//}


//public class Sortingalgorithm {
//    public static void Insertionsort(int arr[]){
//        for (int i=1;i< arr.length;i++){
//            int current=arr[i];
//            int previous=i-1;
//            while (previous >=0 && arr[previous] >current){
//                arr[previous+1]=arr[previous];
//                previous--;
//            }
//            arr[previous+1]=current;
//        }
//    }
//    public static void print(int arr[]){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i] +" ");
//        }
//    }
//    public static void main(String[] args){
//        int arr[]={5,4,1,3,2};
//        Insertionsort(arr);
//        print(arr);
//
//    }
//}




//Practice of sorting
public class Sortingalgorithm {

//    Bubble Sort
    //    public static void Bubblesort(int arr[]){
//        for (int i=0;i< arr.length-1;i++){
//            for (int j=0;j< arr.length-1-i;j++){
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//    }

//    Selection Sort
//    public static void Selectionsort(int arr[]){
//        for (int i=0;i< arr.length-1;i++){
//            int min=i;
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[min]>arr[j]){
//                    min=j;
//                }
//            }
//            int temp=arr[min];
//            arr[min]=arr[i];
//            arr[i]=temp;
//        }
//    }

//    Insertion Sort Desending order
//    public static void Insertionsort(int arr[]){
//        for (int i=1;i< arr.length;i++){
//            int curr=arr[i];
//            int prev=i-1;
//            while (prev>=0 && arr[prev]<curr){
//                arr[prev+1]=arr[prev];
//                prev--;
//            }
//            arr[prev+1]=curr;
//        }
//
//    }
//    public static void print(int arr[]){
//        for (int i=0;i< arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args){
//        int arr[]={3,6,2,1,8,7,4,5,3,1};
////        Bubblesort(arr);
////        Selectionsort(arr);
//        Insertionsort(arr);
//        print(arr);
//
//
//    }
//}