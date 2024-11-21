package ConstructorsExamples;

public class Car {
	//parameterized constructor
	//Constructors can also take parameters, which is used to initialize attributes.
	int modelYear;
	  String modelName;

	  public Car(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }

	  public static void main(String[] args) {
	    Car myCar = new Car(1969, "Mustang");
	    Car mycar2=new Car(2009, "Audi");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	    System.out.println(mycar2.modelYear +"  "+mycar2.modelName);
	  }

	
	}


