package baitap.Zalo;

import java.util.Scanner;

public class Student {
    String name, gender, address ;
    int age ;
    double math, literature, english ;
    public Student () {}

    public  Student(String name, String gender, String address, int age, double math, double literature, double english) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
        this.math = math;
        this.literature = literature;
        this.english = english;
    }
    public double getAverage() {
        return (math + literature + english) / 3 ;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Nam Bedee", "Male", "HN", 20, 8.5,5.5, 5.0) ;
        Student student2 = new Student("Tiến Bịp", "Male", "HN", 30, 7.5,5.5, 5.5) ;
        Student student3 = new Student("Cháu Hùng", "Male", "HN", 18, 8.5,5.5, 5.0) ;


    }
}


