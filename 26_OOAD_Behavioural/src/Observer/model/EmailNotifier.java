package Observer.model;

public class EmailNotifier implements INotifier {

	public void notify(Account account) {
		System.out.println(" Email notification for account  ");
		System.out.println("Your Balance "+account.getBalance());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Account account) {
		System.out.println("Email message: Low Balance");
		// TODO Auto-generated method stub
		
	}

}
