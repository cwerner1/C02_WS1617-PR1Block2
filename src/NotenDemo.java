
public class NotenDemo {

	public static void main(String[] args) {

		int punkte = 90;
		System.out.println(punkte + " = " + getNotentextV1(punkte));
		System.out.println(punkte + " = " + getNotentextV2(punkte));
		System.out.println(punkte + " = " + getNotentextV3(punkte));

		punkte = 83;
		System.out.println(punkte + " = " + getNotentextV1(punkte));
		System.out.println(punkte + " = " + getNotentextV2(punkte));
		System.out.println(punkte + " = " + getNotentextV3(punkte));

		punkte = 77;
		System.out.println(punkte + " = " + getNotentextV1(punkte));
		System.out.println(punkte + " = " + getNotentextV2(punkte));
		System.out.println(punkte + " = " + getNotentextV3(punkte));

		punkte = 51;
		System.out.println(punkte + " = " + getNotentextV1(punkte));
		System.out.println(punkte + " = " + getNotentextV2(punkte));
		System.out.println(punkte + " = " + getNotentextV3(punkte));

		punkte = 33;
		System.out.println(punkte + " = " + getNotentextV1(punkte));
		System.out.println(punkte + " = " + getNotentextV2(punkte));
		System.out.println(punkte + " = " + getNotentextV3(punkte));

	}

	//Variante 1: Notenschlüssel von "Sehr Gut" bis "Nicht Genügend" abbilden
	//WICHTIG: Verwendung von ">=" Operator und auf die absteigende Reihenfolge
	//der erreichten Punkte in den Bedingungen achten
	public static String getNotentextV1(int punkte) {

		String note = "";

		if (punkte >= 90) {
			note = "Sehr Gut";
		} else if (punkte >= 78) {
			note = "Gut";
		} else if (punkte >= 65) {
			note = "Befriedigend";
		} else if (punkte >= 51) {
			note = "Genügend";
		} else {
			note = "Nicht Genügend";
		}

		return note;
	}

	//Variante 2: Notenschlüssel von "Nicht Genügend" bis "Sehr Gut" abbilden
	//WICHTIG: Verwendung von "<" Operator und auf die aufsteigende Reihenfolge
	//der erreichten Punkte in den Bedingungen achten
	public static String getNotentextV2(int punkte) {

		String note = "";

		if (punkte < 51) {
			note = "Nicht Genügend";
		} else if (punkte < 65) {
			note = "Genügend";
		} else if (punkte < 78) {
			note = "Befriedigend";
		} else if (punkte < 90) {
			note = "Gut";
		} else {
			note = "Sehr Gut";
		}

		return note;
	}
	
	//Variante 3: Nur durch Bedingungen in Form von überlappungsfreien Intervallen,
	//(d.h. mittels Unter- und Obergrenze) ist die Reihenfolge irrelevant.
	public static String getNotentextV3(int punkte) {

		String note = "";

		if (punkte >= 65 && punkte <= 77) {
			note = "Befriedigend";
		} else if (punkte >= 51 && punkte <= 64) {
			note = "Genügend";
		} else if (punkte >= 90) {
			note = "Sehr Gut";
		} else if (punkte >= 78 && punkte <= 89) {
			note = "Gut";
		} else {
			note = "Nicht Genügend";
		}

		return note;
	}
	

}
