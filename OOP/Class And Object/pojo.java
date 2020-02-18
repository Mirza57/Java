  
  
  /*
  
  IF YOU DONT KNOW WHAT ARE POJO CLASSES THERE ARE FEW EXAMPLES WHICH MAY HELP YOU;
  POJO CLASSES ARE THOSE CLASSES IN WHICH EVERY VARIABLE SHOULD BE PRIVATE IN CASE 
  IF ANY ONE VARIABLE IS NOT PRIVATE SO THAT CLASS SHOULD NOT BE CALLED AS POJO CLASS		
  IN POJO CLASS IT IS NECESSARY TO CREATE SETTERS & GETTERS IN ORDER TO ACCESS PRIVATE VARIABLES 
  
  */
  
  
      class Birds
      {                             //1
	  private String name;
      private int legs;
	  private String type;
	  
	  public void setName(String name){
		  this.name=name;
	  }
	  public void setLegs(int legs){
		  this.legs=legs;
	  }
	  public void setType(String type){
		  this.type=type;
	  }
	  public String getName(){
		  return this.name;
	  }
	  public int getLegs(){
		  return this.legs;
	  }
	  public String getType(){
		  return this.type;
	  }
	  
  }	  
  
      class Team                    //2
	  {
		  private String name;
          private String title;
          private int noOfPlayers;

          public void setName(String name){
           this.name=name;
		  }
          public void setTitle(String title){
		  this.title=title;
		  }			  
		  public void setNoOfPlayers(int noOfPlayers){
			  this.noOfPlayers=noOfPlayers;
		  }
		  
		  public String getName(){
			  return this.name;
		  }
		  public String getTitle(){
			  return this.title;
		  }
		  public int getNoOfPlayers(){
		  return this.noOfPlayers;
		  }
	  }
	  
	  class Fruits                  //3
	  {
		  private String name;
		  private String taste;
		  
		  public void setName(String name){
			  this.name=name;
		  }
		  public void setTaste(String taste){
			  this.taste=taste;
		  }
		  
		  public String  getName(){
			  return this.name;
		  }
		  public String getTaste(){
			  return this.taste;
		  }
	  }
	  
	  class Vegetables              //4
	  {                            
		  private String name;
		  private String type;
		  
		  public void setName(String name){
			  this.name=name;
		  }
		  public void setTaste(String taste){
			  this.taste=taste;
		  }
		  
		  public String  getName(){
			  return this.name;
		  }
		  public String getTaste(){
			  return this.taste;
		  }
		  
	  }
	  
	  class Vehicles                //5
	  {
		  private String name;     
		  private int wheels;
		  
		  public void setName(String name){
			  this.name=name;
		  }
		  public void setWheels(int wheels){
			  this.wheels=wheels;
		  }
		  
		  public String getName(){
			  return this.name;
		  }
		  public int getWheels(){
			  return this.wheels;
		  }
	  }
	  
	  class Parents                 //6
	  {
		  private int children;
		  private String names;
		  
		  public void setName(String names){
		     this.names=names;
		  }
		  public void setChildren(int children){
			  this.children=children;
		  }
		  
		  public String getName(){
			  return this.names;
		  }
		  public int getChildren(){
			  this.children;
		  }
	  }
	  
	  class Animals                 //7
	  {
		 private String type;
		 private String name;
		 
		 public void setName(String name){
			 this.name=name;
		 }
		 public void setType(String type){
			 this.type=type;
		 }
		 
		 public String getName(){
			 return this.name;
		 }
		 public String getType(){
			 return this.type;
		 }
	  }
	  
	  class Country                 //8
	  {
		  private String name;
		  private int provinces;
		  
		  public void setName(String name){
			  this.name=name;
		  }
		  public void setProvinces(String provinces){
			  this.provinces=porvinces;
		  }
		  
		  public String getName(){
			  return this.name;
		  }
		  public int provinces(){
			  return this.provinces;
		  }
		  
	  }
	  
	  class Fishes                  //9
	  {
		  private String size;
		  private String type;
		  
		  public void setSize(String size){
			  this.size=size;
		  }
		  public void setType(String type){
			  this.type=type;
		  }
		  public String getSize(){
			  return this.size;
		  }
		  public String getType(){
			  return this.type;
		  }
		  
	  }
	  
	  class University              //10
	  {
		  private String departments;
		  private String timmings;
		  
		  public void setDepartments(String departments){
		  this.departments=departments;
		  }
		  public void setTimmings(String timmings){
			  this.timmings=timmings;
		  }
		  
		  public String getDepartments(){
			  return this.departments;
		  }
		  public String getTimmings(){
			  return this.timmings;
		  }
	  }		  
	  
	  class Cricket                 //11
	  {
		  private String players;
		  private String handed;
		  
		  public void setPlayers(String players){
			  this.players=players;
		  }
		  public void sethanded(String handed){
			  this.handed=handed;
		  }
		  
		  public String getPlayers(){
			  return this.players;
		  }
		  public String getHanded(){
			  return this.handed;
		  }
	  }
	  
	  class House                   //12
	  {
		  private String location;
		  private int rooms;
		  
		  public void setLocation(String location){
			  this.location=location;
		  }
		  public void setRooms(int rooms){
			  this.rooms=rooms;
		  }
		  
		  public String getLocation(){
			  return this.location;
		  }
		  public int getRooms(){
			  return this.rooms;
		  }
	  }
	  
	  class CellPhone               //13
	  {
		  private String company;
		  private int price;
		  
		  public void setCompany(String company){
			  this.company=company;
		  }
		  public void setPrice(int price){
			  this.price=price;
		  }
		  public String getCompany(){
			  return this.company;
		  }
		  public int getPrice(){
			  return this.price;
		  }
	  }
	  
	  class Ocean                   //14
	  { 
	      private String name;
		  private String location;
		  
		  public void setName(String name){
			  this.name=name;
		  }
		  public void setLocation(String location){
			  this.location=location;
		  }
		  public String getName(){
		      return this.name;
		  }
		  public String getLocation(){
			  return this.location;
		  }
	  }
	  
	  class Glasses                 //15
	  {
		  public String shades;
		  public String colors;
		  public String variety;
		  
		  public void setShades(String shades){
			  this.shades=shades;
		  }
		  public void setColors(String colors){
			  this.colors=colors;
		  }
		  public void setVariety(String variety){
			  this.variety=variety;
		  }
		  
		  public String getShades(){
			  return this.shades;
		  }
		  public String getColors(){
			  return this.colors;
		  }
		  public String getVariety(){
			  return this.variety;
		  }
	  }
		  
		  
		  