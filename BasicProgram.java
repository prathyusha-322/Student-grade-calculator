package prjct1;
import java.util.Scanner;

		class Student {
		    private String name;
		    private int rollNo;
		    private int[] marks;
		    private double average;
		    private char grade;

		    public Student(String name, int rollNo, int[] marks) {
		        this.name = name;
		        this.rollNo = rollNo;
		        this.marks = marks;
		        calculateAverage();
		        calculateGrade();
		    }

		    private void calculateAverage() {
		        int sum = 0;
		        for (int mark : marks) {
		            sum += mark;
		        }
		        average = (double) sum / marks.length;
		    }

		    private void calculateGrade() {
		        if (average >= 90) {
		            grade = 'A';
		        } else if (average >= 75) {
		            grade = 'B';
		        } else if (average >= 60) {
		            grade = 'C';
		        } else if (average >= 40) {
		            grade = 'D';
		        } else {
		            grade = 'F';
		        }
		    }

		    public void displayResult() {
		        System.out.println("\n===== STUDENT RESULT =====");
		        System.out.println("Name: " + name);
		        System.out.println("Roll No: " + rollNo);
		        System.out.print("Marks: ");
		        for (int mark : marks) {
		            System.out.print(mark + " ");
		        }
		        System.out.println("\nAverage: " + average);
		        System.out.println("Grade: " + grade);
		    }
		}

		public class BasicProgram {

			public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter student name: ");
		        String name = sc.nextLine();

		        System.out.print("Enter roll number: ");
		        int rollNo = sc.nextInt();

		        System.out.print("Enter number of subjects: ");
		        int n = sc.nextInt();
		        int[] marks = new int[n];

		        System.out.println("Enter marks for " + n + " subjects:");
		        for (int i = 0; i < n; i++) {
		            System.out.print("Subject " + (i + 1) + ": ");
		            marks[i] = sc.nextInt();
		        }

		        Student student = new Student(name, rollNo, marks);
		        student.displayResult();
		    }
//- Developed a Student Result Calculator using Java, implementing OOP concepts to calculate averages and assign grades based on marks.

	}

