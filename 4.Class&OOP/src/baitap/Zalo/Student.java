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
    public double average() {
        return (math + literature + english) / 3 ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", math=" + math +
                ", literature=" + literature +
                ", english=" + english +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getLiterature() {
        return literature;
    }

    public void setLiterature(double literature) {
        this.literature = literature;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];
        Student student1 = new Student("Nam Bedee", "Male", "HN", 20, 8.5,5.5, 5.0) ;
        Student student2 = new Student("Tiến Bịp", "Male", "HN", 30, 7.5,5.5, 5.5) ;
        Student student3 = new Student("Cháu Hùng", "Male", "HN", 18, 5.5,5.5, 5.0) ;

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
    }
}


