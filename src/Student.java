class Student{
	private String studentId;
	private String studentName;
	private int marks;
	
	
	Student(String studentID,String studentName,int marks){
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
	}
	 public String getId(){
		 return studentId;
	 }
	 public String getName(){
		 return studentName;
	 }
	 public int getMarks(){
		 return marks;
	 }
	 
	 public void PrintStudentDetails(){
		 System.out.println("Student ID: " + studentId +
                ", Student Name: " +studentName+
                ", Marks: " + marks);
	 }
}