package org.hexlet;

import org.hexlet.humans.Student;
import org.hexlet.common.Course;

/**
 * Created with IntelliJ IDEA.
 * User: alexey homich
 * Date: 2.7.13
 * Time: 23.46
 */
public class Main {
    public static void main(String[] args) {
        Student studentAlex = new Student();
        studentAlex.name = "Alexey";
        studentAlex.age = 24;
        studentAlex.course.name = "Java course on Hexlet.org!";
        studentAlex.sayHello();

        Student studentJon = new Student();
        studentJon.name = "Jon";
        studentJon.sayHello();
    }
}
