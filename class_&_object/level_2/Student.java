package JavaClassObjectPracticeLevel2;


public class Student {
    private String name;
    private String rollNumber;
    private double[] marks;

    // Constructor
    public Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate average marks
    private double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to calculate grade
    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 80) return "Grade A";
        else if (average >= 60) return "Grade B";
        else if (average >= 50) return "Grade C";
        else if (average >= 40) return "Grade D";
        else return "Grade F";
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nGrade: " + calculateGrade());
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        double[] marks1 = {80, 70, 75};
        double[] marks2 = {60, 65, 50};

        Student s1 = new Student("Thamarai", "ECE001", marks1);
        Student s2 = new Student("Kannan", "CSC002", marks2);

        s1.displayDetails();
        s2.displayDetails();
    }
}
