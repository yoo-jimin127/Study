package chapter2_yoojimin;
import java.util.Scanner;
public class no_6 {

	public static void main(String[] args) {
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int input10, input1;
		input10 = input/10;
		input1 = input%10;
		
		if (input10 == 0) {
			if (input1==3 || input1==6 || input1==9) { System.out.print("�ڼ�¦"); }
			else System.out.print("�н�");
		}
		
		else {
			if (input10==3 || input10==6 || input10==9) {
				if (input1==3 || input1==6 || input1==9) { System.out.print("�ڼ�¦¦"); }
				else System.out.print("�ڼ�¦");
			}
			else if (input10!=3 && input10!=6 && input10!=9) { 
				if (input1==3 || input1==6 || input1==9) { System.out.print("�ڼ�¦"); }
				else System.out.print("�н�");
			}
		}
			scanner.close();
	}
}
