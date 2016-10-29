
public class TeilerFinden {

	public static void main(String[] args) {

		int zahl = 128;

		findeTeiler(zahl);

		if (istPrimzahl(zahl)) {
			System.out.println(zahl + " ist eine Primzahl");
		} else {
			System.out.println(zahl + " ist KEINE(!) Primzahl");
		}

	}

	public static void findeTeiler(int zahl) {

		int teilerKandidat = 2;

		String ausgabeAlleTeiler = "teiler von " + zahl + ": ";

		while (teilerKandidat <= zahl / 2) {
			if (zahl % teilerKandidat == 0) {
				ausgabeAlleTeiler += teilerKandidat + ", ";
			}
			teilerKandidat++;
		}

		System.out.println(ausgabeAlleTeiler);

	}

	public static boolean istPrimzahl(int zahl) {

		int teilerKandidat = 2;

		while (teilerKandidat <= zahl / 2) {
			if (zahl % teilerKandidat == 0) {
				return false;
			}
			teilerKandidat++;
		}

		return true;
	}

}
