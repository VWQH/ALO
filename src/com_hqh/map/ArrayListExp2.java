package com_hqh.map;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp2 {



    static class Student{
        int rollno;
        String name;

        public Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student s = new Student(111, "A");
        Student s1 = new Student(112, "B");

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s);
        list.add(s1);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            Student st = (Student) itr.next();
            System.out.println(s.rollno + " " + s.name);
        }
    }
}
