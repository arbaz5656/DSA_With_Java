import java.util.*;
//min-max alogrithm using
//public class Array {
//    public static void minmax(int [] arr){
//        int min=arr[0];
//        int max=arr[0];
//        if (arr==null || arr.length==0){
//            return;
//        }
//        for(int i=1;i<arr.length;i++){
//            if (arr[i]<min){
//                min=arr[i];
//            }
//            if (arr[i]>max) {
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Maximum"+ max);
//        System.out.println("Minimum"+ min);
//    }
//
//    public static void main(String[] args){
//        int[] arr={22,13,26,29,2};
//        minmax(arr);
//
//    }
//}

////Using sort
//public class Array {
//    public static void minmaxsort(int[] arr,int n){
//        Arrays.sort(arr);
//        int min=arr[0];
//        int max=arr[n-1];
//        System.out.println("Maximum :"+min);
//        System.out.println("Minimum :"+max);
//    }
//    public static void main(String[] args){
//        int [] arr={22,13,26,29,2};
//        minmaxsort(arr, arr.length);
//    }
//}
//
//public class Array {
//    public static int apnacollegeminmax(int[] arr){
//        int largest = Integer.MIN_VALUE;
//        int smallest=Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (largest < arr[i]) {
//                largest = arr[i];
//            }
//            if (smallest>arr[i]){
//                smallest=arr[i];
//            }
//        }
//        System.out.println("Smallest Number is:"+smallest);
//        return largest;
//    }
//
//    public static void main (String[] args){
//        int[] arr={1,2,3,6,5,4,9};
//        int v=apnacollegeminmax(arr);
//        System.out.println("Largest number is:"+v );
//    }
//}


////REVERS an Arrays
//public class Array {
//    public static void revers(int[] arr,int n){
//        int first=arr[0];
//        int last=arr[n-1];
//        while (first<last){
//            int temp=last;
//            last=first;
//            first=temp;
//            first++;
//            last--;
//
//        }
//    }
//
//    public static void main(String[] args){
//        int[] arr={2,4,6,8,10};
//        revers(arr,arr.length);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();
//    }
//}

//REVERS an Arrays 2nd
//public class Array {
//    public static void revers(int[] arr){
//        int first=0;
//        int last=arr.length-1;
//
//        while (first<last){
//            int temp=arr[last];
//            arr[last]=arr[first];
//            arr[first]=temp;
//            first++;
//            last--;
//
//        }
//    }
//
//    public static void main(String[] args){
//        int[] arr={2,4,6,8,10};
//        revers(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//}

//Q.3 maxsubarray apna college
//
//public class Array {
//    public static void maxsubarray(int[] arr){
//        int current=0;
//        int maxsum=Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                current=0;
//                for (int k=i;k<=j;k++) {
////                    current = arr[k]+current;
//                    current += arr[k];
//                }
//                System.out.println(current);
//                if (maxsum<current){
//                    maxsum=current;
//                }
//            }
//        }
//        System.out.println("Totalsum:"+maxsum);
//    }
//    public static void main(String[] args){
////        int [] arr={2,4,6,8,10};
//        int [] arr={1,-2,6,-1,3};
//        maxsubarray(arr);
//
//    }
//}
//public class Array {
//    public static void kadanes(int [] arr){
//        int maxsum=Integer.MIN_VALUE;
//        int currentsum=0;
//        for (int i=0;i<arr.length;i++){
//            currentsum=currentsum+arr[i];
//            if (currentsum<0){
//                currentsum=0;
//            }
//            maxsum=Math.max(currentsum,maxsum);
//            }
//        System.out.println(maxsum);
//        }
//
//    public static void main(String[] args){
//        int[] arr={-2,-3,4,-1,-2,1,5,-3};
//        kadanes(arr);
//
//
//    }
//}
// Q3. Contain duplicate
//public class Array {
//    public static boolean duplicate(int[] arr){
//        Arrays.sort(arr);
//        for (int i=0;i< arr.length-1;i++){
//                if (arr[i]  == arr[i+1]){
//                    return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args){
//        int[] arr={1,3,6,4,8,4};
//         boolean v=duplicate(arr);
//        System.out.println(v);
//    }
//}
//

//   Q.8 Best time to sell and buy
//public class Array {
//    public static int buyandsell(int[] arr) {
//        int buyprice = Integer.MAX_VALUE;
//        int maxprofit = 0;
//        for (int i=0;i<arr.length;i++){
//            if (buyprice<arr[i]){  //arr[i] is selling price
//                int profit=arr[i]-buyprice;
//                System.out.println(profit);
//                maxprofit=Math.max(maxprofit,profit);
//            }
//            else {
//                buyprice=arr[i];
//            }
//
//        }
//        return  maxprofit;
//    }
//    public static void main(String[] args){
//        int[] arr={7,1,5,3,6,4};
//        System.out.println("Maximum profit: "+buyandsell(arr));
//
//    }
//}

//
//public class Array {
//    public static int trappedrainwater(int [] height){
//        int var=height.length;
////        System.out.println(var);
//        int[] laux1=new int[var];
//       laux1[0]= height[0];
//        for (int i=1;i<var;i++){
//            laux1[i]=Math.max(height[i],laux1[i-1]);
//            System.out.println(laux1[i-1]);
//
//        }
//
//        int[] raux2=new int[var];
//        raux2[var-1]=height[var-1];
//        for (int i=var-2;i>=0;i--){
//            raux2[i]=Math.max(height[i],raux2[i+1] );
//        }
//        int trappedwater=0;
//        for (int i=0;i<var;i++){
//            int waterlevel=Math.min(laux1[i],raux2[i]);
//             trappedwater += waterlevel-height[i];
//
//        }
//        return trappedwater;
//
//    }
//    public static void main(String[] args){
//        int[] height={4,2,0,6,3,2,5};
//        System.out.println(trappedrainwater(height));
//
//
//
//    }
//}

//public class Array {
//    public static int searchrotated(int[] arr,int key) {
//        int low=0;
//        int high=arr.length-1; //array lenght is se 6 aayegi
//        while (low<=high){
//            int mid=(low+high)/2;
//            if (arr[mid]==key){
//                return mid;
//            }
//            if (arr[low]<arr[mid])  //array left side ascending or not check
//            {
//                if (key>=arr[low] && key<arr[mid]){
//                    high=mid-1;
//                }
//                else {
//                    low=mid+1;
//                }
//            }
//            else {
//                if (key>arr[mid] && key<=arr[high]){
//                    low=mid+1;
//                }
//                else {
//                    high=mid-1;
//                    }
//                }
//            }
//        return -1;
//    }
//    public static void main(String[] args){
////        int[] arr={4,5,6,7,0,1,2};
//        int[] arr={20,30,40,50,60,5,10};
//        int key=40;
//        System.out.println(searchrotated(arr,key));
//    }
//}

//public class Array {
//    public static int chocolatedistribution(int[] arr,int n, int m){
//        int answer=Integer.MAX_VALUE;
//        Arrays.sort(arr);
//        for (int i=0;i+m-1<n;i++){
//            int diffrence=arr[i+m-1]-arr[i];
//            if (diffrence<answer){
//                answer=diffrence;
//            }
//        }
//        return answer;
//
//    }
//    public static void main(String[] args){
//        int [] arr={3,4,1,9,56,7,9,12};
//        int n=arr.length;
//        int m=5;
//        System.out.println(chocolatedistribution(arr,n,m));
//
//    }
//}
//
//public class Array {
//    public static int misingandrepeat(int[] arr){
//        int n=arr.length;
//        int repeat=Integer.MAX_VALUE;
//        int missing=Integer.MAX_VALUE;
//        int[] temprarory=new int[n];
//        for (int i=0;i<n;i++){
//            temprarory[arr[i]-1]++;
//            if (temprarory[arr[i]-1]>1){
//                repeat=arr[i];
//            }
//        }
//        for (int i=0;i<n;i++){
//            if (temprarory[i]==0){
//                missing=i+1;
//            }
//        }
//        System.out.println("Repeat Number: "+repeat);
//        System.out.println("Missing number: "+missing);
//        return -1;
//    }
//    public static void main(String[] args){
//        int[] arr={2,4,1,2,5};
////        int[] arr = { 7, 3, 4, 5, 5, 6, 2 };
//        misingandrepeat(arr);
//
//    }
//}

//public class Array {
//    public static int kthelemenminimum(int[] arr,int k){
////        Arrays.sort(arr);
//        return arr[k+1];
////        return arr[k-1];
//    }
//    public static void main(String[] args){
////        int[] arr={7,2,3,8,1};
//        int[] arr={3,2,1,5,6,4};
////        int[] arr={3,2,3,1,2,4,5,5,6};
//
//        int k=2;
//        System.out.println(kthelemenminimum(arr,k));
//    }
//}
//
//
//
