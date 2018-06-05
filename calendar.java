import java.util.Scanner;

public class calendar {

	  public static void main(String[] args)
	  {
	     Scanner input = new Scanner(System.in);
		 
		 int luna, anul;
		 
		 System.out.print("Introduceti luna \n");
		  luna = input.nextInt();
		 System.out.print("Introduceti anul\n");
		 anul = input.nextInt();
		 
		 switch (luna)
		 {
			 
		  case 1: luna = 1;
		  System.out.println("Ianuarie 31 zile\n");
		  break;
		  
		  case 2: luna = 2;
		  {
			  if (anul % 4 == 0)
			  {
			    if(anul % 100 == 0 && anul % 400 != 0)
				{
				System.out.print("Februarie " + anul + " a avut 28 de zile");
				} else { 
			    	System.out.print("Februarie " + anul + " a avut 29 de zile"); 
				}
				 else {
					 System.out.print("Februarie " + anul + " a avut 28 de zile");
			  }
		  }break;
		  case 3: luna = 3;
			System.out.println("Martie 31 zile");
		  break;
		  case 4: luna = 4;
			System.out.println("Aprilie 30 zile");
		  break;
		  case 5: luna = 5;
			System.out.println("Mai 31 zile");
		  break;
		  case 6: luna = 6;
			System.out.println("Iunie 30 zile");
		  break;
		  case 7: luna = 7;
			System.out.println("Iulie 31 zile");
		  break;
		  case 8: luna = 8;
			System.out.println("August 31 zile");
		  break;
		  case 9: luna = 9;
			System.out.println("Septembrie 30 zile");
		  break;
		  case 10: luna = 10;
			System.out.println("Octombrie 31 zile");
		  break;
		  case 11: luna = 11;
			System.out.println("Noiembrie 30 zile");
		  break;
		  case 12: luna = 12;
			System.out.println("Decembrie 31 zile");
		  break;
		  
		  default: 
			
			System.out.println("nu ai ales luna bine");
		 }
	 }
	 
	
	
	
}
