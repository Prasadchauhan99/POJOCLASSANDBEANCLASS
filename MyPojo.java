package com.pojo.in;

public class MyPojo {

	public static void main(String[] args) {
		
		Student s= new Student();
		s.setRoll(590);
		s.setName("PRASAD K CHAUHAN");
		s.setSchool("TKHS");
		
		Student s1= new Student();
		s1.setRoll(592);
		s1.setName("VINAY");
		s1.setSchool("TKHS");
		
		Student s2= new Student();
		s2.setRoll(592);
		s2.setName("VINAY");
		s2.setSchool("TKHS");
		
		Student s3= new Student();
		s3.setRoll(592);
		s3.setName("VINAY");
		s3.setSchool("TKHS");
		
		
		Student[] st = new Student[] {s,s1,s2,s3};
		
		
		for(Student student:st) {
		System.out.println(student);
		}
		
//		System.out.println(s.getRoll());
//		System.out.println(s.getName());
//		System.out.println(s.getSchool()); 
//		
//		System.out.println(" ===================  ");
//		
//		System.out.println(s1.getRoll());
//		System.out.println(s1.getName());
//		System.out.println(s1.getSchool()); 
		
		
	}

}
