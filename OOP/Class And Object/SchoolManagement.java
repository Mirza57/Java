import java.util.Scanner;

class SchoolManagement{
	private String name;
	private String rollNo;
	private int fees;
	private int aYear;
	private String aMonth;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setRollNo(String rollNo)
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
	
     		
       // Getters below
    
	
	 public String getName(){
	    return this.name;
	 }
	 public String getRollNo(){
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
  
  
     class Management{
		 
		Scanner s1 =new Scanner(System.in);
		SchoolManagement sm=new SchoolManagement();
		
		 void menu()
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
		 
		 void registeration(){
			
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
		 
		 
		        void View(){
					System.out.print("                               Enter your roll for identification  ");
					
				   int x;
				   x=s1.nextInt();
				   if(x==rollNo){
					   
					 System.out.println("                  Your Name is .............. " +sm.getName());
		             System.out.println("                  Roll number is ............ "+ sm.getRollNo());  
		             System.out.println("                  Fees is   ................... "+sm.getFees());
					 System.out.println("                  Admission Month is .... "+sm.AMonth());
					 System.out.println("                  Admission Year is  ..... "+sm.AYear());
                   
				   }
				   
				   else{
				   System.out.println("                                   Your roll no is incorrect ");
				   }
				   
				   menu();
				}
				
				
				 void Update(){
					 
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
				 
				 void DeleteData(){
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
					 System.out.println("                  Admission Month is .... "+sm.AMonth());
					 System.out.println("                  Admission Year is  ..... "+sm.AYear());
                   
				   }
				   
				   else{
				   System.out.println("                                   Your roll no is incorrect ");
				   }
				   
				   menu();
				   
				 }
				 
				   void Exit(){
					    System.out.print(" ......Thanks for your precious time....... ");
                       break;	
				   }					   
		   
		 
		         
		 
		 class Test{
			 public static void main (String args[]){
				 Test t=new Test();
				  System.out.println("             ((............. Welcome to Mehran Admission Portal .....))  ");
				 t.menu();
				 
			 }
				 
		 } 
			 