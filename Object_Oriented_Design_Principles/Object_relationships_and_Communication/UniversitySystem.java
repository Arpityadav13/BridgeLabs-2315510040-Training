import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.title);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignCourse(Course course) {
        course.setProfessor(this);
        System.out.println(name + " is assigned to teach " + course.title);
    }
}

class Course {
    String title;
    Professor professor;
    List<Student> students;

    Course(String title) {
        this.title = title;
        students = new ArrayList<>();
    }

    void setProfessor(Professor professor) {
        this.professor = professor;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showCourseDetails() {
        System.out.println("Course: " + title);
        if (professor != null) {
            System.out.println("Professor: " + professor.name);
        } else {
            System.out.println("Professor: Not assigned");
        }
        if (students.isEmpty()) {
            System.out.println("No students enrolled.");
        } else {
            System.out.println("Enrolled Students:");
            for (Student s : students) {
                System.out.println("- " + s.name);
            }
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Professor prof = new Professor("Dr. Smith");

        Course course = new Course("Introduction to Computer Science");

        s1.enrollCourse(course);
        s2.enrollCourse(course);

        prof.assignCourse(course);

        course.showCourseDetails();
    }
}
