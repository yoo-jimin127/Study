package chapter3_yoojimin;
import java.util.Scanner;
public class chapter3_num14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = {95, 88, 76, 62, 55};
		int i = 0;
		
		while(true) {
			System.out.print("���� �̸�>>");
			String name = scanner.next();
			
			for (i = 0; i < course.length; i++) {
				if ( name.equals(course[i])) {
					System.out.println(course[i] + "�� ������ " + score[i]);
					break;
				}
			}
		
			if(name.equals("�׸�")) break;
			
			if( i == course.length) {
				System.out.println("���� �����Դϴ�.");
			}
			
		}
		scanner.close();
	}
}
