package chapter3_yoojimin;
import java.util.Scanner;

public class chapter3_num4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ҹ��� ���ĺ� �ϳ��� �Է��Ͻÿ�>>");
		String s = scanner.next();
		char c = s.charAt(0);
		
		for (int i = 0; i <= c-'a'; i++) {
			for (char j= 'a'; j <= c-i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		scanner.close();
	}
}
