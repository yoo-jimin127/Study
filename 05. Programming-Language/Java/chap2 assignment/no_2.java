package chapter2_yoojimin;
import java.util.Scanner;
public class no_2 {

	public static void main (String[] args) {
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner (System.in);
		int input = scanner.nextInt();
		
		int input10, input1;
		input10 = input/10;
		input1 = input%10;
		
		if(input10==input1) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			}
		else { 
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scanner.close();
	}
}
