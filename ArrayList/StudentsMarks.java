import java.util.*;

public class StudentsMarks {
    public static void main(String[] args) {

        // Array of ArrayLists to hold marks of 5 students
        ArrayList<Integer>[] studentMarks = new ArrayList[5];

        // Initialize each ArrayList
        for (int i = 0; i < studentMarks.length; i++) {
            studentMarks[i] = new ArrayList<>();
        }

        // Add marks for each student
        studentMarks[0].add(90);
        studentMarks[0].add(85);
        studentMarks[0].add(88);

        studentMarks[1].add(70);
        studentMarks[1].add(75);
        studentMarks[1].add(80);

        studentMarks[2].add(60); // Student 3 has only one subject

        // Print marks of each student
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.println("Student " + (i + 1) + " Marks: " + studentMarks[i]);
        }
    }
}
