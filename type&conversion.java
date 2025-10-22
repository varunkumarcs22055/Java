class TypeConversion{
    /**
     * @param args
     */
    public static void main(String args[]){
        // float f = 10.5f;
        // int i = (int)f;
        // System.out.println("Float value: " + f);
        // System.out.println("Converted Integer value: " + i);
        // int a = 257;
        // byte b = (byte)a;
        // System.out.println("Converted Byte value: " + b);


        // Assignment operator
        // int num = 2;
        // int num2 = 5;
        // int result = num % num2; // division
        // System.out.println("Result: " + result);
        // num2 -= num; // num2 = num2 - num
        // System.out.println("Updated num2: " + num2);

        // Increment and Decrement operator
        // post increment
        // int a = 5;
        // int b = a++; // b = 5, a = 6

        // // pre increment
        // int x = 5;
        // int y = ++x; // y = 6, x = 6
        // System.out.println("a: " + a + ", b: " + b);
        // System.out.println("x: " + x + ", y: " + y);

        // Relational operator
        // int p = 10;
        // int q = 20;
        // System.out.println(p > q); // false
        // System.out.println(p < q); // true
        // System.out.println(p >= q); // false
        // System.out.println(p <= q); // true
        // System.out.println(p == q); // false
        // System.out.println(p != q); // true

        // Logical operator using AND(&&) and OR(||)
        // int p = 40;
        // int q = 30;
        // int r = 50;
        // boolean result = (p < q) && (q < r); // true && true = true
        // System.out.println("Result: " + result);
        // result = (p < q) || (q > r); // true || false = true
        // System.out.println("Result: " + result);
        // result = !(p < q); // !true = false
        // System.out.println("Result: " + result);

        //Conditional Statements
        // if-else Greater number
        // if(p>q && p>r){
        //     System.out.println("P is the greatest");
        // }
        // else if(q>r){
        //     System.out.println("Q is the greatest");
        // }
        // else{
        //     System.out.println("R is the greatest");
        // }
    //Even and odd
    // int n = 19;
    // if(n%2 == 0){
    //     System.out.println(n + " is even");
    // }
    // else{
    //     System.out.println(n + " is odd");
    // }

    //Ternary operator
    // int result = (n%2 == 0) ? 10 : 20;
    // System.out.println("Result: " + result);
        

        //Switch case

        // int day = 5;
        // switch(day){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
            
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
            
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;

        //     case 4:
        //         System.out.println("Thursday");
        //         break;

        //     case 5:
        //         System.out.println("Friday");
        //         break;

        //     case 6:
        //         System.out.println("Saturday");
        //         break;

        //     case 7:
        //         System.out.println("Sunday");
        //         break;

        //     default:
        //         System.out.println("Invalid day");
        //     }
        // }


        //loops - for, while, do-while
        System.out.println("Using for loop \n \n");
        for(int i=0;i<5;i++){
            System.out.println("Hello World ");
        }
        System.out.println("Using while loop \n \n");
        int i = 0;
        while(i<5){
            System.out.println("Hello World ");
            i++;
        }
        System.out.println("Using do-while loop \n \n");
        i=0;
        do{
            System.out.println("Hello World ");
            i++;
        }while(i<5);
    }
}