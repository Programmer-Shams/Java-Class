
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


//         Instead we can use a loop;
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


        //  jagged and 3D Array in Java
        // Not specifying the size of the internal Array in a Big Array
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
//}


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
    private String name = "shams";

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
        Human hum = new Human();
        hum.setAge(40);
        hum.setName("Shamsudeen");
        System.out.println(hum.getAge() + " : " +  hum.getName());
    }
}





