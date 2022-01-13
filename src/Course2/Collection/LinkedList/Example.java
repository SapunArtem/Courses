package Course2.Collection.LinkedList;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 3);
        Student st2 = new Student("Nikolay", 2);
        Student st3 = new Student("Elena", 1);
        Student st4 = new Student("Petr", 4);
        Student st5 = new Student("Mariya", 3);
        LinkedList <Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(st1);
        studentLinkedList.add(st2);
        studentLinkedList.add(st3);
        studentLinkedList.add(st4);
        studentLinkedList.add(st5);
        System.out.println("LinkedList: = "+studentLinkedList);
        Student st6 = new Student("Zaur", 3);
        Student st7 = new Student("Igor", 4);
        studentLinkedList.add(st6);
        System.out.println("LinkedList: = "+studentLinkedList);
        studentLinkedList.add(1,st7);
        System.out.println("LinkedList: = "+studentLinkedList);
    }
}

class Student{
    String name;
    int course;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;


    }
}

