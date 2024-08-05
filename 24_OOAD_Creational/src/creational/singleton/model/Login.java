package creational.singleton.model;

public class Login {
	private static Login login;

	public Login() {
		System.out.println("Login Created ");
	}

	private void status() {
		System.out.println("Login successfull");
	}

	public static Login getLogin() {
		if (login == null)
			login = new Login();
		return login;

		
	}

}
