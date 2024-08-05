package Observer.model;

public interface INotifier {
	void notify(Account account);
	void error(Account account);

}
