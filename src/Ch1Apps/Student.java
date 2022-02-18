/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ch1Apps;

/**
 *
 * @author aashgar
 */
public class Student implements Person{
    private String name;
    private  String major;
    private double grade;

    public Student(String name, String major, double grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", major=" + major + ", grade=" + grade + '}';
    }
    
}
