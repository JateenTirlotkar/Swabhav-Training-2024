package Observer.model;

public class SmsNotifier  implements INotifier{

	public void notify(Account account) {
		System.out.println("Notification send for account : ");
		System.out.println("Your Balance "+account.getBalance());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Account account) {
		System.out.println("SMS message: Low Balance");
		// TODO Auto-generated method stub
		
	}

}
