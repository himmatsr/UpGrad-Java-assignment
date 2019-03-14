package upgrad;//package name upgrad which have to java classes named as Student and Runner
/*
this is a student class
it contain three private member variable: name, cgpa and token
and contains 3 member functions : getName(), getCGPA(), getToken()
and a constructor
*/

public class Student {
//class declaration
	private String name;
	private double cgpa;
	private int token;
	public Student(String name,double cgpa,int token){
//parameterized contructor setting values of name, cgpa and token
//this keyword is used to distinguish between member variable and local variable
		this.name=name;
		this.cgpa=cgpa;
		this.token=token;
	}
	String getName(){//function returns variable name of object of Student class
		return name;
	}
	double getCGPA(){//function returns variable cgpa of object of Student class
		return cgpa;
	}
	int getToken(){//function returns variable token of object of Student class
		return token;
	}    
}
