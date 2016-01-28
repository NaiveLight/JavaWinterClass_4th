package exception;

public class Student {
	
	String name;
	
	public Student(String name){
		
		if(name == null){
			throw new StudentNameFormatException("이름이 null 입니다.");
		}		
		
		if(name.split(" ").length > 3){
			throw new StudentNameFormatException("이름이 너무 깁니다.");
		}
		
		this.name = name;
	}
}
