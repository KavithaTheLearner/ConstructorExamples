package ConstructorsExamples;

public class Student {
	
	
	int marks;
	String name;
	
	Student(){
		System.out.println("hello");;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		Student s2 = new Student();
		
		System.out.println(s1.marks);
		System.out.println(s1.name);
	}

}
