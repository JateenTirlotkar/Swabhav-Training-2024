package Observer.model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Whatsapp Notification for account: ");
		System.out.println("Your Balance "+account.getBalance());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void error(Account account) {
		System.out.println("Whatsapp message: Low Balance");
		// TODO Auto-generated method stub
		
	}

}
