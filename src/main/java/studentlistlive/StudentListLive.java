/*
 * To change this license header, choose License Headers in Project Properties.
 * This class creates a list of students
 * May 2021
 */
package studentlistlive;

/**
 *
 * @author winma
 */
public class StudentListLive {
    
    public static void main(String[] args) {
        
        Student[] studentList = new Student[5];
        Student liz =  new Student("Liz");
        studentList[0] = liz;
        System.out.println(studentList[0].getStudent());
    }
    
}
