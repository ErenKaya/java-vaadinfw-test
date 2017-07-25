package com.eren.spring.data.lecture74;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Student {
	@NotNull(message="Have to specify name")
	private String name;
	@NotNull(message="Age can not null")
	@Min(value=0, message="Cannot be smaller than 0")
	@Max(value=100, message="Cannot be grater than 100")
	private int age;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Student() {
	}
	
	
}
