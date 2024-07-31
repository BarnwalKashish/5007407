// MVCPatternTest.java
package com.mvcpattern;

public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("Kashish", 1, "B");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentName("Kashish Barnwal");
        controller.setStudentId(2);
        controller.setStudentGrade("A");

        controller.updateView();
    }
}
