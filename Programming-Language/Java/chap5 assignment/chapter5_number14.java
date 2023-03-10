//chapter 5_number14
package chapter5_yoojimin;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("--- �ٽ� �׸��ϴ�. ");
		draw();
	}
}
	
	class Circle implements Shape {
		private int radius;
		
		public Circle(int radius) { this.radius = radius; }
		
		public void draw() {
			System.out.println("�������� " + radius + "�� ���Դϴ�.");
		}
		
		public double getArea() {
			return PI*radius*radius;
		}
	}
	
	class Oval implements Shape {
		private int oval_radius1, oval_radius2;
		
		public Oval(int oval_radius1, int oval_radius2) {
			this.oval_radius1 = oval_radius1;
			this.oval_radius2 = oval_radius2;
		}
		
		public void draw() {
			System.out.println(oval_radius1 + "X" + oval_radius2 + "�� �����ϴ� Ÿ���Դϴ�.");
		}
		
		public double getArea() {
			return PI*oval_radius1*oval_radius2;
		}
	}
	
	class Rect implements Shape {
		private int width, height;
		public Rect(int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public void draw() {
			System.out.println(width + "X" + height + "ũ���� �簢�� �Դϴ�. ");
		}
		
		public double getArea() {
			return width*height;
		}
	}

public class chapter5_number14 {
	
	static public void main (String[] args) {
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for ( int i = 0; i < list.length; i++ ) list[i].redraw();
		for ( int i = 0; i < list.length; i++ ) System.out.println("������ " + list[i].getArea());
	}
}

