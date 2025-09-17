import java.util.*;

class Course {
    String name;
    List<Student> enrolledStudents;

    Course(String name) {
        this.name = name;
        enrolledStudents = new ArrayList<>();
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}

class Student {
    String name;
    List<Course> courses;

    Student(String name) {
        this.name = name;
        courses = new ArrayList<>();
    }

    void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println("- " + c.name);
        }
    }
}

class School {
    String name;
    List<Student> students;

    School(String name) {
        this.name = name;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

class MainSchool {
    public static void main(String[] args) {
        School school = new School("Green High");

        Student s1 = new Student("Liam");
        Student s2 = new Student("Olivia");

        Course math = new Course("Mathematics");
        Course sci = new Course("Science");

        s1.enroll(math);
        s1.enroll(sci);
        s2.enroll(math);

        school.addStudent(s1);
        school.addStudent(s2);

        s1.showCourses();
        s2.showCourses();
        math.showStudents();
    }
}
