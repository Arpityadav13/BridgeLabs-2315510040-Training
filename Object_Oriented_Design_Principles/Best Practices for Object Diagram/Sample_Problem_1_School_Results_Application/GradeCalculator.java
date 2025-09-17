public class GradeCalculator {
    public static String calculateGrade(Student student) {
        int totalMarks = 0;
        int subjectCount = student.getSubjects().size();

        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        double average = (double) totalMarks / subjectCount;

        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }
}
