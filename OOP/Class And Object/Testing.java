//Here is java mini school project 
//Admission Portal
import java.util.Scanner;

class SchoolManagement   //This is the POJO class in which all variables are private
   {
	private String name;
	private int rollNo;
	private int fees;
	private int aYear;
	private String aMonth;
	
	public void setName(String name)   // Here I have created Getters & Setters of private variables of this class
	{
		this.name=name;
	}
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	public void setFees(int fees)
	{
		this.fees=fees;
	}
	public void setAYear(int aYear )
	{
		this.aYear=aYear;
	}
	public void setAMonth(String aMonth)
	{
		this.aMonth=aMonth;
	}
	
     
	
	 public String getName(){   //These are Getters
	    return this.name;
	 }
	 public int getRollNo(){
		 return this.rollNo;
	 }
	 public int getFees(){
		 return this.fees;
	 }
	 public int getAYear(){
		 return this.aYear;
	 }
	 public String getAMonth(){
		 return this.aMonth;
	 }
	 
  }	 
  
  
     class Management     //Here I have created another class in which I have created methods regarding to this mini project 
	 {
		 
		Scanner s1 =new Scanner(System.in);                 //This is Scanner class used to take input form user
		SchoolManagement sm =new SchoolManagement();
		String name;
	    int rollNo;
	    int fees;
	    int aYear;
	    String aMonth;
		
		
		 void menu()      // This is a method which show the MENU on console
		 {
			 
		System.out.println("1: Registeration ");
		System.out.println("2: Delete ");
		System.out.println("3: Update ");
		System.out.println("4: View ");
		System.out.println("5: Exit ");
		
		
		int a;
		 System.out.println(" Select any one option from given choices ");
		 
	     a=s1.nextInt();
		 
		 if(a==1){
			 
			 registeration();
		 }
		 else if(a==2){
			 
			 DeleteData();
			 
		 }
		 else if(a==3){
			 
			  Update();
		 }
		 else if(a==4){
			  
			  View();
		 }
		 else if(a==5){
			 
			   Exit();
		 }
		 
		} 
      
		 
		 void registeration()            // In this method I have set variables in Setters 
		 {
			
			        System.out.print(" Enter Your Name  .....        ");
		              name=s1.next();
					sm.setName(name);
                    System.out.print(" Enter Roll number .....       ");
                      rollNo=s1.nextInt();
					sm.setRollNo(rollNo);
                    System.out.print(" Enter Fees        .....       ");
                     fees=s1.nextInt();
					sm.setFees(fees);
                    System.out.print(" Enter Admission Month .... ");
                     aMonth=s1.next();
					sm.setAMonth(aMonth);
                    System.out.print(" Enter Admission Year ....  ");
                     aYear=s1.nextInt();
					sm.setAYear(aYear);
					System.out.println(" ");
					System.out.println(" ");
					
					System.out.print(" ...............................You have registered successfully ");
					
					menu();
		 }
		 
		 
		        void View()       //This methd show that you are registered successfully or not
			{
					System.out.print("                               Enter your roll for identification  ");
					
				   int x;
				   x=s1.nextInt();
				   if(x==rollNo){
					   
					 System.out.println("                  Your Name is .............. " +sm.getName());
		                         System.out.println("                  Roll number is ............ "+ sm.getRollNo());  
		                         System.out.println("                  Fees is   ................... "+sm.getFees());
					 System.out.println("                  Admission Month is .... "+sm.getAMonth());
					 System.out.println("                  Admission Year is  ..... "+sm.getAYear());
                   
				   }
				   
				   else{
				          System.out.println("                                   Your roll no is incorrect ");
				   }
				   
				   menu();
				}
				
				
				 void Update()  //This method will update your old information which you have provided in Registeration
				 {
					 
					 int x;
				   x=s1.nextInt();
				   if(x==rollNo){
				        System.out.print(" Enter Your Name  .....        ");
		                        name=s1.next();
					sm.setName(name);
                                        System.out.print(" Enter Roll number .....       ");
                                        rollNo=s1.nextInt();
					sm.setRollNo(rollNo);
                                        System.out.print(" Enter Fees        .....       ");
                                        fees=s1.nextInt();
					sm.setFees(fees);
                                        System.out.print(" Enter Admission Month .... ");
                                        aMonth=s1.next();
					sm.setAMonth(aMonth);
                                        System.out.print(" Enter Admission Year ....  ");
                                        aYear=s1.nextInt();
					sm.setAYear(aYear);
					System.out.println(" ");
					System.out.println(" ");
					
					System.out.print(" ........................................Updated successfully ");
		                }
				   
				   else{
				            System.out.println("                                   Your roll no is incorrect ");
				   }
				   
				   menu();
				   
				 }
				 
			 void DeleteData() // This method will delete your earlier data
			 {
					 System.out.print("                               Enter your roll for identification  ");
					
				   int x;
				   x=s1.nextInt();
				   
				   if(x==rollNo){
					   sm.setName(null);
					   sm.setRollNo(0);
					   sm.setFees(0);
					   sm.setAMonth(null);
					   sm.setAYear(0);
					   
					   System.out.println("                  Your Name is .............. " +sm.getName());
		                           System.out.println("                  Roll number is ............ "+ sm.getRollNo());  
		                           System.out.println("                  Fees is   ................... "+sm.getFees());
					   System.out.println("                  Admission Month is .... "+sm.getAMonth());
					   System.out.println("                  Admission Year is  ..... "+sm.getAYear());
                   
				   }
				   
				   else{
				            System.out.println("                                   Your roll no is incorrect ");
				   }
				   
				   menu();
				   
				 }
				 
				  void Exit(){
					    System.out.print(" ......Thanks for your precious time....... ");
                         	
				   }					   
		   
	 }
		         
		 
		 class Testing  //This is the main class in which I have called the method class by creating its object
		 {
			        public static void main (String args[]){
				 //Test t=new Test();
				  System.out.println("             ((............. Welcome to Mehran Admission Portal .....))  ");
				Management m=new Management();// Here is the object of method class
				
				 m.menu();
				 
			 }
		   } 
			 
