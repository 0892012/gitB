import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyPoint {
	
	int x, y;
	static void printClassName(Object o)
	{
		System.out.printf("%x",o.hashCode()); // MyPoint�� java.lang ��Ű���� ����, default��
		System.out.println(o + "�Դϴ�."); //(o)�� ������ ���
		System.out.println(o.getClass().getName());
	}
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	public String toString(){ //<- �������̵�
		return "(" + x + "," + y + ")"; 
	}
	
	public boolean equals(MyPoint a) // <-�������̵�
	{
		if( x == a.x && y == a.y) return true;
		else return false;
	}
	
	public static void main(String[] args) {
//		MyPoint p = new MyPoint(2,3);
//		
//		printClassName(p); //<-��ĳ���ø���? 
//		System.out.println(p); // p.toString()
//		
//		MyPoint q = new MyPoint(2,3);
//		if( p.equals(q)) //<-p,q�� ���۷����� �翬�� �ּҰ� �ٸ��� �������� ����,
//			System.out.println("equal");
//		else
//			System.out.println("not equal");
		
//		Integer n = 5; //auto boxing		Integer n = new Integer(5);
//		int x = n; //auto unboxing		int x = n.intValue();
//		System.out.println(x);
//		System.out.println(Integer.bitCount(n));
//		System.out.println(Integer.parseInt("     1234567     ".trim())); //<- trim()
//		System.out.println("Shut the fuck up".length());
//		
//		Scanner s = new Scanner(System.in);
//		System.out.println(">>");
//		String text =  s.next(); //<- ���ڿ��� �а�
//		
//		StringTokenizer st = new StringTokenizer(text, ";:");
//		while(st.hasMoreTokens()){ // <<�״��� token�� ������ true,
//			System.out.println(st.nextToken());
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		}
	}


//getClass ����