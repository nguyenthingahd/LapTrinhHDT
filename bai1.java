package homework2;

//Viết chương trình tính tổng của dãy số Fibonacci đến số Fibonacci <100.
import java.util.Scanner;

public class bai1 {
	public static int fibonacci_sum(int n) {
		if (n < 0 || n >= 100)
			return 0;
		int fibo[] = new int[n + 1];
		fibo[0] = 0;
		fibo[1] = 1;
		int sum = fibo[0] + fibo[1];
		for (int i = 2; i <= n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			sum += fibo[i];
		}
		return sum;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("Nhap so phan tu fibonacci muon tinh tong: ");
		n = input.nextInt();
		System.out.println("Tong cua day " + n + " so Fibonacci la: " + fibonacci_sum(n));
	}

}