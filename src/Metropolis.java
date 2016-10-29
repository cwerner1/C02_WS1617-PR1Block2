
public class Metropolis {

	public static void main(String[] args) {

		boolean isCapital = true;
		int inhabitants = 150_000;
		double taxPerPersonAndMonth = 430.0;

		boolean result = isMetropolis(isCapital, inhabitants, taxPerPersonAndMonth);
		System.out.println("Metropolis? " + result);

	}

	public static boolean isMetropolis(boolean isCapital, int inhabitants, double taxPerPersonAndMonth) {

		return ( (isCapital && inhabitants > 100_000)
				|| (inhabitants > 200_000
						&& taxPerPersonAndMonth * 12 * inhabitants >= 720_000_000));

	}

}
