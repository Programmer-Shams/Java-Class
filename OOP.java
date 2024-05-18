

class Calculator {
    int num = 5 ;
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 * n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(int n1, int n2, int n3, int n4)
    {
        return n1 + n2;
    }


}

class  Computer {
    public void playMusic()
    {
       System.out.println("Playing Music");
    }

    public String getMePen(int cost)
    {
        if (cost <  10)
            return "Pls Provide me more money";
        else {
           return "I got it for you";
        }
    }
}

public class OOP {
    public  static void main(String a[])
    {
        int num1 = 5;
        int num2 = 6;
        int num3 = 5;
        int result = num1 + num2;
        System.out.println(result);

        Calculator  calc = new Calculator();
        int res = calc.add(num1, num2, num3);
        System.out.println(res);

        Computer comp = new Computer();
        comp.playMusic();
        String str = comp.getMePen(8);
        System.out.println(str);

        Calculator obj = new Calculator();
        Calculator obj2 = new Calculator();
        obj.num = 99;
        System.out.println(obj.num);
        System.out.println(obj2.num);
    }
}



// Arrays


class Student{
    String name;
    int roll;
    int score;
}


class Array {
    public static void main(String a[])
    {
        Student s1 = new Student();
        s1.name = "Shmasudeen";
        s1.roll = 19;
        s1.score  = 90;


        Student s2 = new Student();
        s2.name = "Imran";
        s2.roll = 18;
        s2.score  = 80;


        Student s3 = new Student();
        s3.name = "Jamiu";
        s3.roll = 17;
        s3.score = 70;


        Student students[] =  new Student[3]; // Creating Array Of student
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        for(Student std: students) {
            System.out.println(std.name + " : " + std.score);
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println((students[i].name)+" "+(students[i].roll)+" "+(students[i].score));
        }

        int num[] =  {1, 2, 3, 4, 5};
        num[2] = 6;
        System.out.println(num[2]);


        int numss[]  = new int[5];
        numss[0] = 4;
        numss[1] = 6;
        numss[2] = 7;
        numss[3] = 8;
        numss[4] = 9;
        System.out.println(numss[2]);
        System.out.println(numss[3]);
        System.out.println(numss[4]);
        System.out.println(numss[5]);


        // Instead we can use a loop;
        for(int i=0; i<numss.length; i++)
        {
            System.out.println(i);
        }

        int numbers[][] =  new int[3][4];
        int random  = (int)(Math.random() * 10);
        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j  < numbers[i].length; j++)
            {
                numbers[i][j] = random;
            }
        }

        for (int i = 0; i < numbers.length; i++)
        {
            for (int j = 0; j  < numbers[i].length; j++)
            {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
//
//
//        //  jagged and 3D Array in Java
//        // Not specifying the size of the internal Array in a Big Array
        int numberss[][] =  new int[3][];
        numberss[0] = new int [4];
        numberss[1] = new int [5];
        numberss[2] = new int [2];

        for (int i = 0; i < numberss.length; i++)
        {
            for (int j = 0; j  < numberss[i].length; j++)
            {
                System.out.print(numberss[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// for each loop;

class foreach {
    public static void main(String[] args) {
        int numss[]  = new int[5];
        numss[0] = 4;
        numss[1] = 6;
        numss[2] = 7;
        numss[3] = 8;
        numss[4] = 9;
        for(int n: numss){
            System.out.println(n);
        }
    }
}




// String in Java

 Static keywoard;
class Phones {
    String brand;
    String name;
    int price;
    String network;
    static String country;
    public  void show()
    {
        System.out.println("Brand: " + brand);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Network: " + network);
        System.out.println("Country: " + country);
    }

}
public class OOP {
    public static void main(String[] args) {
        String name = new String("Shamsudeen");
//        String name = "Shamsudeen";  // mostly used;

        name = name + " shams";   // changing the address
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hello " + name);
        System.out.println(name.charAt(4));
        System.out.println(name.concat(" Imran"));


        // StringBuffer
        StringBuffer sb = new StringBuffer("Shamsudeen");
        sb.deleteCharAt(3);
        sb.insert(3, "Java");
        System.out.println(sb);

        Phones f1  = new Phones();
        f1.brand = "Apple";
        f1.name = "Iphone 14  pro max";
        f1.network = "MTN";
        f1.price =  2000;



        Phones f2  = new Phones();
        f2.brand = "Samsung";
        f2.name = "S20";
        f2.network = "MTN";
        f2.price =  2500;


        f1.country = "USA"; // Static variable should be called wiith their class name
        Phones.country = "USA";
        f1.show();
        System.out.println();
        f2.show();
    }
}





// Encapsulation in Java

class  Human {
    private int age;
    private String name;


   Constructor in Java

     Constructor is special method
     Every time you create an object the Constructor will be called , it serves as the  default value

    Default Constructor
    public Human() {
        // Setting default values
        this.age = 20;
        this.name = "Ibrahim";
    }

    Constructor Overloading
     Parameterized Constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public  int getAge (){
        return age;
    }

    public void setAge (int age){
        this.age = age;
    }
    public String getName (){
        return name;
    }
    public  void setName (String name){

        this.name = name;
    }


}



class OOP {
    public static void main(String[] args) {

        new Human();  //  Anonymous Object in java
        Human hum = new Human();
        Human hum1 = new Human(22, "Shams");  // This is to show that everytime you create an object the Constructor will be called
        System.out.println(hum.getAge() + " : " +  hum.getName());
        System.out.println(hum1.getAge() + " : " +  hum1.getName());
        hum.setAge(40);
        hum.setName("Shamsudeen");
//        System.out.println(hum.getAge() + " : " +  hum.getName());
    }
}



// Naming
// class and interface ------- Capital Letters;
// methods and variable ------- Small letters;
// Constants  ---------- All Capital Letters (PIE, BRAND);
// Camel Casing myShow();




// Inheritance in Java

class  Cal{
    public int addition(int n1,int n2){
        return n1 + n2;
    }

    public int subtraction(int n1,int n2){
        return n1-n2;
    }
}

class  A extends Object {
    public  A () {
        super();
        System.out.println("In A");
    }
    public  A (int a) {
        System.out.println("In A Int");
    }
}
class B extends A{
    public B () {
        super();
        System.out.println("In B");
    }
    public B (int a) {
        this(); // class the default constructor
//        super(a);
        System.out.println("In B int");
    }

}



// Method Overriding in Java

import project.Marks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;


class A {
    public int add (int a, int b){
        return a + b;
    }
    public void config() {
        System.out.println("In A config");
    }
}

class B extends A {
    public int add (int a, int b){
       return a + b + 1;
    }
}


class OOP {
    public static void main(String[] args) {
        Cal  obj  = new Cal ();
        int r1 = obj.addition(10,20);
        int r2 = obj.subtraction(10,30);
        System.out.println(r1);
        System.out.println(r2);

        AdvanceCal obj2 = new AdvanceCal ();
        int r3 = obj2.addition(10,20);
        int r4 = obj2.subtraction(10,30);
        int r5 =  obj2.Multiply(10, 20);
        int r6 = obj2.Divide(10,20);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        // Single and Multilevel inheritance in java
        VeryAdvanceCal obj3 = new VeryAdvanceCal ();
        int r7 = obj3.addition(10,20);
        int r8 = obj3.subtraction(10,30);
        int r9 =  obj3.Multiply(10, 20);
        int r10 = obj3.Divide(10,20);
        int r11 = obj3.Power(2, 2);
        System.out.println(r7);
        System.out.println(r8);
        System.out.println(r9);
        System.out.println(r10);
        System.out.println(r11);


        B b = new B(10);
        A a = new A(20);

        B a = new B();
       int r =  a.add(2, 2);
       System.out.println(r);

        Marks m = new Marks();
        System.out.println(m.mark);
    }
}





// Polymorphism in Java ------------ Many behaviors
// Polymorphism ------ runtime(Overiding) & compile time(overloading)


// Runtime Polymorphism using Dynamic Method Dispatch in Java

class  Computer {

}
class laptop extends Computer{

}
class A {
    public void show() {
        System.out.println("In A Show");
    }
}
class B extends A {
    public void show() {
        System.out.println("In B Show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C Show");
    }
}
class OOP {
    public static void main(String[] args) {


        // Deciding runtime , it doesnt depend  on the type but depends on the object you have  and that is if we have inheritance
        A obj = new A();
        obj.show();


        obj  = new B();
        obj.show();

        obj  = new C();
        obj.show();


        // final ----------- to make a variable constant;

        // final with  variable

        // To stop  inheritance for a class use final
        // use  final to stop overiding and overloading
        final int numm = 9;
//        numm = 4;   // not  possible
    }
}


// Object Class

//  Object Class equals toString hashcode in Java

class laptop {
     int price;
     String name;

     public boolean equals(laptop that) {
         if(this.name.equals(that.name) && this.price == that.price)
             return true;
         else
             return false;
     }
}

class A {
    public void  show() {
        System.out.println("In A Show");
    }
}
class  B extends A {
    public void  show2() {
        System.out.println("In B Show");
    }
}
class OOP {
    public static void main(String[] args) {
        laptop obj = new laptop();
        obj.name = "Macbook";
        obj.price = 1500;

        laptop obj2 = new laptop();
        obj2.name = "windows";
        obj2.price = 1500;

        boolean result = obj.equals(obj2);

        System.out.println(result);
        System.out.println(obj);
        System.out.println(obj.toString());
//         behind  it call the  toString() method



//           Upcasting and Downcasting in Java

        double d  = 4.5;
        int i  = (int)d; // type casting
        System.out.println(i);

        // Upcasting
        A obj = (A) new B();
        obj.show();

        B obj2 = (B) new B();
        obj2.show2();



//          Wrapper Class in Java
//          For every  primitve type we have a class  for it
//         int ------- Integer
//         char ------- Character
//         double ------- Double


        int num = 5;
        Integer num1 = num; // autoboxinng ----- takinng a primitve storing it in An Object;

        int  num2 =  num1; //  auto-unboxinng
        System.out.println(num2);


        String str = "12";
        int num3 = Integer.parseInt(str);

        System.out.println(num3 * 4);
    }
}



// Abstract Keyword in Java
abstract  class Car {
    public abstract void drive ();  // declaering the method  use abstract for declearing a method without  doinng anything yet and  you need to make the  class abstract
    public abstract void fly();
    public void playMusic (){
        System.out.println("Play Music");
    }
}


// And we cant create an object of abstract class , so we need to create a class  that will extend Wrgon
class UpWargoner extends  Wargonr{
    public void fly (){
        System.out.println("Up Wargoner");
    }
}
//// if  you dont want make call the method , you can also make this  Wargonr a abstract class
 abstract class Wargonr extends Car {
    public void drive (){
        System.out.println("Drive");
    }
}

//// Inner Class
class A  {
    int age;
    public void show() {
        System.out.println("Show");
    }

    class B {
        public void config  () {
            System.out.println("config");
        }
    }
}

abstract  class Test {
    public void show() {
        System.out.println("show mee");
    }
}
class OOP {
    public static void main(String[] args) {

//         u can not create an object of abstract  class
        Car car = new UpWargoner();
        car.drive();
        car.playMusic();
        car.fly();


        // Inner Class


        //  Anonymous Inner Class in Java
        A obj = new A(){
            public void show() { // Anonymous new implimentation
                System.out.println("new Show");
            }
        };

        // Abstract and Anonymous Inner Class

        Test test = new Test() {
            public void show() {
                System.out.println("new Show here");
            }
        };

        test.show();
        obj.show();

        A.B obj1   = obj.new B();
        obj1.config ();
    }


}


// Need of Interface in Java

// Instead of abstract we can use interface
interface Computer {
    void code();
}
class Laptop implements Computer {

    public void code() {
        System.out.println("Laptop code, compile, run");
    }
}

class  Desktop implements Computer {
    public void code() {
        System.out.println("Laptop code, compile, run: Faster");
    }
}
class NewDeveloper {
    public void code (Computer lap) {
        lap.code();
    }
}
class OOP {
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer desktop = new Desktop();
        NewDeveloper shams = new NewDeveloper();
        shams.code(desktop); // shams cant work without laptop


    }
}

// What is Interface in Java

abstract class A {
    abstract public void show();
    abstract public void show2();
}  // instead of this we use innterface


interface A {
    // All variable in interface are Final and static
    int age = 44;
    String name = "Shams";
    void show();
    void show2();
}

interface  Run {
    void run();
}

interface Slow extends Run {
    void slow();
}
// Then we impliment in another class
class B implements A, Slow {
    public void show() {
        System.out.println("Show B");
    }
    // it is compulsury to impliment all the method
    public void show2() {
        System.out.println("Show B 2");
    }
    public void run() {
        System.out.println("Run B");
    }
    public void slow () {
        System.out.println("Slow B");
    }
}
class OOP {
    public static void main(String[] args) {

        A obj = new B();
        obj.show();
        obj.show2();

        Slow obj1 = new B();
        obj1.slow();
        obj1.run();
        System.out.println(obj.age);
    }
}



// What is Enum in Java

enum Status {
    Runnnig, Pending, Failed, Completed
}

enum Laptop {
    Macbook(1500), XPS(1000), Surface(800), Thinkpad(500);
    private int price;
    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public int setPrice(int price) {
        return this.price = price;
    }
}
class OOP {
    public static void main(String[] args) {
//        int i = 5;
//        Status s = Status.Completed;
//        Status[] ss = Status.values();
//        System.out.println(s);
//        for (Status sss : ss) {
//            System.out.println(sss + "  ");
//            System.out.println(sss.ordinal() + "  ");
//        }
//        System.out.println(s.ordinal());

        // Enum if and Switch in Java

        Status status = Status.Completed;
        if (status == Status.Runnnig) {
            System.out.println("Please wait");
        } else if (status == Status.Pending) {
            System.out.println("Please wait");
        } else if (status == Status.Failed) {
            System.out.println("pls Try Again");
        } else if (status == Status.Completed) {
            System.out.println("Completed!");
        }

        // Using Switch
        switch (status){
            case Runnnig:
                System.out.println("Runnnig");

            case Pending:
                System.out.println("Pending");
            case Failed:
                System.out.println("Failed");
            case Completed:
                System.out.println("Completed");
        }

        // Enum Class in Java

        Laptop lap = Laptop.Macbook;
        System.out.println(lap);
        System.out.println(lap.getPrice());

        for (Laptop l : Laptop.values()) {
            System.out.println(l + " : " + l.setPrice(l.getPrice()));
        }
    }

}



//  What is Annotation in Java

class A {
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A show method");
    }
}
// show you intention to the compiler inn case you make mistake
class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B show method");
    }
}

// Functional Interface New in Java
@FunctionalInterface  // Functional Interface has only one method
interface AA {
//    void show(int i);
    int add (int i, int j);
//    void move(); // Error
}
class BB implements AA {
    public void show() {
        System.out.println("In BB show method");
    }
}
class OOP {
    public static void main(String[] args) {
        B b = new B();
        b.showTheDataWhichBelongsToThisClass();

        AA obj = new AA(){
            public int add(int i, int j){
                return i  +  j;
            }
        };
        int result = obj.add(5, 5);
        System.out.println(result);

        //  Lambda Expression in Java 8
        // Lambda Expression only works with Functional Interface

        AA objLambda  = (int i, int j) -> i + j;
        int result2 = objLambda.add(5, 10);
        System.out.println(result2);

    }
//}


// Type Types of Interface in Java
// Normal, Functional(SAM), Marker
// Normal  ---------------- has Two or more Methods
// Functional(SAM) --------------  has only one method
// Marker ----------------- Blank Interface




// What is Exception in Java
// Compile time Error
// Runtime Error ------------------------ Exception Errors
// Logical Error



class  OOP {
    public static void main(String[] args) {
        int i = 4;
        int j = 18;

        int  nums[]  =  new int[5];
        try {
            j = 18/i;
            System.out.println(j);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("arithmetic exception" + " " +  e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your bound" + " " + e);
        }
        catch (Exception e) {
            System.out.println("Something went wrong" +" " + e);
        }
    }
}


// User Input using BufferedReader and Scanner in Java
class OOP {
    public static void main(String[] args) {

//       int num =  System.in.read();   // it gives you Ascii Value
//       System.out.println(num);

        // So we use BufferReader

//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int num  = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//        bf.close();


        // using scanner
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//    }
}



// Collection API in Java

// Collection ------------------- List, Ques, Set
class OOP {
    public static void main(String[] args) {

        //  ArrayList in Java
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(90);
        numbers.add(80);

        int index = numbers.indexOf(80);
        System.out.println(index);

        System.out.println(numbers);


        // Set In java
        // Set support unquie values


        //  For non sorted value we use  HashSet
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(80);
        set.add(80);
        set.add(20);
        set.add(90);

        System.out.println(set);
        for (int n: set)
        {
            System.out.println(n);
        }

       For sorted value we use  TreeSet
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(8);
        set.add(2);
        set.add(8);
        set.add(6);

        System.out.println(set);
        for (int n: set)
        {
            System.out.println(n);
        }


        // Map in Java
        // Map uses Key and value pair
        Map<String, Integer> student  = new HashMap();
        // type of key here is string and type of value here is integer
        student.put("shams", 70);
        student.put("jamiu", 60);
        student.put("imran", 50);
        student.put("musta", 100);

        System.out.println(student);
        System.out.println(student.get("imran"));
        System.out.println(student.keySet());


        for (String key : student.keySet()) {
            System.out.println(key + ": " + student.get(key));

        }

        // Sorting In java

        class Student {
            int age;
            String name;

            public Student(int age, String name) {
                this.age = age;
                this.name = name;
            }
            public String toString() {
                return "Studennt [age=" + age + ", name=" + name + "]";
            }
        }
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if(i.age > j.age)
                    return 1;
                else
                    return -1;
            };
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(18, "Shams"));
        studs.add(new Student(22, "Jamiu"));
        studs.add(new Student(14, "Nasir"));
        studs.add(new Student(17, "Imran"));

        Collections.sort(studs, com);

        for (Student s: studs )
        {
            System.out.println(s);
        }



        //  Need of Stream API in Java
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(5);

        int sum = 0;
        for (int n: nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        // using foreach
        nums.forEach(n -> System.out.println(n));
        // Using Stream API

        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(6);
        nums.add(8);
        nums.add(5);

        Stream<Integer> s1 = nums.stream();
        s1.forEach(System.out::println);

    }
}















