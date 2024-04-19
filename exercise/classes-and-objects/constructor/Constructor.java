public class Constructor {
	public static void main(String[] args) {
		Box obj1 = new Box(3,5,10);
		Box obj2 = new Box(10,15,20);

		System.out.println("Vol of Box1: " + obj1.volume());
		System.out.println("Vol of Box2: " + obj2.volume());
	}
}

