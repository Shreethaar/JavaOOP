public class CreatingObjects2 {
	public static void main(String[] args) {
		Box myBox = new Box();
		myBox.width=5;
		myBox.height=10;
		myBox.depth=20;
		double vol=myBox.width*myBox.height*myBox.depth;
		System.out.println("Volume is: " + vol);
	}
}

