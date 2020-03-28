interface  Company
  {                           //This is all about interfaces
    void name();
    void salary();
  }
    class Employe1 implements Company
	{
		public void name(){
			System.out.println(" My name is Arslan ");
		}
		
		public void salary(){
			System.out.println(" My current salary is 40,000PKR ");
		}
	}
	
	class Example_Interface implements Company
	{
		public void name(){
			System.out.println(" My name is Faiq  ");
		}
		
		public void salary(){
			System.out.println(" My current salary is 50,500PKR ");
		}
		
		public static void main(String args[]){
			
			Company c=new Employe1();
			c.name();
			c.salary();
			
			Company c1=new Example_Interface();
			c1.name();
			c1.salary();
			
	}
	}
