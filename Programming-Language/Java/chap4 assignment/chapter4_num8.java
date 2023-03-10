package chapter4_yoojimin;
import java.util.Scanner;

public class chapter4_num8 {
	public static class Phone {
		String name;
		String tel;
		
		public Phone ( String name, String tel ) {
			this.name = name;
			this.tel = tel;
		}
	}
	
	public static class PhoneBook {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			System.out.print("�ο���>>");
			int total =  scanner.nextInt();
			
			Phone [] obj_phone = new Phone[total];
			
			for ( int i = 0; i < obj_phone.length; i++ ) {
				System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ ���� �Է�)>>");
				
				String name = scanner.next();
				String tel = scanner.next();
				
				obj_phone[i] = new Phone (name, tel);
			}
			
			System.out.println("����Ǿ����ϴ�...");//�̸��� ����ó ���� �ý���

			
			while ( true ) {
				System.out.print("�˻��� �̸�>>");
				String findName = scanner.next();
				
				if( findName.equals("�׸�") ) {
					break;
				}
				
				int i = 0;
				for ( i = 0; i < total; i++ ) {
					if ( (obj_phone[i].name).equals(findName) ) {
						System.out.println(obj_phone[i].name + "�� ��ȣ�� " + obj_phone[i].tel + " �Դϴ�.");
						break;
						}
				}
				
				if ( i == total ) {
					System.out.println(findName + " �� �����ϴ�.");
				}	//����ó ã�� �ý���
			}
			
			scanner.close();
		}
	}
}
