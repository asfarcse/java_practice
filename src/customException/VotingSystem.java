package customException;

class UserIsMinorException extends Exception{
	public UserIsMinorException(String msg) {
		super(msg);
	}
}

public class VotingSystem {
	public static void main(String[] args) {
		int age=17;
		try {
			checkEligiblity(age);
		} catch (UserIsMinorException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void checkEligiblity(int age) throws UserIsMinorException {
		if(age<18) {
			throw new UserIsMinorException("voter age is under 18...not eligible");
		} else {
			System.out.println("voter is eligible...can vote happily");
		}
	}
}
