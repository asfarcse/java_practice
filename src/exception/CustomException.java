package exception;


class VoteException extends Exception {
	public VoteException (String msg) {
		super(msg);
	}
}

class NewBorn extends Exception {
	public NewBorn (String msg) {
		super(msg);
	}
}

public class CustomException {
	public static void main(String[] args) throws Exception {
		try {
			validateAge(-1);
		} finally {
			System.out.println("hjbhj");
		}
		
	}
	
	
	public static void validateAge(Integer age) throws Exception {
		if(age >= 18) {
			System.out.println("Eligible to Vote");
		} else if(age < 18 && age != 0 && age >0){
			throw new VoteException("not eligible to vote");
		}
		
		if(age == 0) {
			throw new NewBorn("new born bab7y");
		} else {
			throw new Exception("exception::::");
		}
	}
	
}
