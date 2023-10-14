//import java.util.ArrayList;
//public class StackB {
//    static class Stackmini {
//        static ArrayList<Integer> list = new ArrayList<>();
//
//        //        empty stack or not check
//        public static boolean isempty() {
//            return list.size() == 0;
//        }
//
//        //        push
//        public static void push(int data) {
//            list.add(data);
//        }
//
//        //       pop
//        public static int pop() {
//            if (isempty()){
//                return -1;
//            }
//            int top = list.get(list.size() - 1);
//            list.remove(list.size() - 1);
//            return top;
//        }
////        peek
//        public static int peek() {
//            if (isempty()){
//                return -1;
//            }
//            return list.get(list.size() - 1);
//        }
//    }
//        public static void main(String[] args) {
//     Stackmini newstack=new Stackmini();
////     newstack.push(0);
////     newstack.push(1);
////     newstack.push(2);
////     newstack.push(3);
//
//     while (!newstack.isempty()){
//         System.out.print(newstack.peek());
//         newstack.pop();
//     }
//    }
//}


//Stack using LinkedList
//public class StackB {
//     static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//    static class Stackmini {
//        //        Empty operation
//        static Node head = null;
//
//        public static boolean isEmpty() {
//            return head == null;
//        }
//
////        Push
//        public static void Push(int data){
////            create the node
////            1
//            Node newNode=new Node(data);
//            if (isEmpty()){
//                head=newNode;
//                return;
//            }
////            2
//            newNode.next=head;
////            3
//            head=newNode;
//        }
//
////       pop
//        public static int Pop(){
//            if (isEmpty()){
//                return -1;
//            }
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//
////      peek
//
//        public static int Peek(){
//            if (isEmpty()){
//                return -1;
//            }
//            return head.data;
//        }
//
//    }
//        public static void main(String[] args) {
//            Stackmini sl = new Stackmini();
////            sl.Push(1);
////            sl.Push(2);
////            sl.Push(3);
//
//
//            while (!sl.isEmpty()) {
//                System.out.println(sl.Peek());
//                sl.Pop();
//        }
//    }
//}
//

//import java.util.Stack;
//
//public class StackB {
//    public static void main(String[] args) {
//        Stack<Integer> newStack= new Stack<>();
//        newStack.push(1);
//        newStack.push(2);
//        newStack.push(3);
//        newStack.push(4);
//
//        while (!newStack.isEmpty()){
//            System.out.println(newStack.peek());
//            newStack.pop();
//        }
//
//
//    }
//}


//Q.1 push in bottam
//import java.util.Stack;
//public class StackB {
//    public static void bottompush(Stack<Integer> newS,int data) {
//        if (newS.isEmpty()){
//            newS.push(data);
//            return;
//        }
//        int top= newS.pop();
//        bottompush(newS,data);
//        newS.push(top);
//    }
//    public static void main(String[] args) {
//        Stack<Integer> newS=new Stack<>();
//        newS.push(1);
//        newS.push(2);
//        newS.push(3);
//
//        bottompush(newS,4);
//        while (!newS.isEmpty()){
//            System.out.println(newS.pop());
//        }
//    }
//}


//Q.2 REverse a string using  Stack
//import java.util.Stack;
//public class StackB {
//    public static String Reverse(String str,Stack<Character> CS){
//        int index=0;
//        while (index<str.length()){
//            CS.push(str.charAt(index));
//            index++;
//        }
//
//        StringBuilder NS=new StringBuilder("");
//        while (!CS.isEmpty()){
//            char curr=CS.pop();
//            NS.append(curr);
//        }
//        return NS.toString();
//    }
//    public static void main(String[] args) {
//        Stack<Character> CS=new Stack<>();
//        System.out.println(Reverse("Arbaz",CS));
//
//    }
//}



// Reverse the stack
//import java.util.Stack;
//public class StackB {
//    public static void pushatBottom(Stack<Integer> stack,int data){
//        if(stack.isEmpty()){
//            stack.push(data);
//            return;
//        }
//        int top=stack.pop();
//        pushatBottom(stack,data);
//        stack.push(top);
//
//    }
//
//    public static void ReversStack(Stack<Integer> stack){
//        if (stack.isEmpty()){
//            return;
//        }
//        int top=stack.pop();
//        ReversStack(stack);
//        pushatBottom(stack,top);
//    }
//    //    Abb function bana k print karenge isse pehle main function me hi print kar de rahe the .
//    public static void printStack(Stack<Integer> stack){
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//    }
//    public static void main(String[] args){
//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        ReversStack(stack);
//        printStack(stack);
//    }
//}

//practice push at bottom and reverse stack combine
//import java.util.Stack;
//public class StackB {
//    public static void pushatBottom(Stack<Integer> stack,int data){
//        if(stack.isEmpty()){
//            stack.push(data);
//            return;
//        }
//        int top=stack.pop();
//        pushatBottom(stack,data);
//        stack.push(top);
//
//    }
//
//    public static void ReversStack(Stack<Integer> stack){
//        if (stack.isEmpty()){
//            return;
//        }
//        int top=stack.pop();
//        ReversStack(stack);
//        pushatBottom(stack,top);
//    }
////    Abb function bana k print karenge isse pehle main function me hi print kar de rahe the .
//    public static void printStack(Stack<Integer> stack){
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
//    }
//    public static void main(String[] args){
//     Stack<Integer> stack=new Stack<>();
//     stack.push(1);
//     stack.push(2);
//     stack.push(3);
//     ReversStack(stack);
//     printStack(stack);
////     pushatBottom(stack,4);
//
//
////     while (!stack.isEmpty()){
////         System.out.println(stack.pop());
////     }
////        System.out.println(stack);
//    }
//}

//Q.4  Stock Span Problem
//import java.util.Stack;
//public class StackB {
//    public static void StockSpan(int stock[],int span[],Stack<Integer> newstack){
//        span[0]=1;
//        newstack.push(0);
//
//        for (int i=1;i<stock.length;i++){
//            int currprice=stock[i];
//            while (!newstack.isEmpty() && currprice > stock[newstack.peek()]){
//                newstack.pop();
//            }
//            if (newstack.isEmpty()){
//                span[i]=i+1;
//            }
//            else {
//                int prevhigh=newstack.peek();
//                span[i]=i-prevhigh;
//            }
//            newstack.push(i);
//        }
//    }
//    public static void main(String[] args) {
//        Stack<Integer> newstack=new Stack<>();
//        int stock[]={100,80,60,70,60,85,100};
//        int span[]=new int[stock.length];
//
//        StockSpan(stock,span,newstack);
//        for (int i=0;i<span.length;i++){
//            System.out.print(span[i] + " ");
//        }
//
//    }
//}


//Next Greter Element in right
//import java.util.Stack;
//public class StackB {
//    public static void main(String[] args) {
//        Stack<Integer> s=new Stack<>();
//        int arr[]={6,8,0,1,3};
//        int Rightgreter[]=new int[arr.length];
//
//        for (int i=arr.length-1;i>=0;i--){
////           1
//            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                s.pop();
//            }
////            2
//            if (s.isEmpty()){
//                Rightgreter[i]=-1;
//            }
//            else {
//                Rightgreter[i]=arr[s.peek()];
//            }
////            3
//            s.push(i);
//        }
//
//        for (int i=0;i<Rightgreter.length;i++){
//            System.out.print(Rightgreter[i]+" ");
//        }
//        System.out.println();
//    }
//}

//Valid Parenthesis ([{}])


//import java.util.Stack;
//public class StackB {
//    public static boolean IfValid(Stack<Character> S,String str) {
//        for (int i = 0; i < str.length(); i++) {  //openig
//            char ch = str.charAt(i);
//            if (ch == '(' || ch == '{' || ch == '[') {
//                S.push(ch);
//            } else {
////                closing
//                if (S.isEmpty()) {
//                    return false;
//                }
//                if ((S.peek() == '(' && ch == ')')
//                        || (S.peek() == '{' && ch == '}')
//                        || (S.peek() == '[' && ch == ']')) {
//                    S.pop();
//                } else {
//                    return false;
//                }
//            }
//        }
//            if (S.isEmpty()){
//                return true;
//            }
//            else {
//                return false;
//            }
//    }
//    public static void main(String[] args){
//        Stack<Character> S=new Stack<>();
//        String str="({})[]";
//        System.out.println(IfValid(S,str));
//    }
//}
//


import java.util.Stack;
public class StackB {
    public static boolean Dublicate_parenthesis(Stack<Character> s,String str){
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
//            Closing
            if (ch==')'){
             int count=0;
             while (s.peek() != '('){
                 s.pop();
                 count++;
             }
             if (count<1){
                 return true;  //duplicate parenthesis
             }
             else {
                 s.pop();  //opening pair
             }
            }
            else {
                s.push(ch);
            }
        }
        return false;

    }
    public static void main(String[] args){
        Stack <Character> s=new Stack<>();
        String str1="((a+b))";
        String str2="(a+b)";
        System.out.println(Dublicate_parenthesis(s,str2));

    }
}
