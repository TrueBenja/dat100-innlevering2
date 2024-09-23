package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		skrivUt(tab);
		System.out.println(tilStreng(tab));
	}

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[");
		for (int i = 0; i < tabell.length; i++) {
			System.out.print(tabell[i]);
			if (!(i == tabell.length - 1)) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String str = "[";

		for (int i = 0; i < tabell.length; i++) {
			str += tabell[i];
			if (!(i == tabell.length - 1)) {
				str += ",";
			}
		}
		str += "]";
		return str;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;

		for (int e : tabell) {
			sum += e;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		for (int e : tabell) {
			if (e == tall) {
				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int pos = -1;

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				pos = i;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			nyTabell[i] = tabell[tabell.length - i - 1];
		}
		return nyTabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		for (int i = 0; i < tabell.length - 1; i++) {
			if (tabell[i] > tabell[i + 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] nyTabell = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}

		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[i + tabell1.length] = tabell2[i];
		}
		return nyTabell;
	}
}
