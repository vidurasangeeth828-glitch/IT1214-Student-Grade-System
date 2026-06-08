import java.util.*;
class Main{
	private static ArrayList<Student> studentList=new ArrayList<>();
	static Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args){
		
		int choice;
		
		do{
			System.out.println("=== Student Grade Management System ===");
            System.out.println("1. Add a Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search for a Student by ID");
            System.out.println("4. Calculate and Display Average Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice ,Enter a number (1-5):");
			choice=sc.nextInt();
			
			
			switch(choice){
				case 1:
					addStudent();
				break;
				case 2:
					displayAllStudents();
				break;
				case 3:
					searchById();
				break;
				case 4:
				break;
				case 5:
				break;
				default:
				break;
			}
			
			
		}while(choice !=5);	
			
		
}
		private static void addStudent(){
				sc.nextLine();
				System.out.println("Enter Student Id:");
				String id=sc.nextLine();
				
				System.out.println("Enter Student Name :");
				String name=sc.nextLine();
				System.out.println("Enter Mark :");
				int mark;
				
				while(!sc.hasNextInt()) {
					System.out.println("Error: Please enter numbers only!");
					System.out.print("Enter Mark: ");
					sc.next();
				
				}
				mark=sc.nextInt();
				sc.nextLine();
				
				studentList.add(new Student(id,name,mark));
				System.out.println("Student added successfully!");
				
				
			}
		private static void displayAllStudents(){
			if(studentList.isEmpty()){
				System.out.println("No Records");
				
			}else{
				for(Student i:studentList){
					i.printStudentDetails();
				}
			}
		}
		private static void searchById(){
			
			if(studentList.isEmpty()){
				System.out.println("No Records");
				
			}else{
				System.out.println("Enter Student Id For Search Student :");
				String search=sc.nextLine();
				boolean found=false;
				for(Student i:studentList){
					if(i.getId().equalsIgnoreCase(search)){
						System.out.println("found");
						i.printStudentDetails();
						found=true;
						break;
					
					}
				}if(!found){
					
						System.out.println("No Student found with this Id");
				}
			}
		}
		
	
	
	
	
}