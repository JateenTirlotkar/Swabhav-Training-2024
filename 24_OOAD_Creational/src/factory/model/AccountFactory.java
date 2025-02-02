package factory.model;

public class AccountFactory {
	public IAccount savngsAccount(String name, int accountNumber, int min_balance) {
		IAccount account =null;
		account = new Savings(name, min_balance, min_balance);
		return account;
	}
	
	public IAccount currentAccount(String name, int accountNumber, int overDraftLimit) {
		IAccount account = null;
		account = new Current(name, accountNumber, overDraftLimit);
		return account;
		
	}

}
