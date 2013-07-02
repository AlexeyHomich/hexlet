package org.hexlet.humans;
import org.hexlet.common.Course;

/**
 * Created with IntelliJ IDEA.
 * User: alexey homich
 * Date: 2.7.13
 * Time: 23.46
 */
public class Student {
    // data
    public String name = "Not set!";
    public int age = 16;
    public Course course = new Course();

    // method
    public void sayHello(){
        System.out.println("Hello!");
        System.out.println("My name is " + name);
        System.out.println("Age: " + age);
        course.aboutCourse();
        System.out.println("~~~~~~~~~~~~~");
        System.out.println();

    }

}
