class Students{
    String name;
    int age;
    int rollno;
}

public class Array {
    public static void main(String[] args){
        // int num[]={1,2,3,4,5};
        // num[2]=10;
        // System.out.println(num[2]);

        // int num[]=new int[5];
        // num[0]=1;
        // num[1]=2;
        // num[2]=3;
        // num[3]=4;
        // num[4]=5;
        // for(int i=0;i<5;i++){
        //     System.out.println(num[i]);
        // }

        // Multi Dimensional Array
        // int numbers[][]=new int[3][3];
        // numbers[0][0]=1;
        // numbers[0][1]=2;
        // numbers[0][2]=3;
        // numbers[1][0]=4;
        // numbers[1][1]=5;
        // numbers[1][2]=6;
        // numbers[2][0]=7;
        // numbers[2][1]=8;
        // numbers[2][2]=9;
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(numbers[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        Students s1=new Students();
        s1.name="Alice";
        s1.age=20;
        s1.rollno=101;

        Students s2=new Students();
        s2.name="Bob";
        s2.age=22;
        s2.rollno=102;

        Students s3=new Students();
        s3.name="Charlie";
        s3.age=21;
        s3.rollno=103;


        // Array of Objects
        Students[] students=new Students[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        students[0].name="Chat"; // Modifying name of first student

        // for(int i=0;i<students.length;i++){
        //     System.out.println("Name: "+students[i].name);
        //     System.out.println("Age: "+students[i].age);
        //     System.out.println("Roll No: "+students[i].rollno);
        // }

        // int num[]= {10,20,30,40,50};
        // for(int n : num){
        //     System.out.println(n);
        // }

        // for(Students st : students){
        //     System.out.println("Name: "+st.name);
        //     System.out.println("Age: "+st.age);
        //     System.out.println("Roll No: "+st.rollno);
        // }

        String name = new String("Hello");
        System.out.println(name + " World");
        System.out.println(name.concat(" World"));

        // String litreal pool in java
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2); // true

        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str3 == str4); // false
    }
}