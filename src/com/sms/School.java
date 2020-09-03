package com.sms;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class School {

    private ArrayList<Teacher> Teachers;
    private ArrayList<Student> Students;

    private int id;
    private static final AtomicInteger count = new AtomicInteger(0);

    private int totalMoneyEarned;
    private int totalMoneySpent;
    private int bankAccount;


    public School(ArrayList<Teacher> teachers, ArrayList<Student> students) {
        id = count.incrementAndGet();
        Teachers = teachers;
        Students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
        bankAccount = 0;
    }

    public void addTeacher(Teacher teacher){
        Teachers.add(teacher);
    }

    public ArrayList<Teacher> getTeachers() {
        return Teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        Teachers = teachers;
    }

    public void addStudent(Student student){
        Students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
        updateBankAccount(moneyEarned);
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void updateBankAccount(int money){
        bankAccount += money;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
        totalMoneyEarned -= moneySpent;
        updateBankAccount(-moneySpent);
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }

    @Override
    public String toString() {
        return "School{" +
                "Teachers=" + Teachers +
                ", Students=" + Students +
                ", totalMoneyEarned=" + totalMoneyEarned +
                ", totalMoneySpent=" + totalMoneySpent +
                '}';
    }
}
