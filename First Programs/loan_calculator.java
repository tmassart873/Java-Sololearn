import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		int months = 3;
		while (months > 0){
			-- months;
			amount -= (amount/10);
		}
		System.out.print(amount);
	}
}
