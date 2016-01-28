package exception;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		
		try{
			Student student = new Student(name);
			System.out.println(student.name);
		} catch(StudentNameFormatException e){
			System.out.println(e.getMessage());
		}
		
		try{
			Student student = new Student("a b c d");
			System.out.println(student.name);
		} catch(StudentNameFormatException e){
			System.out.println(e.getMessage());
		}
	}

}
