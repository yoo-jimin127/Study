package chapter2_yoojimin;
import java.util.Scanner;
public class no_12_1 {

	public static void main(String[] args) {
		System.out.print("����>>");
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		String operator = scanner.next();
		double num2 = scanner.nextDouble();
		
		if (operator.equals("+")) { 
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 + num2)); }
		else if (operator.equals("-")) { 
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 - num2)); }
		else if (operator.equals("*")) { 
			System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 * num2)); }
		else if (operator.equals("/")) { 
			if (num2 != 0) { 
				System.out.print(num1 + operator + num2 + "�� ��� ����� " + (num1 / num2)); }
			else System.out.print("0���� ���� �� �����ϴ�."); }
		
		scanner.close();
	}
}

