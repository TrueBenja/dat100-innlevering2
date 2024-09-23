package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] matrise = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		System.out.println(tilStreng(multipliser(matrise, matrise)));
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		System.out.println("{");
		for (int[] rad : matrise) {
			System.out.print("[ ");
			for (int e : rad) {
				System.out.print(e + " ");
			}
			System.out.println("]");
		}
		System.out.println("}");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String str = "";
		for (int[] rad : matrise) {
			for (int e : rad) {
				str += e + " ";
			}
			str += "\n";
		}
		return str;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[0].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisert = new int[a[0].length][b.length];

		for (int i = 0; i < multiplisert.length; i++) {
			for (int j = 0; j < multiplisert[0].length; j++) {
				multiplisert[i][j] = 0;
				for (int k = 0; k < a[i].length; k++) {
					for (int l = 0; l < b.length; l++) {
						multiplisert[i][j] += a[k][l] * b[l][k];
					}
				}
			}
		}

		return multiplisert;
	}
}
