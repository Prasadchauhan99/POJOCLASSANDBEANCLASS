package com.bean.in;

public class MyBean {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setID(101);
		e.setEname("PRASAD");
		e.setEsal(50000);
		
		Employee e1=new Employee();
		e1.setID(102);
		e1.setEname("CHAUHAN");
		e1.setEsal(50000);
				
		
		Employee e2=new Employee();
		e2.setID(103);
		e2.setEname("SRINU");
		e2.setEsal(50000);
		
		Employee e3=new Employee();
		e3.setID(104);
		e3.setEname("SHIVA");
		e3.setEsal(50000);
				
		
		Employee em[] = new Employee[] {e,e1,e2,e3};
		
		double totalsalary=0;
		for(Employee employee:em)
		{

			 totalsalary = totalsalary +employee.getEsal();
		}
		System.out.println("TOTAL SALARY OF EMPLOYEE IS: "+totalsalary);
		
		for(Employee el:em)
		{
			System.out.println(el);
			System.out.println(el.getID() +" "+ el.getEname() +" "+ el.getEsal());
		}
		
		
		
		

//		System.out.println(e.getID());
//		System.out.println(e.getEname());
//		System.out.println(e.getEsal());
//		
//		System.out.println(e1.getID());
//		System.out.println(e1.getEname());
//		System.out.println(e1.getEsal());

	}

}
