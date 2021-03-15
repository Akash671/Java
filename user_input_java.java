/*
Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the Oak name to Java*/
 
 //author akash kumar

import java.util.*;

public class user_input_java
  {   
   public static void main(String args[])   
     {
        Scanner sc=new Scanner(System.in);  //system.in is standard input stream
        System.out.print("Enter string :");
        String str=sc.nextLine();
        System.out.println(str);
        System.out.println("Enter number :");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.print("Enter float number :");
        float b=sc.nextFloat();
        System.out.println(b);
        System.out.print("Enter double number :");
        double c=sc.nextDouble();
        System.out.println(c);
        System.out.println("Enter bool value");
        boolean bo=sc.nextBoolean();//true or false
        System.out.println(bo);
        System.out.println("short variables:");
        short sh=sc.nextShort();
        System.out.println(sh);
        System.out.println("long variables:");
        long l=sc.nextLong();
        System.out.println(l);
     }
  }
    
