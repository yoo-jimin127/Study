package chapter2_yoojimin;
import java.util.Scanner;
public class no_8 {
	
	public static void main(String[] args) {

		
		System.out.print("�� �� (x1,y1), (x2,y2)�� �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		boolean tf1 = inRect(x1,y1);
		boolean tf2 = inRect(x2,y2);
		
		if(tf1==true || tf2==true) System.out.print("(100,100), (200,200)�� �� ������ �̷���� ���簢���� �浹�մϴ�.");
		else System.out.print("(100,100), (200,200)�� �� ������ �̷���� ���簢���� �浹���� �ʽ��ϴ�.");
		
		scanner.close();
	}
	public static boolean inRect(int x, int y) {
		if((x>= 100 & x<=200) && (y>= 100 & y<=200)) return true;
		else return false; }
}
