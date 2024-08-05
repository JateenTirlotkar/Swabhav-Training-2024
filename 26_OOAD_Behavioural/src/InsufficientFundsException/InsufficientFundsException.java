package InsufficientFundsException;

public class InsufficientFundsException extends RuntimeException {
	
	public String getMessage() {
		return "Transaction failed, Insufficient Funds";
	}

}
