import java.util.Scanner;
 class calculator
{
 public static void main(String args[])
 {
   int a,b,c,choice=0;
   System.out.println("Enter two numbers");
   Scanner x= new Scanner(System.in);
   a=x.nextInt();
   Scanner y= new Scanner(System.in);
   b=y.nextInt();
  

   System.out.println("Enter your calculation method\n  1.Addition\n 2.Subtraction\n 3. Multiplication\n 4. Division\n");
   Scanner z=new Scanner(System.in);
   choice=z.nextInt();
   switch(choice)
   {
     case 1: c= a+b;
	 System.out.println("The addition"+c);
	 break;
	 case 2: c= a-b;
	 System.out.println("The subtraction"+c);
	 break;
	 case 3: c= a*b;
	 System.out.println("The multiplication"+c);
	 break;
	 case 4: c= a/b;
	   if (b==0) 
	   {
	   System.out.println("Division cannot take place when number 2 is 0");
	   }
       if (b>0) 	
	   {		   
	   System.out.println("The division"+c);
	}
	 break;	   
			 		   
	
      
	}
  }
}