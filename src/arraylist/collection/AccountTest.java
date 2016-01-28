package arraylist.collection;

public class AccountTest {

	public static void main(String[] args) {
		
		AccountManagerArrayList manager = new AccountManagerArrayList();
		manager.insertAccount("123451", "james", 10000.0);
		manager.insertAccount("123452", "Tomas", 20000.0);
		manager.insertAccount("123453", "Edward", 30000.0);
		manager.insertAccount("123454", "Phoby", 40000.0);
		manager.insertAccount("123455", "Tomy", 50000.0);
		
		manager.setDeposite("123451", 5000);
		manager.setDeposite("123452", 5000);
		manager.setDeposite("123453", 5000);
		manager.setDeposite("123454", 5000);
		manager.setDeposite("123455", 5000);
		
		manager.displayAll();
		
	}

}
