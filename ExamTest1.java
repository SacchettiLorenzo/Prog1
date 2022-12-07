public class ExamTest1 {
	public static void main(String[] arg) {
		int[][] mat = EvalMat();
		// System.out.println(e1(mat));
		System.out.println(e2(mat));
	}

	static boolean e1(int[][] mat) {
		boolean result = false;
		if (mat != null) {
			for (int[] c : mat) {
				if (c.length != mat.length) {
					System.out.println("matrix not squared");
					result = false;
					break;
				}
			}
			int sommaC;
			int sommaR;
			for (int i = 0; i < mat[0].length; i++) {
				sommaC = 0;
				sommaR = 0;
				for (int j = 0; j < mat[i].length; j++) {
					sommaC += mat[j][i];
					sommaR += mat[i][j];
				}
				System.out.println(sommaC);
				System.out.println(sommaR);
				System.out.println();

				if (sommaC == sommaR) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
		} else {
			result = false;
			System.out.println("matrix is null");
		}
		return result;
	}

	static boolean e2(int[][] mat) {
		boolean result = false;
		if (mat != null) {
			for (int[] c : mat) {
				if (c.length != mat.length) {
					System.out.println("matrix not squared");
					result = false;
					break;
				}

				int sommac;
				int sommar;
				for (int i = 0; i < mat[0].length; i++) {
					sommac = 0;
					sommar = 0;
					for (int j = 0; j < mat[i].length; j++) {

						// System.out.println(sommac + "+" + mat[j][i]);
						sommac = sommaC(sommac, mat[j][i]);

						// System.out.println(sommar + "+" + mat[i][j]);
						sommar = sommaR(sommar, mat[i][j]);
					}
					System.out.println(sommac);
					System.out.println();

					if (sommar == sommac) {
						result = true;
					} else {
						result = false;
						break;
					}
				}

			}

		} else {
			result = false;
			System.out.println("matrix is null");
		}
		return result;
	}

	// contro variante // indice cresce
	public static int sommaC(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return sommaC(m, n, 0);
		}
	}

	private static int sommaC(int m, int n, int p) {
		if (p == n) {
			return m;
		} else
			return sommaC(m, n, p + 1) + 1;
	}

	// covariante // indice decresce
	public static int sommaR(int m, int n) {
		if (n == 0) {
			return m;
		} else {
			return sommaR(m, n, n);
		}
	}

	private static int sommaR(int m, int n, int p) {
		if (p == 0) {
			return m;
		} else {
			return sommaR(m, n, p - 1) + 1;
		}
	}

	static int[][] EvalMat() {
		int[][] mat = { { 0, 0, 9, 0 },
				{ 1, 1, 1, 1 },
				{ 0, 1, 2, 2 },
				{ 0, 1, 2, 3 } };
		// int[][] mat = null;
		return mat;
	}
}
