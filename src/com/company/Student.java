package com.company;

public class Student {

    protected String name;
    private char[] studentGrade = {'A', 'B', 'C', 'D', 'E', 'F'};
    private char grade;
    protected int group;
    private String secretNickName = "MySecretNickName";

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public int getGroup() {
        return group;
    }

    public void upgrade() {
        for (int i = 0; i < studentGrade.length; i++) {
            if (studentGrade[i] == grade && i != 0) {
                grade = studentGrade[i - 1];
            }
        }
    }

    public void downgrade() {
//        for (int i = 0; i < studentGrade.length; i++) {
//            if (studentGrade[i] == grade && i != 0) {
//                grade = studentGrade[i + 1];
//            }
//        }
    }

    public static void main(String[] args) {
        Student student = new Student("Michelle", 'F', 1);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        student.upgrade();
        System.out.println("Upgraded to: " + student.getGrade());
        student.downgrade();
        System.out.println("Downgraded to: " + student.getGrade());
    }
}
