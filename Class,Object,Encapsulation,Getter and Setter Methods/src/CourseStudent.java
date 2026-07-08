//1. Online Course Enrollment System
//An ed-tech platform stores information about students enrolling in courses. Create a class CourseStudent with private variables:
//studentName
//courseName
//courseFee
//discountPercent
//Using setters assign values. Using getters calculate the final payable fee:
//finalFee = courseFee - (courseFee * discountPercent / 100)
//Print the student name, course, and final fee.
public class CourseStudent {
	 private String studentName, courseName;
	    private double courseFee, discountPercent;

	    public void setData(String s, String c, double f, double d) {
	        studentName = s;
	        courseName = c;
	        courseFee = f;
	        discountPercent = d;
	    }

	    public double getFinalFee() {
	        return courseFee - (courseFee * discountPercent / 100);
	    }

	    public void display() {
	        System.out.println(studentName);
	        System.out.println(courseName);
	        System.out.println(getFinalFee());
	    }

	    public static void main(String[] args) {
	        CourseStudent cs = new CourseStudent();
	        cs.setData("Nandini", "Java", 10000, 20);
	        cs.display();
	    }
}
