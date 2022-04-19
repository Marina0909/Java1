package ru.geekbrains.lesson5;

public class Worker {
    private String surName;
    private String name;
    private String middleName;
    private String post;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public Worker(String surName, String name, String middleName,
                  String post, String email, String telephone, int salary, int age){
        this.surName = surName;
        this.name = name;
        this.middleName = middleName;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("Worker surName: " + surName + "; name: " + name +
                "; middleName: " + middleName + "; post: " + post + "; mail: " +
                email + "; telephone: " + telephone + "; salary: " + salary +
                "; age: " + age + ";");



    }
}






