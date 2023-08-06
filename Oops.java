//public class Oops {
//    public static void main(String[] args){
//        Pen p1= new Pen(); //Create a pen object called P1
//        p1.SetColor("blue");
//        System.out.println(p1.color);
//        p1.SetTip(10);
//        System.out.println(p1.tip);
//    }
//}
//class Pen{
//    String color;
//    int tip;
//    void SetColor(String newcolor) {
//        color = newcolor;
//    }
//    void SetTip(int newTip){
//        tip=newTip;
//        }
//    }


//public class Oops {
//    public static void main(String[] args){
//        BanckAccount object=new BanckAccount();
//        object.username="arbaz5656";
//        System.out.println(object.username);
//        object.Phonenumber=703956562;
//        System.out.println(object.Phonenumber);
////        object.password="arbaz@123";
////        System.out.println(object.password);
//        object.function("qwert");
//        System.out.println();
//    }
//}
//
//class BanckAccount{
//    public String username;
//    protected int  Phonenumber;
//    private String password;
//    public void function(String pwd){
//        password=pwd;
//    }
//}

//
////Getter setter
//public class Oops {
//    public static void main(String[] args){
//        Pen p1= new Pen(); //Create a pen object called P1
//        p1.SetterColor("blue"); //set karega
//        System.out.println(p1.gettercolor());  //get karega
//        p1.SetterTip(10); //set karega
//        System.out.println(p1.getterTip());  //get karega
//    }
//}
//class Pen{
//    private String color;
//    private int tip;
//
//    String gettercolor(){
//        return this.color;
//    }
//    int getterTip()
//    {
//        return this.tip;
//    }
//    void SetterColor(String newcolor) {
//        this.color = newcolor;
//    }
//    void SetterTip(int tip){
//        this.tip=tip;
//        }
//    }
//


//Constructors
//public class Oops {
//    public static void main(String[] args){
//        Student s1=new Student();
//        Student s2=new Student("Shaikh Arbaz");
//        Student s3=new Student(25);
////        System.out.println(s1);
////        System.out.println(s2.name);
////        System.out.println(s3.rollno);
//
//
//        Student s4=new Student(s2);
//        System.out.println(s4.name);
//
//    }
//}
//class Student{
//    String name;
//    int rollno;
////    non-parametrized constructor
//    Student(){
//        System.out.println("This is a Constructor");
//    }
////    parametrized constructor
//    Student(String name){
//        this.name=name;
//    }
//    Student(int rollno){
//        this.rollno=rollno;
//    }
////    Copy construtor
//    Student(Student s2){
//        this.name=s2.name;
//    }
//}


//Inheritance same as single Inheritance
//public class Oops {
//    public static void main(String [] args){
//        Fish vell=new Fish();
//        vell.breath();
//        vell.eat();
//    }
//}
//class Animal{
//    String color;
//    void eat(){
//        System.out.println("Eat");
//    }
//    void breath(){
//        System.out.println("breath");
//    }
//}
//class Fish extends Animal{
//    int fins;
//    void swim(){
//        System.out.println("Swim");
//    }
//}

//Multilevel Inheritance
//public class Oops {
//    public static void main(String [] args){
//        Cat Ballu=new Cat();
//        Ballu.color="brown";
//        System.out.println(Ballu.color);
//        Ballu.eat();
//        Ballu.tail();
//        Ballu.eyes= "Gray Eyes";
//        System.out.println(Ballu.eyes);
//
//    }
//}
//class Animal{
//    String color;
//    void eat(){
//        System.out.println("Eat");
//    }
//    void breath(){
//        System.out.println("breath");
//    }
//}
//class Memals extends Animal{
//    int legs;
//    void tail(){
//        System.out.println("Tail");
//    }
//}
//
//class Cat extends Memals{
//    String eyes;
//}




// Hirerchical inheritance
//public class Oops {
//    public static void main(String [] args){
//        Memals M=new Memals();
//        Fish F=new Fish();
//        Bird B=new Bird();
//        M.color="brown";
//        System.out.println(M.color);
//        F.color="gray";
//        System.out.println(F.color);
//        B.color= "White";
//        System.out.println(B.color);
//
//    }
//}
//
//class Animal{
//    String color;
//    void eat(){
//        System.out.println("Eat");
//    }
//    void breath(){
//        System.out.println("breath");
//    }
//}
//class Memals extends Animal{
//    int legs;
//    void tail(){
//        System.out.println("Tail");
//    }
//}
//
//class Fish extends Animal{
//    void fin(){
//        System.out.println("Fin");
//    }
//}
//
//
//class Bird extends Animal{
//    void fin(){
//        System.out.println("Fin");
//    }
//}

//Interface
//public class Oops {
//    public static void main(String[] args){
//        Bear h=new Bear();
//            h.Ca();
//
//
//    }
//}
//
//interface Herbivore {
//    default void he(){
//        System.out.println("Eats veg");
//    }
//
//}
//interface Carnivore{
//    default void Ca(){
//        System.out.println("Eats Non veg");
//    }
//}
//
//class Bear implements Herbivore,Carnivore{
//    void eats(){
//        System.out.println("Eats veg and nonveg.");
//    }
//}


public class Oops {
    public static void main(String[] args){
        cat c=new cat();
    }
}

class animal{
    animal(){
        System.out.println("Animal is very dengerous.");
    }
}

class cat extends animal{
    cat(){
        super();
        System.out.println("cat is very cute.");
    }
}