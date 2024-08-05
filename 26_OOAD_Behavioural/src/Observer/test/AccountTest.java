package Observer.test;

import java.util.Scanner;

import Observer.model.Account;
import Observer.model.EmailNotifier;
import Observer.model.INotifier;
import Observer.model.SmsNotifier;
import Observer.model.WhatsappNotifier;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Account account1 = new Account(102, "Jateen", 2000);
		
		INotifier notifier;
		int input =0;
		SmsNotifier sms=new SmsNotifier();
		
		
		while( input!=5) {
		
		System.out.println(" Which notifier do you want: Press 1 for Sms Press 2 for Email, Press 3 for Whatsapp: ");
		input = scanner.nextInt();
		if(input==1)
			account1.registerNotifier(sms);
		if(input==2)
			account1.registerNotifier(new EmailNotifier());
		if(input==3)
			account1.registerNotifier(new WhatsappNotifier());
		input++;

	}
		System.out.println("Enter Amount you want to deposit: ");
		int amount = scanner.nextInt();
		account1.deposit(amount);
//		System.out.println("Your balance is "+ account1.getBalance());
		
		System.out.println("Enter Amount you want to Withdraw: ");
		int withdrawAmount = scanner.nextInt();
		account1.withdraw(withdrawAmount);
//		System.out.println("Your balance is "+ account1.getBalance());
		
		
		
		
		
		

}
}
