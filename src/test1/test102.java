package test1;

public class test102 {

		/*  ������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������.
		�������� �����������, ���������������� ����� ������ �� ���������. 
		�������� set- � get- ������ ��� ����� ���������� ������.*/

	private int x;
	private int y;
    
	///////////////////////////
	public test102() {
		x = 45;
		y = 46;
	}

	public test102(int a, int b) {
		x = a;
		y = b;
	}
    /////////////////////////////////
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
    /////////////////////////////////////
	public static void main(String[] args) {
		
		test102 t1 = new test102();
		test102 t2 = new test102(42, 48);

		System.out.println(t1.getX() + "<" + t2.getX() + " " + (t1.getX() < t2.getX()));
		System.out.println(t1.getY() + "<" + t2.getY() + " " + (t1.getY() < t2.getY()));

	}

}
