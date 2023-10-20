//implement Queue using the Array
//public class QueueB {
//    static class Queue{
//       static int arr[];
//         static int size;
//        static int rare;
//        Queue(int n){
//            arr=new int[n];
//            size=n;
//            rare=-1;
//        }
//
//        public static boolean isEmpty(){
//            return rare==-1;
//        }
//
//        public static void add(int data){
//            if(rare==size-1){
//                System.out.println("Queue is Full.");
//                return;
//            }
//            rare=rare+1;
//            arr[rare]=data;
//        }
//
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("empty");
//                return -1;
//            }
//            int front=arr[0];
//            for (int i=0;i<=rare;i++){
//                arr[i]=arr[i+1];
//            }
//            rare=rare-1;
//            return front;
//        }
//
//        public static int  peek(){
//            if (isEmpty()){
//                System.out.println("empty.");
//                return -1;
//            }
//            return arr[0];
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue Q=new Queue(6);
//        Q.add(1);
//        Q.add(2);
//        Q.add(3);
//        Q.add(4);
//        Q.add(5);
//
//        while (!Q.isEmpty()){
//            System.out.println(Q.peek());
//            Q.remove();
//        }
//    }
//}

//circular Queue
//public class QueueB {
//    static class Queue {
//        static int arr[];
//        static int size;
//        static int rare;
//        static int front;
//
//        Queue(int n) {
//            arr=new int[n];
//            size=n;
//            rare=-1;
//            front=-1;
//        }
//        public static boolean isEmpty(){
//            return rare==-1 && front==-1;
//        }
//
//        public static boolean isfull(){
//            return (rare+1)%size==front;
//        }
//
//        public static void add(int data){
//            if (isfull()){
//                System.out.println("Queue is Full");
//                return;
//            }
//            // Add first element in queue condition
//            if (front == -1){
//                front=0;
//            }
//            rare=(rare+1)%size;
//            arr[rare]=data;
//        }
//
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            int result=arr[front];
//            if (front==rare){
//                front=rare=-1;
//            }
//            else {
//                front =(front+1)%size;
//            }
//            return result;
//        }
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return arr[front];
//        }
//    }
//
//    public static void main(String[] args) {
//        Queue q=new Queue(3);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        System.out.println(q.remove());
//        q.add(4);
//        System.out.println(q.remove());
//        q.add(5);
//
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}


//Queue using Linkedlist
//public class QueueB {
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static class Queue{
//            static Node head=null;
//            static Node tail=null;
//
//        public static boolean isEmpty(){
//            return head==null && tail==null;
//        }
//
//        public static void add(int data){
//            Node newNode=new Node(data);
//            if (head==null){
//                head=tail=newNode;
//                return;
//            }
//            tail.next=newNode;
//            tail=newNode;
//        }
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("empty");
//                return -1;
//            }
//            int front=head.data;
//            if (tail==head){
//                tail=head=null;
//            }
//            else {
//                head=head.next;
//            }
//            return front;
//        }
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("Queue is Empty.");
//                return -1;
//            }
//            return head.data;
//        }
//        }
//    public static void main(String[] args) {
//        Queue q=new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}



//Queue using java Collection framework
// Linkedlist //ArrayDeque support Queue to implement
//import java.util.LinkedList;

//using linkedlist
//import java.util.Queue;
//public class QueueB {
//    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}

//using ArrayDequeue
//import java.util.ArrayDeque;
//import java.util.Queue;
//public class QueueB {
//    public static void main(String[] args) {
//        Queue<Integer> q=new ArrayDeque<>();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}


//Queue using 2 stack
//import java.util.*;
//public class QueueB {
//    static class Queue{
//        static Stack<Integer> s1=new Stack<>();
//        static Stack<Integer> s2=new Stack<>();
//
//        public static boolean isEmpty(){
//            return s1.isEmpty();
//        }
//
//        public static void add(int data){
////            1
//            while (!s1.isEmpty()){
//                s2.push(s1.pop());
//            }
////            2
//            s1.push(data);
//
////            3
//            while (!s2.isEmpty()){
//                s1.push(s2.pop());
//            }
//        }
//
//        public static int remove(){
//            if (isEmpty()){
//                System.out.println("empty");
//                return -1;
//            }
//            return s1.pop();
//        }
//
//        public static int peek(){
//            if (isEmpty()){
//                System.out.println("empty");
//                return -1;
//            }
//            return s1.peek();
//        }
//    }
//    public static void main(String[] args) {
//        Queue q=new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        while (!q.isEmpty()){
//            System.out.println(q.peek());
//            q.remove();
//        }
//
//    }
//}


//Stack using 2 Queue
import java.util.*;
import java.util.LinkedList;

public class QueueB {
    static class Stack{
       static Queue<Integer> q1=new LinkedList<>();
       static Queue<Integer> q2=new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
            if (!q1.isEmpty()){
                q1.add(data);
            }
            else {
                q2.add(data);
            }
        }

        public static int pop(){
            if (isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int top=-1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    if (q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else {
                while (!q2.isEmpty()){
                    top= q2.remove();
                    if (q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }

            return top;
        }

        public static int peek(){
            if (isEmpty()){
                System.out.println("Empty");
                return -1;
            }
            int top=-1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else {
                while (!q2.isEmpty()){
                    top= q2.remove();
                    q1.add(top);
                }
            }

            return top;

        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}