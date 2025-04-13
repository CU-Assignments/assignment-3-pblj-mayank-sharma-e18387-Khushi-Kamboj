import java.util.Scanner;

class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

class PrerequisiteNotMetException extends Exception {
    public PrerequisiteNotMetException(String message) {
        super(message);
    }
}

public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example simulation
        try {
            System.out.print("Enroll in Course: ");
            String course = sc.nextLine();

            System.out.print("Prerequisite: ");
            String prerequisite = sc.nextLine();

            System.out.print("Status: ");
            String status = sc.nextLine();

            if (status.equalsIgnoreCase("course full")) {
                throw new CourseFullException("CourseFullException - The course is already full.");
            }

            if (status.equalsIgnoreCase("prerequisite not completed")) {
                throw new PrerequisiteNotMetException(
                        "PrerequisiteNotMetException - Complete " + prerequisite + " before enrolling in " + course + ".");
            }

            System.out.println("Enrollment successful in: " + course);

        } catch (CourseFullException | PrerequisiteNotMetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
