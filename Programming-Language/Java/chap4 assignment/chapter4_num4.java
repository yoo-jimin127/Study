package chapter4_yoojimin;

public class chapter4_num4 {
	
	public static class Rectangle {
		private int x, y, width, height;
		
		public Rectangle (int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		
		public int square() {
			return width * height;
		}
		
		public void show() {
			System.out.println("("+x+","+y+")���� ũ�Ⱑ "+width+"X"+height+"�� �簢��");
		}
		
		public boolean contains (Rectangle r) {
			if ( this.x < r.x  && this.y < r.y ) { 
				if ( (r.x + r.width) < (this.x + this.width) && (r.y + r.height) < (this.y + this.height) ) {
					return true;
				}
			}
			return false;
		}
		
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
	}
	}
}
	


