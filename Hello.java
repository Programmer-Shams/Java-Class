 class Hello {
    public static void main(String a[])
    {
        System.out.println("Hello World");
        System.out.println(3 + 8);
        System.out.println(5 + 5);
    }
 }

// Variables

 class Variables {
    public static void main(String a[])
    {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println("Result is: " + result);
    }
 }

// Data Types

 class DataTypes {
    public static void main(String a[])
    {
        int num1 = 10;
        byte by = 127;
        short sh = 32767;
        long l = 1234567890l;

        float f = 5.8f;
        double d = 5.8;

        char c = 'k';

        boolean b = true;

        System.out.println("Int: " + num1);
        System.out.println("Byte: " + by);
        System.out.println("Short: " + sh);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + b);

         // Literals
         int numB = 0b1010; // Binary
         int numH = 0x1010; // Hexadecimal

         System.out.println(numB);
         System.out.println(numH);

         char s = 'a';
         s++;
         System.out.println(s);
    }
 }

 class TypeConversion {
    public static void main(String a[]) {
        // byte b = 127;
        int c = 257;
        byte b = (byte) c;

        float f = 5.8f;
        int t = (int) f;
        System.out.println(b);
        System.out.println(t);

        byte b1 = 10;
        byte b2 = 30;
        int result = b1 * b2;
        System.out.println(result);
    }
 }

// Operators
class Operators {
    public static void main(String a[]) {
        int num1 = 10;
        int num2 = 20;
        int result = num1 + num2;
        System.out.println("Result is: " + result);

        int result1 = num1 - num2;
        System.out.println("Result is: " + result1);

        int result2 = num1 * num2;
        System.out.println("Result is: " + result2);

        int result3 = num1 / num2;
        System.out.println("Result is: " + result3);

        int result4 = num1 % num2;
        System.out.println("Result is: " + result4);

        int result5 = num1++;
        System.out.println("Result is: " + result5);

        int result6 = num1--;
        System.out.println("Result is: " + result6);

        // Logical Operators

        int x = 10;
        int y = 20;
        boolean results = x < y;

        System.out.println(results);
    }   

}

// Conditional Statements

class Conditional {
    public static void main(String[] args)
    {
//         // int x =  50;
//         // int y = 20;
//         // int z = 10;

//         // if (x < y && x < z) {
//         //     System.out.println("X is less Y And Z");
//         // } else {
//         //     System.out.println("Y And Z is less than X");
//         // }

        int x = 7;
        int y = 8;
        int z = 9;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        // Ternary Operator
        int a = 10;
        int b = 20;
        int result = (a > b) ? a : b;
        System.out.println(result);
    }
}

// Switch Statement

class Switch {
    public static void main(String[] args)
    {
        int day = 73;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}

// Loops

class Loop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
        System.out.println("Hi" + i);
        int j = 1;
        while (j <= 4) {
        System.out.println("Hello" + j);
        j++;
        }
        i++;
        }

        // do while loop
        int k = 1;
        do {
        System.out.println("Hi" + k);
        k++;
        } while (k <= 5);

        // for loop

        for (int h = 1; h <= 5; h++) {
            System.out.println("Day" + h);
            for (int j = 1; j <= 9;  j++) {
                System.out.println("  " + (j + 8) + "-" + (j + 9));
            }
        }
    }
}