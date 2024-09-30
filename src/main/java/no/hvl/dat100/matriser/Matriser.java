package no.hvl.dat100.matriser;

public class Matriser {

	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};

		int[][] matrise2 = {
				{2, 4, 6},
				{8, 10, 12},
				{14, 16, 18}
		};

		int[] b0 = {10,11,12};
		int[] b1 = {13,14,15};
		int[] b2 = {16,17,18};

		int[][] b = new int[3][];

		b[0] = b0;
		b[1] = b1;
		b[2] = b2;

		int[] c0 = {1,2,3};
		int[] c1 = {4,5,6};
		int[] c2 = {7,8,9};
		int[] c3 = {10,11,12};

		int[][] c = new int[4][];

		c[0] = c0;
		c[1] = c1;
		c[2] = c2;
		c[3] = c3;

		System.out.println(tilStreng(multipliser(c, a)));
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
		int[][] multiplisert = new int[a.length][b[0].length];

		int lengde = Math.min(a.length, b.length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < lengde; j++) {
				for (int k = 0; k < b[0].length; k++) {
					multiplisert[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return multiplisert;
	}
}
