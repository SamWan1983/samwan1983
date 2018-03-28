package com.sam.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortStudent sorter = new SortStudent();
		sorter.sortStudent();
	}

	
	private void sortStudent() {
		List<Student> studentList = new ArrayList<Student>();
		Student stu1 = new Student();
		stu1.setGpa("3.68");
		stu1.setName("Tina");
		stu1.setID("33");
		studentList.add(stu1);
		
		Student stu2 = new Student();
		stu2.setGpa("3.85");
		stu2.setName("Louis");
		stu2.setID("85");
		studentList.add(stu2);
		
		Student stu3 = new Student();
		stu3.setGpa("3.75");
		stu3.setName("Samil");
		stu3.setID("56");
		studentList.add(stu3);
		
		Student stu4 = new Student();
		stu4.setGpa("3.75");
		stu4.setName("Samar");
		stu4.setID("19");
		studentList.add(stu4);
		
		Student stu5 = new Student();
		stu5.setGpa("3.76");
		stu5.setName("Lorry");
		stu5.setID("22");
		studentList.add(stu5);
		
		Collections.sort(studentList);
		for(int i = 0; i< studentList.size();i++) {
			System.out.println(studentList.get(i).getName());
		}
		
	}
}
