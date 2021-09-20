import java.util.Scanner;

public class Program
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		String result = "" ;
		for (int index = arr.length; index >= 1 ; --index){


			result += arr[index-1];

		}

		System.out.println(result);
	}
}
