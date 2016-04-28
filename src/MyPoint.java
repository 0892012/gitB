import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyPoint {
	
	int x, y;
	static void printClassName(Object o)
	{
		System.out.printf("%x",o.hashCode()); // MyPoint가 java.lang 패키지에 속해, default야
		System.out.println(o + "입니다."); //(o)와 동일한 결과
		System.out.println(o.getClass().getName());
	}
	public MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	
	
	public String toString(){ //<- 오버라이딩
		return "(" + x + "," + y + ")"; 
	}
	
	public boolean equals(MyPoint a) // <-오버라이딩
	{
		if( x == a.x && y == a.y) return true;
		else return false;
	}
	
	public static void main(String[] args) {
//		MyPoint p = new MyPoint(2,3);
//		
//		printClassName(p); //<-업캐스팅맞지? 
//		System.out.println(p); // p.toString()
//		
//		MyPoint q = new MyPoint(2,3);
//		if( p.equals(q)) //<-p,q가 레퍼런스는 당연히 주소가 다른데 같을수가 없지,
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
//		String text =  s.next(); //<- 문자열을 읽고
//		
//		StringTokenizer st = new StringTokenizer(text, ";:");
//		while(st.hasMoreTokens()){ // <<그다음 token이 있으면 true,
//			System.out.println(st.nextToken());
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH)+1);
		System.out.println(now.get(Calendar.DAY_OF_MONTH));
		System.out.println(now.get(Calendar.HOUR));
		System.out.println(now.get(Calendar.MINUTE));
		}
	}


//getClass 공부