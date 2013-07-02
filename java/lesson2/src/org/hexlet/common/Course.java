package org.hexlet.common;

/**
 * Created with IntelliJ IDEA.
 * User: alexey homich
 * Date: 2.7.13
 * Time: 23.50
 */
public class Course {
    // data
    public String name = "_Course Name Here_";
    public int hour = 3;

    //method
    public void aboutCourse(){
        System.out.println("Course name: " + name);
        System.out.println("Course hours: " + hour);
    }

}
