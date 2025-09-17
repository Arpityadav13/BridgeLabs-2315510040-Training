public class MainSchool {
    public static void main(String[] args) {
        Student john = new Student("John");
        john.addSubject(new Subject("Maths", 90));
        john.addSubject(new Subject("Science", 85));

        String grade = GradeCalculator.calculateGrade(john);

        System.out.println("Student: " + john.getName());
        System.out.println("Grade: " + grade);
    }
}
