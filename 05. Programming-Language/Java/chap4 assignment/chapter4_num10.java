package chapter4_yoojimin;
import java.util.Scanner;

public class chapter4_num10 {
	public static class Dictionary {
		private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
		private static String[] eng = {"love", "baby", "money", "future", "hope"};
		
		public static String kor2Eng( String word ) {
			for ( int i = 0; i < kor.length; i++ ) {
				if ( word.equals(kor[i]) ) {
					return (word + "��/�� " + eng[i]);
				}
			}
			return (word+ "��/�� ���� ������ �����ϴ�.");
			}
	}
	
	static class DicApp {
		
		public static void main (String[] args) {
			System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
			Scanner scanner = new Scanner (System.in);
			
			while ( true ) {
				System.out.print("�ѱ� �ܾ�?");
				String kor_input = scanner.next();
				
				if ( kor_input.equals("�׸�") ) {
					break;
				}
				
				else {
					System.out.println(Dictionary.kor2Eng(kor_input));
				}
			}
			scanner.close();
		}
	}
}
