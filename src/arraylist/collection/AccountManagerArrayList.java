package arraylist.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class AccountManagerArrayList {

	private LinkedList linkedList = new LinkedList<>();
	private ArrayList<Account> accountList;
	
	public AccountManagerArrayList(){
		accountList = new ArrayList<Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, double balance){
		Account account = new Account(accountNumber, accountName, balance);
		accountList.add(account);
	}
	
	public void setDeposite(String accountNumber, int money){
//		for(int i = 0; i < accountList.size(); i++){
//			
////			Account account = accountList.get(i);
////			String tempNumber = account.getAccountNumber();
////			
////			if (accountNumber == tempNumber){
////				account.deposite(money);
////			}
//			if (accountNumber == accountList.get(i).getAccountNumber()){
//				accountList.get(i).deposite(money);
//				System.out.println(accountNumber + "�� " + money + "��ŭ�� ���� �����߽��ϴ�.");
//				break;
//			}
//			else{
//				continue;
//			}
//		}
		
		Iterator<Account> ir = accountList.iterator();
		
		while(ir.hasNext()){
			Account acc = ir.next();
			if(acc.getAccountNumber() == accountNumber){
				acc.deposite(money);
				System.out.println(accountNumber + "�� " + money + "��ŭ�� ���� �����߽��ϴ�.");
				return;
			}
		}
	}
	
	public void displayAll(){
//		for(int i = 0; i < accountList.size(); i++){
//			System.out.println(accountList.get(i));
//		}
		Iterator<Account> ir = accountList.iterator();
		
		while(ir.hasNext()){
			Account acc = ir.next();
			System.out.println(acc.toString());
		}
	}
}
