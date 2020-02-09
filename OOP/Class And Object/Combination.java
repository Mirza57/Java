class Birds
   {  // 1st class
   String name; 
   int type;
   int legs;
   
   void fly(){System.out.println("flying above mountain is my habbit");}
   void eat(){System.out.println("Likes insects and small animals");}
   }
   
 class Staff
   { //2nd class 
    String name;
	String gender;
	int age;
	
	void lowPaid(){System.out.println("Our salary is very low");}
	void highPaid(){System.out.println("Our salary is upto mark");}
   }
   
  class Student
  { //3rd class
   String name;
   int age;
   String behaviour;

   void richStudent(){System.out.println("We belong to noble families");}
   void poorStudent(){System.out.println("We belong to poor families");}
  }

  class Aeroplane
  {//4th class
   String country;
   String type;
   int size;
   void Jet(){System.out.println("Jet flies very fast");}
   void Plane(){System.out.println("This is for family services");}
  }

  class Shape
  {//5th class
   String type;
   int sides;
   String color;
   void Square(){System.out.println("Square has four sides");}
   void Triangle(){System.out.println("Triangle has three sides");}
  }
  
  class Fruits
  {//6th class
  String name;
  String season;
  void Apple(){System.out.println("Apple is good for health");}
  void Mango(){System.out.println("Mango is the king of fruits");}
  } 
  
  class Vegetables
  {//7th class
  String name;
  String season;
  void Potato(){System.out.println("Potato will make you fat");}
  void Tomato(){System.out.println("Tomato may cause serious disease");}
  }
  
  class University
  {//8th class
  String dept;
  int staffMembers;
  int noOfClasses;
  void Teacher1(){System.out.println("I teach Programming");}
  void Teacher2(){System.out.println("I teach Mathematics");}
  }
  
  class Parents
  {//9th class
  String name;
  int noOfChilds;
  int age;
  void child1(){System.out.println("Ahmad is a good boy");}
  void child2(){System.out.println("Nasir is a clever boy");}
  }
  
  class Vehicles
  {//10th class
  String name;
  int noOfTyres;
  static String waranty="2 years";
  void Parado(){System.out.println("Parado is reliable");}
  void Bicycle(){System.out.println("Bicycle makes you physically fit");}
  }
  
  class Pakistan
  {//11th class
   static int noOfprovinces=4;
   String capital;
   void P1(){System.out.println("Pakistan is Islamic Republic State");}
   void P2(){System.out.println("Pakistan ocupies unique geographical location");}
  }

  class Hostel
  {//12th class
   String Hname;
   int noOfRooms;
   static int noOfMess=1;
   void H1(){System.out.println("Hostel no 1 is A.Q");}
   void H2(){System.out.println("Hostel no 2 is Rashidi");}
  }

  class People
  {//13th class
   String name;
   String religion;
   String language;
   void British(){System.out.println("Britishers speaks English");}
   void China(){System.out.println("People of China speaks Chinese");}
  }

  class Bank
  {//14th class
   int employes;
   String name;
   String post;
   void E1(){System.out.println("Normal Paid");}
   void E2(){System.out.println("Experienced Employes");}
  }

  class Combination
  { 
    public static void main(String args[])
	{ 
      Birds b=new Birds();
      System.out.println(b.name="Falcon");
      System.out.println((b.type=3) + " types");
      System.out.println((b.legs)  + " legs");
      b.fly();
      b.eat();

      Staff sf=new Staff();
      System.out.println("name = " + (sf.name="Ali"));
      System.out.println("gender = " + (sf.gender="Male"));
      System.out.println("Age = "+	(sf.age=25));
      sf.highPaid();
    }
  }	