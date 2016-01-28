package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AccountManagerHashSet {

	private HashSet<Account> accountSet;
	
	public AccountManagerHashSet(){
		accountSet = new HashSet<Account>();
	}
	
	public void insertAccount(String accountNumber, String accountName, double balance){
		Account account = new Account(accountNumber, accountName, balance);
		accountSet.add(account);
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
//				System.out.println(accountNumber + "에 " + money + "만큼의 돈을 저축했습니다.");
//				break;
//			}
//			else{
//				continue;
//			}
//		}
		
		Iterator<Account> ir = accountSet.iterator();
		
		while(ir.hasNext()){
			Account acc = ir.next();
			if(acc.getAccountNumber() == accountNumber){
				acc.deposite(money);
				System.out.println(accountNumber + "에 " + money + "만큼의 돈을 저축했습니다.");
				return;
			}
		}
	}
	
	public void displayAll(){
//		for(int i = 0; i < accountList.size(); i++){
//			System.out.println(accountList.get(i));
//		}
		Iterator<Account> ir = accountSet.iterator();
		
		while(ir.hasNext()){
			Account acc = ir.next();
			System.out.println(acc.toString());
		}
	}
}
