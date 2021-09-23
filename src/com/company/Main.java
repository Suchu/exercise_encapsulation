package com.company;

public class Main {
    public static void main(String[] args) throws Exception {
        Student student = new Student("Michelle", 'A', 5);
        System.out.println("Name: " + student.getName());
        System.out.println("Current Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        student.upgradeGrade();
        System.out.println("Upgraded Grade to: " + student.getGrade());
        student.downgradeGrade();
        System.out.println("Downgraded Grade to: " + student.getGrade());


    }
}
