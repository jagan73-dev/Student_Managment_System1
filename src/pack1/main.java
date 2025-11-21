package pack1;
import java.util.*;
public class main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        StudentManager sm = new StudentManager();

	        while (true) {

	            System.out.println("\n--- STUDENT MANAGEMENT SYSTEM ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Search Student");
	            System.out.println("4. Display All");
	            System.out.println("5. Sort by Name");
	            System.out.println("6. Sort by Marks");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");

	            int ch = sc.nextInt();

	            switch (ch) {

	                case 1:
	                    System.out.print("Enter Roll No: ");
	                    int roll = sc.nextInt();

	                    sc.nextLine();
	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Age: ");
	                    int age = sc.nextInt();

	                    System.out.print("Enter Marks: ");
	                    double marks = sc.nextDouble();

	                    sm.addStudent(new Student(roll, name, age, marks));
	                    break;

	                case 2:
	                    System.out.print("Enter Roll No to remove: ");
	                    int r = sc.nextInt();
	                    System.out.println(sm.removeStudent(r) ? "Removed!" : "Not Found!");
	                    break;

	                case 3:
	                    System.out.print("Enter Roll No to search: ");
	                    int s = sc.nextInt();

	                    Student st = sm.searchStudent(s);
	                    System.out.println(st != null ? st : "Not Found");
	                    break;

	                case 4:
	                    sm.displayAll();
	                    break;

	                case 5:
	                    sm.sortByName();
	                    System.out.println("Sorted by Name");
	                    break;

	                case 6:
	                    sm.sortByMarks();
	                    System.out.println("Sorted by Marks");
	                    break;

	                case 7:
	                    System.out.println("Exiting...");
	                    return;

	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
	    }
}
