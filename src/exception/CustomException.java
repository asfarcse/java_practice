package exception;

class UserNotValidException extends Exception {
	public UserNotValidException(String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) {
		try {
			validateUser("asfar");
		}catch (UserNotValidException exception) {
			System.out.println("msg::"+exception.getMessage());
		}
	}

	private static void validateUser(String string) throws UserNotValidException {
		if(string.equals("asfar")) {
			throw new UserNotValidException("hii...custom Exception occurs");
		} else {
			System.out.println("hii..no exception occur");
		}
	}
}
