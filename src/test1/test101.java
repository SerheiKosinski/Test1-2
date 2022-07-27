package test1;

public class test101 {

	public static void main(String[] args) {
		/* Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения
		этих переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который 
		находит наибольшее значение из этих двух переменных*/
		
		
		int x = 9;
		int y = 3;
		int w ;
		int s ;
		int r ;
		
		method(x,y);
		
        w = ubtraction(x,y);
        s = sum(x,y);
		r = more(x,y);
		System.out.println(" ubt = " + w);
		System.out.println(" sum = " + s); 
		System.out.println(" more = " + s);
		
	}
		
		public static void method(int x, int y) {
			System.out.println(" in method: x = " + x);
			System.out.println(" in method: y = " + y);
	}
		
		public static int ubtraction(int x, int y) {
			int w;
			w = x - y;
			return w;
		}
		public static int sum(int x, int y) {
			int s;
			s = x - y;
			return s;
		}
		public static int more(int x, int y) {
			int r;
			if (x > y) {
				r = x;
			} else { 
				r = y;
			}
			return r;
		}
		
		
}
