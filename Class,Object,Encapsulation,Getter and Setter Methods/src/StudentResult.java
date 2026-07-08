// 6. School Result System
//A school stores marks of a student. Create a class StudentResult with private variables:
//studentName
//mathMarks
//scienceMarks
//englishMarks
//Using getters calculate:
//
//totalMarks
//average
//Then print grade:
//>= 90 → A
//>= 75 → B
//>= 50 → C
//else → Fail
public class StudentResult {
	 private String studentName;
	    private int mathMarks;
	    private int scienceMarks;
	    private int englishMarks;

	    public void setData(String n, int m, int s, int e)
	    {
	        studentName = n;
	        mathMarks = m;
	        scienceMarks = s;
	        englishMarks = e;
	    }

	    public void result()
	    {
	        int total;
	        double average;

	        total = mathMarks + scienceMarks + englishMarks;

	        average = total / 3.0;

	        System.out.println("Student Name = " + studentName);
	        System.out.println("Total Marks = " + total);
	        System.out.println("Average = " + average);

	        if(average >= 90)
	            System.out.println("Grade A");
	        else if(average >= 75)
	            System.out.println("Grade B");
	        else if(average >= 50)
	            System.out.println("Grade C");
	        else
	            System.out.println("Fail");
	    }

	    public static void main(String args[])
	    {
	        StudentResult s = new StudentResult();

	        s.setData("Nandini", 90, 85, 95);

	        s.result();
	    }
}
