public class ExceptionHandling1 {
	public static void main(String[] args) {
		int d,a;
		try {
			d=0;
			a=42/d;
		}
		catch(ArithmeticException e) {
			System.out.println("By printStackTrace() method");
			e.printStackTrace();
			System.out.println(e);
			System.out.println("by toString method");
			System.out.println(e.toString());
			System.out.println("By getMessage()");
			System.out.println(e.getMessage());
		}
	}
}

