public class CreatingObjects1 {
	public static void main(String[] args) {
		Box obj1 = new Box();
		Box obj2 = new Box();
		obj1.setDim(3,5,10);
		obj2.setDim(10,15,20);

		System.out.println("Vol of Box1: " + obj1.volume());
		System.out.println("Vol of Box2: " + obj2.volume());
	}
}

