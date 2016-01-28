package hashset;

import java.util.HashSet;

public class AccountTest {

	public static void main(String[] args) {
		
		AccountManagerHashSet manager = new AccountManagerHashSet();
		manager.insertAccount("123451", "james", 10000.0);
		manager.insertAccount("123452", "Tomas", 20000.0);
		manager.insertAccount("123453", "Edward", 30000.0);
		manager.insertAccount("123454", "Phoby", 40000.0);
		manager.insertAccount("123455", "Tomy", 50000.0);
		manager.insertAccount("123455", "Tomy2", 50000.0);
		
		manager.setDeposite("123451", 5000);
		manager.setDeposite("123452", 5000);
		manager.setDeposite("123453", 5000);
		manager.setDeposite("123454", 5000);
		manager.setDeposite("123455", 5000);
		
		manager.displayAll();
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		set.add(500);
		set.add(new Integer(200));
		
		//해쉬방식으로 저장을 하기 때문에 넣은 순서대로 들어가지 않는다.
		//중복을 허용하지 않으므로 같은 값을 넣어도 하나만 존재한다.
		
		System.out.println(set);
	}

}
