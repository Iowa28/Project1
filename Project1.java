import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		System.out.println("Enter the quantity of your numbers.");
		int number = cs.nextInt();
		if (number > 0) {
			int[] a = new int[number];
			System.out.println("Enter your numbers.");
			for (int i = 0; i < number; i++) {
				a[i] = cs.nextInt();
			}
			a = sorting(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		else {
			System.out.println("Enter a natural number!");
		}
	}
	public static int[] sorting(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int min_i = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					min_i = j;
				}
			}
			if (i != min_i) {
				int some = a[i];
				a[i] = min;
				a[min_i] = some;
			}
		}
		return a;
	}
}
