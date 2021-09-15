package com.company;

public class Student {

    protected String name;
    protected char[] studentGrade = { 'A', 'B', 'C', 'D' };
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

    public void setSecretNickName(String secretNickName) {
        this.secretNickName = "MySecretNickName";
    }

    public void upgrade() {
        for (int i : studentGrade) {
            if (i == studentGrade.length) {
                grade = studentGrade[i];
            }
        }
    }

    public void downgrade() {
        for (int i : studentGrade) {
            if (i == studentGrade.length) {
                grade = studentGrade[i - 1];
            }
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Michelle", 'B', 1);
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Nickname: " + student.secretNickName);
    }
}
