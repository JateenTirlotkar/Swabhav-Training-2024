package factory.model;

public interface IAccount {
	int credit(int amount);
	int debit(int amount);
	int checkBalance();

}
