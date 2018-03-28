package com.sam.question2;

public class Student implements Comparable<Student>{
	private String ID = "";
	private String name = "";
	private String gpa = "";

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int i = o.getGpa().compareTo(gpa);
		if(i!=0)
			return i;
		
		i = name.compareTo(o.getName());
		if(i!=0)
			return i;
		
		return ID.compareTo(o.getID());
	}
}
