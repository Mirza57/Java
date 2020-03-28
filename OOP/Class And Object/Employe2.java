abstract class Company
  {
   abstract void name();
   abstract void salary();
  }
    class Employe1 extends Company
	{
		void name(){
			System.out.println(" My name is Arslan ");
		}
		
		void salary(){
			System.out.println(" My current salary is 40,000PKR ");
		}
	}
	
	class Employe2 extends Company
	{
		void name(){
			System.out.println(" My name is Faiq  ");
		}
		
		void salary(){
			System.out.println(" My current salary is 50,500PKR ");
		}
		
		public static void main(String args[]){
			
			Company c=new Employe1();
			c.name();
			c.salary();
			
			Company c1=new Employe2();
			c1.name();
			c1.salary();
			
	}
	}