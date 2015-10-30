
public class Ex2 {

	public static void main(String[] args) {
		int N = 5;
		int M = 2;

		long stepen = 1;

		for (int i = 1; i <= M; i++) {
			stepen = stepen * N;
		}
		System.out.println(N + " ^ " + M + " = " + stepen);
	}
}
