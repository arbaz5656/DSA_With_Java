

//Marge sort
//public class DivideConquer {
////      This loop Is print The array and Array is completely sorted.
//    public static void printarr( int arr[]){
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//
//    }
//    public static void divide(int arr[],int si,int ei){
////      Base Case
//        if (si >= ei){
//            return;
//        }
//
//        int mid=si+(ei-si)/2;  //(si+ei)/2
//        divide(arr,si,mid);  //left part devide
//        divide(arr,mid+1,ei);  //right part devide
//        conquer(arr,si,mid,ei);
//    }
//
////  Create temprary array to store
//    public static void conquer(int arr[],int si,int mid,int ei){
//        int temp[]=new int[ei-si+1];
//        int i=si; //Iterate for left part
//        int j=mid+1;  //Iterate for Right part
//        int k=0;   //Iterate for  temp array
//
//        while (i <=mid && j<=ei){
//            if(arr[i]<arr[j]){
//                temp[k]=arr[i];
//                i++;
//            }
//            else {
//                temp[k]=arr[j];
//                j++;
//            }
//            k++;
//        }
////      kuch bache hue part k liye loop
//        while (i<=mid){
//            temp[k++]=arr[i++];
//        }
//        while (j<= ei){
//            temp[k++]=arr[j++];
//        }
////      copy karenge temp array se original array me
//        for (k=0,i=si;k<temp.length;k++,i++){
//            arr[i]=temp[k];
//        }
//
//    }
//    public static void main(String[] args){
//        int arr[]={6,3,9,5,2,8};
//        divide(arr,0,arr.length-1);
//        printarr(arr);
//
//
//    }
//}


//Quick sort
public class DivideConquer {
    public static void printarr(int arr[]){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quicksort(int arr[],int si,int ei){
//        Base Case
        if (si>ei){
            return;
        }
//        ye pivot nikale hai . or pivot means jiske support pe pura array ghoomta hai
        int pivotindex=partition(arr,si,ei);
//        ye sort kar k de raha hai
        quicksort(arr,si,pivotindex-1); //left side
        quicksort(arr,pivotindex+1,ei); //right side
    }
    public static int partition(int arr[],int si,int ei){
        int pivot =arr[ei]; //ye last eliment ko pivot baanye
        int i=si-1; // means i=-1

        for (int j=si;j<ei;j++){
            if (arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
        }
//         yaha pe apne log pivot ko sahi jagha dalenge
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args){
        int arr[]={6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
//        printarr(arr);
    }
}