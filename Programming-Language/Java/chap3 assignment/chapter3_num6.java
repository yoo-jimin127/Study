package chapter3_yoojimin;
import java.util.Scanner;
public class chapter3_num6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ��� �Է��Ͻÿ�>>");
		int money = scanner.nextInt();
		
		for( int exchange : unit ) {
			if ( money/exchange != 0 ) {
				System.out.println(exchange + "�� ¥�� : " + money/exchange +"��");
				money = money - (money/exchange*exchange);
			}
		}
		
		scanner.close();
	}
}
