//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    public static void main(String[] args){
//        LinkedList list =new LinkedList();
//        list.head=new Node(1);
//        list.head.next=new Node(2);
//        System.out.println(list);
//
//    }
//}


import org.w3c.dom.Node;

//add in link List
//public class LinkedList {
//    public static  class Node{
//        int data;
//        Node next;
//        public  Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//
//    }
//
//    public void addlast(int data){
////        1
//        Node newnode=new Node(data);
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        tail.next=newnode;
////        3
//        tail=newnode;
//    }
//
//    public void printlinkedlist(){
//        if (head==null){
//            System.out.println("Linkedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp != null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//
//    public static void main(String[] args){
//        LinkedList list=new LinkedList();
//        list.printlinkedlist();
//        list.addfirst(2);
//        list.printlinkedlist();
//        list.addfirst(1);
//        list.printlinkedlist();
//        list.addlast(3);
//        list.printlinkedlist();
//        list.addlast(4);
//        list.printlinkedlist();
//        System.out.println(list);
//    }
//}
//

// addfirst in linklist and print function code
//fully Understand
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
//
////        3
//        head=newnode;
//
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.print();
//        ll.addfirst(2);
//        ll.print();
//        ll.addfirst(1);
//        ll.print();
//        ll.addfirst(0);
//        ll.print();
//    }
//}



//add in middle in linkedlist
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
//
////        3
//        head=newnode;
//
//    }
//
////    add in the middel
//    public void addmid(int idx,int data){
//        if (idx==0){
//            addfirst(data);
//            return;
//        }
////       1
//        Node newnode= new Node(data);
//        Node temp=head;
//        int i=0;
//        while (i<idx-1){
//            temp=temp.next;
//            i++;
//        }
////       2
//        newnode.next=temp.next;
////       3
//        temp.next=newnode;
//
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(2);
//        ll.addfirst(1);
//        ll.addfirst(0);
//        ll.addmid(0,9);
//        ll.print();
//    }
//}


//Size of  a linkedlist

//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public static int  size;
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
//
////        3
//        head=newnode;
//
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(2);
//        ll.addfirst(1);
//        ll.addfirst(0);
//        ll.print();
//        System.out.println(ll.size);
//    }
//}



//remove first and special case
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public  static int size;
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//    public int removefirst(){
//        if(size==0){
//            System.out.println("Ll is Empty.");
//            return Integer.MAX_VALUE;
//        }
//        else if (size==1) {
//            int val=head.data;
//            head=tail=null;
//            size=0;
//            return val;
//        }
//        int val=head.data;
//        head=head.next;
//        size--;
//        return val;
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(2);
//        ll.addfirst(1);
//        ll.addfirst(0);
//        ll.print();
//        ll.removefirst();
//        ll.print();
//        System.out.println(ll.size);
//    }
//}
//



////remove last and special case
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public  static int size;
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//
//    public int removelast(){
//        if(size==0){
//            System.out.println("ll is empty.");
//            return Integer.MIN_VALUE;
//        }
//        else if (size==1){
//            int val=head.data;
//            head=tail=null;
//            size=0;
//            return val;
//        }
//        Node prev=head;
//        for (int i=0;i<size-2;i++)
//        {
//            prev=prev.next;
//        }
//        int val=prev.next.data; //tail data
//        prev.next=null;
//        tail=prev;
//        size--;
//        return val;
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(2);
//        ll.addfirst(1);
//        ll.addfirst(0);
//        ll.print();
//        ll.removelast();
//        ll.print();
//        System.out.println(ll.size);
//    }
//}


//Search Iterative key in linkedlist
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public  static int size;
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//
////    iterative search function
//    public int iterativeSearch(int key){
//         Node temp=head;
//         int i=0;
//         while (temp !=null){
//             if (temp.data == key){
////                 key found at index
//                 return i;
//             }
//             temp=temp.next;
//             i++;
//         }
////         key not found
//         return -1;
//    }
//
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(43);
//        ll.addfirst(34);
//        ll.addfirst(24);
//        ll.addfirst(1);
//        ll.addfirst(03);
//        ll.print();
////        System.out.println(ll.size);
//        System.out.println(ll.iterativeSearch(443));
//    }
//}



//Search in recursive
//public class LinkedList { //
//    public static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public  static int size;
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
//        if(head==null){
//            head=tail=newnode;
//            return;
//        }
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//
//    public int helper(Node head,int key){
////        1.Base
//        if (head==null){
//            return -1;
//        }
//        if (head.data==key){
//            return 0;
//        }
//        int idx=helper(head.next,key);
//        if(idx==-1){
//            return -1;
//        }
//        return idx+1;
//    }
//    public int recursiveSearch(int key){
//        return helper(head,key);
//    }
//    public void print(){
//        if (head==null){
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args){
//        LinkedList ll=new LinkedList();
//        ll.addfirst(14);
//        ll.addfirst(13);
//        ll.addfirst(12);
//        ll.addfirst(11);
//        ll.addfirst(10);
//        ll.print();
////        System.out.println(ll.size);
//        System.out.println(ll.recursiveSearch(12));
//    }
//}

//reverse the linked list
//public class LinkedList {
//    public static class Node {
//        int data;
//        Node next;
//
//        public Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public static Node head;
//    public static Node tail;
//    public static int size;
//
//    public void addfirst(int data) {
////        1
//        Node newnode = new Node(data);
//        size++;
//        if (head == null) {
//            head = tail = newnode;
//            return;
//        }
////        2
//        newnode.next = head;
////        3
//        head = newnode;
//    }
//    public void Reverse(){
//        Node prev=null;
//        Node curr=tail=head;
//        Node next;
//
//        while (curr!=null){
//        next=curr.next;
//        curr.next=prev;
//        prev=curr;
//        curr=next;
//    }
//        head=prev;
//    }
//
//    public void print() {
//        if (head == null) {
//            System.out.println("Likedlist is empty.");
//            return;
//        }
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.data + "->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addfirst(4);
//        ll.addfirst(3);
//        ll.addfirst(2);
//        ll.addfirst(1);
//        ll.addfirst(0);
//        ll.print();
//        ll.Reverse();
//        ll.print();
//
//    }
//}


//create new linklist
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//
//    public static void main(String[] args) {
//        LinkedList list=new LinkedList();
//        list.head=new Node(1);
//        list.head.next=new Node(2);
//        System.out.println(list);
//    }
//}

////add first and print function
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public static int size;
//
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//
//    public void print(){
//        if(head==null){
//            System.out.println("Linked list is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//
//    public static void main(String[] args) {
//        LinkedList list=new LinkedList();
//        list.addfirst(5);
//        list.addfirst(4);
//        list.addfirst(3);
//        list.addfirst(2);
//        list.addfirst(1);
//        list.print();
//        System.out.println(list.size);
//    }
//}


//remove Nth number
//public class LinkedList {
//    public static class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    public static Node head;
//    public static Node tail;
//    public static int size;
//
//
//    public void addfirst(int data){
////        1
//        Node newnode=new Node(data);
//        size++;
////        2
//        newnode.next=head;
////        3
//        head=newnode;
//    }
//
//    public void Removenthnumber(int n){
////        1
//        int size=0;
//        Node temp=head;
//        while (temp!=null){
//            temp=temp.next;
//            size++;
//        }
////       2
//        if (size==n){
//            head=head.next; //remove
//            return;
//        }
////        3
//        int i=1;
//        int itofind=size-n;
//        Node prev=head;
//        while (i<itofind){
//            prev=prev.next;
//            i++;
//        }
//        prev.next=prev.next.next;
//        return;
//    }
//
//    public void print(){
//        if(head==null){
//            System.out.println("Linked list is empty.");
//            return;
//        }
//        Node temp=head;
//        while (temp!=null){
//            System.out.print(temp.data+"->");
//            temp=temp.next;
//        }
//        System.out.println("null");
//    }
//
//
//    public static void main(String[] args) {
//        LinkedList list=new LinkedList();
//        list.addfirst(5);
//        list.addfirst(4);
//        list.addfirst(3);
//        list.addfirst(2);
//        list.addfirst(1);
//        list.print();
//        list.Removenthnumber(3);
//        list.print();
////        System.out.println(list.size);
//    }
//}


public class LinkedList {
    public static class Node{
        int data;
        Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    }
    public static Node head;
    public static Node tail;
    public void addfirst(int data){
//        1
        Node newnode=new Node(data);
//        2
        newnode.next=head;
//        3
        head=newnode;
    }
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;  //+1
            fast=fast.next.next;   //+2
        }
        return slow;
    }
    public boolean Palindrome(){
        if (head==null && head.next==null){
            return true;
        }
        //step 1
        Node mid=findmid(head);

        //step 2
        Node prev=null;
        Node curr=mid;
        Node next;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;

//        step 3
        while (right!=null){
            if (left.data != right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }


    public void print(){
        if (head==null){
            System.out.println("empty");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
     LinkedList ll=new LinkedList();
     ll.addfirst(1);
     ll.addfirst(2);
     ll.addfirst(2);
     ll.addfirst(1);

     ll.print();
        System.out.println( ll.Palindrome());
     ll.print();
    }
}
