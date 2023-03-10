package chapter4_yoojimin;
import java.util.Scanner;

public class chapter4_num12 {
	//���� �ý��� �޴� : ����, ����, ���, ������
	//���� : 1�ڸ��� ����, �¼� Ÿ��, ������ �̸�, �¼� ��ȣ ������� input
	//��ȸ : ��� �¼� ��� (S��, A��, B��)
	//��� : ������ �̸� �Է� -> �ش� ������ �����¼� ���
	
	public static class Reservation {//���� �ý��� Ŭ����
		private String[] S = new String[10];
		private String[] A = new String[10];
		private String[] B = new String[10];
		Scanner scanner = new Scanner(System.in);
		
		public void Initialization() {//�ʱ� �¼� ����
			for(int i=0; i<S.length; i++) {
				S[i] = "---";
				A[i] = "---";
				B[i] = "---";
				}
			}
		public void S_seat() {//S�� seat ��ȸ �� ����Ʈ �ý���
			System.out.print("S>>");
			for(int i=0; i<S.length; i++) {
				System.out.print(" "+S[i]);
				}
			System.out.println();
			}
		
		public void A_seat() {//A�� seat ��ȸ �� ����Ʈ �ý���
			System.out.print("A>>");
			for(int i=0; i<A.length; i++) {
				System.out.print(" "+A[i]);
				}
			System.out.println();
			}
		
		public void B_seat() {//B�� seat ��ȸ �� ����Ʈ �ý���
			System.out.print("B>>");
			for(int i=0; i<B.length; i++) {
				System.out.print(" "+B[i]);
			}
			System.out.println();
			}
		
		public void show() {
			S_seat();
			A_seat();
			B_seat();
			System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
		
		public void SeatReservation() {//���� �ý���(���ڸ��� ����, �¼� Ÿ�� - ������ �̸� - �¼���ȣ)
			while(true) {
				System.out.print("�¼����� S(1), A(2), B(3)>>");
				int num = scanner.nextInt();
				
				switch(num) {
				case 1 :
					S_seat();
					System.out.print("�̸�>>");
					String S_name = scanner.next();
					
					while(true) {
						System.out.print("��ȣ>>");
						int S_number = scanner.nextInt();
						if(S_number<=0 || S_number>=11) {
							System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
							}
						else if(S[S_number-1].equals("---")) {
							S[S_number-1] = S_name;
							break;
							}
						else {
							System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
							}
						}
					break;
					case 2 :
						A_seat();
						System.out.print("�̸�>>");
						String A_name = scanner.next();
						while(true) {
							System.out.print("��ȣ>>");
							int A_number = scanner.nextInt();
							if(A_number<=0 || A_number>=11) {
								System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
								}
							else if(A[A_number-1].equals("---")) {
								A[A_number-1] = A_name;
								break;
								}
							else {
								System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
								}
							}
						break;
						case 3 :
							B_seat();
							System.out.print("�̸�>>");
							String B_name = scanner.next();
							while(true) {
								System.out.print("��ȣ>>");
								int B_number = scanner.nextInt();
								if(B_number<=0 || B_number>=11) {
									System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
									}
								else if(B[B_number-1].equals("---")) {
									B[B_number-1] = B_name;
									break;
									}
								else {
									System.out.println("���� ��ȣ�Դϴ�. �ٽ� �õ����ּ���.");
									}
								}
							break;
							default :
								System.out.println("���� ��ȣ�Դϴ�. �ٽ� �Է����ּ���.");
								}
				
				if(num>0 && num<4) { break; }
				}
			}
		
		public void SeatCancel() {//��� �ý��� (������ �̸� �Է¹޾� ���)
			while(true) {
				System.out.print("�¼� S:1, A:2, B:3>>");
				int num = scanner.nextInt();
				
				switch(num) {
				case 1 :
					S_seat();
					while(true) {
						System.out.print("�̸�>>");
						String S_name = scanner.next();
						
						int i = 0, check = 0;
						for(i = 0; i < 10 ; i++) {
							if(S_name.equals(S[i])) {
								S[i] = "---";
								check = 1;
								break;
								}
							}
						if(i == 10) {
							System.out.println("������ ��ܿ� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
						}
						
						if(check == 1) { break; }
						
						}
					break;
					
					case 2 :
						A_seat();
						while(true) {
							System.out.print("�̸�>>");
							String A_name = scanner.next();
							
							int i = 0, check = 0;
							for(i = 0; i < 10 ; i++) {
								if(A_name.equals(A[i])) {
									A[i] = "---";
									check = 1;
									break;
									}
								}
							
							if(i == 10) {
								System.out.println("������ ��ܿ� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
							}
							
							if(check == 1) { break; }
							
							}
						break;
						
						case 3 :
							B_seat();
							while(true) {
								System.out.print("�̸�>>");
								String B_name = scanner.next();
								
								int i = 0, check = 0;
								for(i = 0; i < 10 ; i++) {
									if(B_name.equals(B[i])) {
										B[i] = "---";
										check = 1;
										break;
										}
									}
								
								if(i == 10) {
									System.out.println("������ ��ܿ� ���� �̸��Դϴ�. �ٽ� �õ����ּ���.");
								}
								
								if(check == 1) { break; }
								
								}
							break;
							
						default : System.out.println("�¼� (S:1, A:2, B:3)�� �������ּ���.");
				}
				
					if(num>0 && num<4) { break; }
					}
				}
		
		public static void main(String[] args) {
			System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
			Scanner scanner = new Scanner(System.in);
			Reservation r = new Reservation();
			r.Initialization();
		
		while(true) {
			System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
			int system = scanner.nextInt();
			
			switch(system) {
			case 1 ://����
				r.SeatReservation();
				break;
				
			case 2 ://����
				r.show();
				break;
				
			case 3 ://���
				r.SeatCancel();
				break;
				
			case 4 ://������
				break;
				
			default :
				System.out.println("���� �޴��Դϴ�. ����:1, ��ȸ:2, ���:3, ������:4 �� �������ּ���.");
			}
			if(system == 4) { break; }
		}
		scanner.close();
		}

	}

}