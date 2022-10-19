package package1;

public class Demo1 {
	int counter=1;
	int fact=1;
	public int m1(int x) {
		if(counter<=x) {
			fact=fact*counter;
			counter++;
			m1(x);
		}
		return fact;
	}
	public static void main(String[] args) {
		
		System.out.println(new Demo1().m1(5));
		
	}

}
