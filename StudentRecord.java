import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        int[] marks = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // Consume newline
        }

        System.out.println("\nStudent Records:");
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i] + " scored " + marks[i]);
        }
    }
}
