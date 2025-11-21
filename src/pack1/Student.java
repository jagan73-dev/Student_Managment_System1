package pack1;

public class Student extends Person {
	 private int rollNo;
	    private double marks;

	    public Student(int rollNo, String name, int age, double marks) {
	        super(name, age);
	        this.rollNo = rollNo;
	        this.marks = marks;
	    }

	    public int getRollNo() { return rollNo; }
	    public double getMarks() { return marks; }

	    @Override
	    public String toString() {
	        return rollNo + " | " + getName() + " | Age: " + getAge() + " | Marks: " + marks;
	    }
}
