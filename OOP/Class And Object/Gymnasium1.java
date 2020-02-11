import java.util.Scanner;
class Gymnasium1{
	String name; 
	int rollNo;
	int fees;
	String rMonth;
	int rYear;
	
	
	void Menu(){
		
		
		
		System.out.println("1: Registeration ");
		System.out.println("2: Delete ");
		System.out.println("3: Update ");
		System.out.println("4: View ");
		System.out.println("5: Exit ");
		Scanner s1 =new Scanner(System.in);
		int a;
		 System.out.println(" Select any one option ");
		 System.out.print(" Enter the selected option ");
	    	a=s1.nextInt();
		switch(a)
		{
//Registeration		
                    case 1: 
					System.out.print(" Enter Your Name  .....        ");
		            name=s1.next();
                    System.out.print(" Enter Roll number .....       ");
                    rollNo=s1.nextInt();
                    System.out.print(" Enter Fees        .....       ");
                    fees=s1.nextInt();
                    System.out.print(" Enter Registeration Month .... ");
                    rMonth=s1.next();
                    System.out.print(" Enter Registeration Year ....  ");
                    rYear=s1.nextInt();
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("                            Congrats Registeration is successfull  "); 
					Menu();
                 break;
				 
//View Option		   
                   case 2:
                   
				    System.out.print("                               Enter your roll for identification  ");
					
				   int x;
				   x=s1.nextInt();
				   if(x==rollNo){
					   
					 System.out.println("                  Your Name is .............. " + name);
		             System.out.println("                  Roll number is ............ "+ rollNo);  
		             System.out.println("                  Fees is   ................... "+fees);
					 System.out.println("                  Registeration Month is .... "+rMonth);
					 System.out.println("                  Registeration Year is  ..... "+rYear);
                   
				   }
				   
				   else{
				   System.out.println("                                   Your roll no is incorrect ");
				   }
				   
                     Menu();
					 
					 break;
					 
//Update					 
				case 3: 
				
				int y;
					y=s1.nextInt();
					if(y==rollNo)
					{
				    System.out.print(" Enter Your Name  .....        ");
				    name=s1.next();
                    System.out.print(" Enter Roll number .....       ");
                    rollNo=s1.nextInt();
                    System.out.print(" Enter Fees        .....       ");
                    fees=s1.nextInt();
                    System.out.print(" Enter Registeration Month .... ");
                    rMonth=s1.next();
                    System.out.print(" Enter Registeration Year ....  ");
                    rYear=s1.nextInt();
					
					System.out.println("                                   Your Data has been updated successfullyS  "); 
					}
					
					else{
						System.out.print("                                You have entered wrong Roll Number ");
						}
					Menu();
					break;
					
					

//Delete Data		 
		      
					case 4:
					
		            name=null;
					rollNo=0;
					fees=0;
					rMonth=null;
					rYear=0;
					
					int z;
					z=s1.nextInt();
					if(z==rollNo){
					
           		     System.out.println(" Enter Your Name.............. " + name);
		             System.out.println(" Enter Roll number............ "+rollNo);  
		             System.out.println(" Enter Fees................... "+fees);
					 System.out.println(" Enter Registeration Month.... "+rMonth);
					 System.out.println(" Enter Registeration Year..... "+rYear);
					}
					
					else{ 
					System.out.print("     Enter the correct Roll Number   ");
					}
					
                     Menu();
					
//Exit
              case 5:  System.out.print(" ......Thanks for your precious time....... ");
                       break;		   
		   
		     }
       }				
				
				public static void main(String args[])
				{
					 Gymnasium g1=new Gymnasium();
					 System.out.println("             ((..... Welcome to Mehran Gymnasium System .....))  ");
					 g1.Menu();
					 
					
					 
					 
				 }
		}
