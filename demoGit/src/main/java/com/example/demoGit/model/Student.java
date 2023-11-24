package com.example.demoGit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Builder

@Document
public class Student {

    @Id
    private int ID;
    private String Name;
    private int Age;
    private int Salary;

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                '}';
    }

    public Student(int ID, String name, int age, int salary) {
        super();
        this.ID = ID;
        Name = name;
        Age = age;
        Salary = salary;
    }

    public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    } }