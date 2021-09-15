package com.company;

public class Student {

    protected String name;
    protected char[] studentGrade = { 'A', 'B', 'C', 'D', 'E', 'F' };
    protected char grade;
    protected int group;
    private String secretNickName;

    public Student(String name, char grade, int group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
        this.secretNickName = "MySecretNickName";
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

    public void setSecretNickName(String myNickName) {
        this.secretNickName = myNickName;
    }

    public void upgrade() {
        for (int i = 0; i < studentGrade.length; i++) {
            if (studentGrade[i] == grade && i != studentGrade.length - 1) {
                grade = studentGrade[i + 1];
                break;
            }
        }

    }

    public void downgrade() {
        System.out.println("grade: " + grade);
        for (int i = 0; i <= studentGrade.length; i++) {
            if (studentGrade[i] == grade && i != 0) {
                grade = studentGrade[i - 1];
                break;
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Michelle", 'B', 1);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Nickname: " + student.secretNickName);
        student.upgrade();
        System.out.println("Upgraded to: " + student.getGrade());
        student.downgrade();
        System.out.println("Downgraded to: " + student.getGrade());
    }
}
