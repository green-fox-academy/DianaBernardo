package GreenFoxOrganization;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    String name;
    List<GreenFoxOrganization.Student> students;
    List<GreenFoxOrganization.Mentor> mentors;

    public Cohort(String name) {
        this.name = name;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }


    public void addStudent(GreenFoxOrganization.Student student) {
        students.add(student);
    }

    public void addMentor(GreenFoxOrganization.Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
