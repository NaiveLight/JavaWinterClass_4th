package exception;

public class Student {
	
	String name;
	
	public Student(String name){
		
		if(name == null){
			throw new StudentNameFormatException("�̸��� null �Դϴ�.");
		}		
		
		if(name.split(" ").length > 3){
			throw new StudentNameFormatException("�̸��� �ʹ� ��ϴ�.");
		}
		
		this.name = name;
	}
}
