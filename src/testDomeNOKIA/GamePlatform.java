package testDomeNOKIA;

public class GamePlatform {
	public static double calculateFinalSpeed(double initialSpeed, int[] inclinations) {

		for (Integer num : inclinations) {
			if (num > 0) {
				initialSpeed -= num;
			} else {
				initialSpeed += Math.abs(num);
			}
		}

		if (initialSpeed <= 0) {
			return 0;
		}

		return initialSpeed;
	}

	public static void main(String[] args) {
		System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
	}
}
