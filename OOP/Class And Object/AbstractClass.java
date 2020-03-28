abstract class Company   //This is all about Abstract classes 
  {
   abstract void name(); // These are abstract methods
   abstract void salary();
  }
    class Employe1 extends Company
	{
		void name(){   //Here I have created a body of abstract methods
			System.out.println(" My name is Arslan ");
		}
		
		void salary(){   //Here I have created a body of abstract methods
			System.out.println(" My current salary is 40,000PKR ");
		}
	}
	
	class Employe2 extends Company   // Another class
	{
		void name(){    //Here I have created a body of abstract methods
			System.out.println(" My name is Faiq  ");
		}
		
		void salary(){    //Here I have created a body of abstract methods
			System.out.println(" My current salary is 50,500PKR ");
		}
		
		public static void main(String args[]){   // Main class
			
			Company c=new Employe1(); // Here I have created a constructor of child class because parent class is abstract class and we are unable to create an object of abstract class
			c.name();
			c.salary();
			
			Company c1=new Employe2();
			c1.name();
			c1.salary();
			
	}
	}
