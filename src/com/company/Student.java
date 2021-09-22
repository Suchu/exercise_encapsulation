package com.company;

public class Student {

    private final String secretNickName = "MySecretNickName";
    private final char[] grade = {'A', 'B', 'C', 'D', 'E', 'F'};
    private final char currentGrade;
    private final String name;
    private final int group;

    public Student(String name, char currentGrade, int group) throws Exception {
        this.name = name;
        this.currentGrade = Character.toUpperCase(currentGrade);
        this.group = group;
        if (!(this.currentGrade <= 'F')) {
            throw new Exception("Grade must be one of the following: A, B, C, D, E, F");
        }
        if (!(this.group >= 1 && this.group <= 5)) {
            throw new Exception("Group must be one of the following: 1, 2, 3, 4, 5");
        }
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return currentGrade;
    }

    public int getGroup() {
        return group;
    }

    public void upgradeGrade() {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == currentGrade && i != grade.length - 1) {
                char downgrade = grade[i + 1];
                System.out.println("Downgraded To: " + downgrade);
            }
        }
    }

    public void downgradeGrade() {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] == currentGrade && i != 0) {
                char upgrade = grade[i - 1];
                System.out.println("Upgraded To: " + upgrade);
            }
        }
    }
}
