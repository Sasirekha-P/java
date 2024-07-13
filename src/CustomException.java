import java.util.*;
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
public class StudentGradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks obtained in 5 subjects (each out of 100):");
        int[] marks = new int[5];
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered. Marks should be between 0 and 100.");
                return;
            }
            totalMarks += marks[i];
        }
        try {
            if (totalMarks < 0 || totalMarks > 500) {
                throw new CustomException("Invalid total marks calculated. Total marks should be between 0 and 500.");
            }
            char grade;
            if (totalMarks >= 450 && totalMarks <= 500) {
                grade = 'A';
            } else if (totalMarks >= 350 && totalMarks < 450) {
                grade = 'B';
            } else {
                grade = 'C';
            }
            System.out.println("Total marks: " + totalMarks);
            System.out.println("Grade: " + grade);

        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}