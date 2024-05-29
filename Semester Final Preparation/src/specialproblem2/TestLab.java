package specialproblem2;

public class TestLab {
    public static void main(String[] args) {
        LabQuiz labQuiz = new LabQuiz("Computer Lab", 123, 85);
        LabAttendance labAttendance = new LabAttendance("Computer Lab", 123, 20, 18);

        // Display information for LabQuiz instance
        System.out.println("Lab Quiz Information:");
        System.out.println("Lab Name: " + labQuiz.getLabName());
        System.out.println("Lab ID: " + labQuiz.getLabID());
        System.out.println("Quiz Marks: " + labQuiz.getQuizMarks());

        // Display information for LabAttendance instance
        System.out.println("\nLab Attendance Information:");
        System.out.println("Lab Name: " + labAttendance.getLabName());
        System.out.println("Lab ID: " + labAttendance.getLabID());
        System.out.println("Total Classes: " + labAttendance.getTotalClasses());
        System.out.println("Attended Classes: " + labAttendance.getAttendedClasses());
    }
}

