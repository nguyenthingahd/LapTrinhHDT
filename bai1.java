package homework1;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		int i, j, temp;
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nhập số phần tử của dãy: ");
			int n = scanner.nextInt();

			int[] arr = new int[n];
			System.out.print("Nhập các phần tử của dãy: \n");
			for (i = 0; i < n; i++) {
				System.out.print("Nhap so thu [" + i + "]: ");
				arr[i] = scanner.nextInt();
			}
			for (i = 0; i < (n - 1); i++) {
				for (j = 0; j < n - i - 1; j++) {
					if (arr[j] > arr[j + 1]) {
						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
			System.out.println("\nKet qua xap xep tang dan: ");
			for (i = 0; i < n; i++) {
				System.out.print(arr[i] + "\t");
			}

			System.out.println("\nKet qua xap xep giam dan: ");
			for (i = n - 1; i >= 0; i--) {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println();
	}

}
