package chapter3_yoojimin;
import java.util.Scanner;
public class chapter3_num16 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		String[] str = {"����", "����", "��"};
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		
		while(true) {
			System.out.print("���� ���� ��!>>");
			String user = scanner.next();

			int n = (int)(Math.random()*3);
			String computer = str[n];

			if(user.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[n].equals("��")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ����ڰ� �̰���ϴ�.");
				}
			}
			
			else if(user.equals("����")) {
				if(str[n].equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = ����, ��ǻ�� = ����, �����ϴ�.");
				}
				else if(str[n].equals("��")) {
					System.out.println("����� = ����, ��ǻ�� = ��, ��ǻ�Ͱ� �̰���ϴ�.");
				}
			}
			
			else if(user.equals("��")) {
				if(str[n].equals("����")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ��ǻ�Ͱ� �̰���ϴ�.");
				}
				else if(str[n].equals("����")) {
					System.out.println("����� = ��, ��ǻ�� = ����, ����ڰ� �̰���ϴ�.");
				}
				else if(str[n].equals("��")) {
					System.out.println("����� = ��, ��ǻ�� = ��, �����ϴ�.");
				}
			}
			
			else if(user.equals("�׸�")) {
				break;
			}
		}
		System.out.println("������ �����մϴ�...");
		
		scanner.close();
	}
}
	