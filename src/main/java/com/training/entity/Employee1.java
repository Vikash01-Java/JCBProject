package com.training.entity;

public class Employee1 {
private int id;
private String name;
private String gender;
private int salary;
public Employee1() {
}
public Employee1(int id,String name, String gender, int salary) {
	super();
	this.name = name;
	this.gender = gender;
	this.id = id;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
}


}

