package com.acc;

public class Test
{

	public static void main(String[] args) 
	{
		 Employee emp[]=new Employee[5];
		 
		 emp[0] = new Employee(1,"Sid","Pune",100000);
		 emp[1] = new Employee(2,"Ved","Mumbai",200000);
		 emp[2] = new Employee(3,"Hally","Banglore",300000);
		 emp[3] = new Employee(4,"Renu","Hyderabad",400000);
		 emp[4] = new Employee(5,"Aru","Pune",500000);
		 
		 System.out.println("Total no of obajects created are = "+Employee.noemp);
		 System.out.println("");
	 
		 for(Employee e:emp)
		 {
			 System.out.println(e);
		 } 
		
	}

}
