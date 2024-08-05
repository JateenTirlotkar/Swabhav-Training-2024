package factory.test;

import factory.model.AccountFactory;
import factory.model.AccountType;
import factory.model.IAccount;

public class AccountTest {
	public static void main(String[] args) {
		AccountFactory account1 = new AccountFactory();
		IAccount account = account1.savngsAccount("Jateen", 1002, 3000);
		System.out.println("YOur Starting Balance is: "+ account.checkBalance());
		
		System.out.println("Your Balance after crediting is: "+ account.credit(200));
		System.out.println("Your Balance after Debiting is: "+ account.debit(600));
	}

}
