
class Hello{
public static void main(String a[]){
    int num1 = 9; // under 2 billion
    byte num2 = 4; // under 128
    short num3 = 56; // under 32k
    long num4 = 999999999; // under 9 quintillion
    float num5 = 5.67f; // 7 decimal points
    double num6 = 67.890123456789; // 15 decimal points
    char ch = 'A'; // single character
    boolean b = true; // true or false
    System.out.println("Hello World");
    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(num5);
    System.out.println(num6);
    System.out.println(ch);
    System.out.println(b);


    //Literals
    int num7 = 0b1010; // binary literal = 10 in decimal
    int num8 = 100_00_000; // underscore for better readability
    int num9 = 0xFF; // hexadecimal literal = 255 in decimal
    System.out.println(num7);
    System.out.println(num8);   
    System.out.println(num9);
    double num10 = 1.23e3; // scientific notation = 1230.0
    System.out.println(num10);
 }
} 