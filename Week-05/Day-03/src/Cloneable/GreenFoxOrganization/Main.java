package GreenFoxOrganization;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


        ArrayList<GreenFoxOrganization.Person> people = new ArrayList<>();

        GreenFoxOrganization.Person mark = new GreenFoxOrganization.Person("Mark", 46, "male");
        people.add(mark);
        GreenFoxOrganization.Person jane = new GreenFoxOrganization.Person();
        people.add(jane);
        GreenFoxOrganization.Student john = new GreenFoxOrganization.Student("John Doe", 20, "male", "BME");
        people.add(john);
        GreenFoxOrganization.Student student = new GreenFoxOrganization.Student();
        people.add(student);
        GreenFoxOrganization.Mentor gandhi = new GreenFoxOrganization.Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        GreenFoxOrganization.Mentor mentor = new GreenFoxOrganization.Mentor();
        people.add(mentor);
        GreenFoxOrganization.Sponsor sponsor = new GreenFoxOrganization.Sponsor();
        people.add(sponsor);
        GreenFoxOrganization.Sponsor elon = new GreenFoxOrganization.Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);
        GreenFoxOrganization.Student johnTheClone = new GreenFoxOrganization.Student("John The Clone", 20, "male", "BME");
        people.add(johnTheClone);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }

        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for (GreenFoxOrganization.Person person : people) {
            person.introduce();
            person.getGoal();
        }

        GreenFoxOrganization.Cohort awesome = new GreenFoxOrganization.Cohort("AWESOME");
        awesome.addStudent(student);
        awesome.addStudent(john);
        awesome.addMentor(mentor);
        awesome.addMentor(gandhi);
        awesome.info();



        try{
            john.clone();
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
}
