package chapter2_yoojimin;
import java.util.Scanner;
public class no_12_2 {

	public static void main(String[] args) {
		System.out.print("����>>");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		
		switch (operator) {
		case "+" :
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 + num2));
			break;
			
		case "-" : 
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 - num2));
			break;
			
		case "*" : 
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 * num2));
			break;
			
		case "/" : 
			if (num2 != 0)
				System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 / num2));
			else System.out.print("0���� ���� �� �����ϴ�.");
			break;
		}
		scanner.close();
	}
}

