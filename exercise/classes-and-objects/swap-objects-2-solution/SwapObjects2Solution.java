public class SwapObjects2Solution {
	public static void swap(BoxWrapper myBox1, BoxWrapper myBox2) {
		Box temp = myBox1.myBox;
		myBox1.myBox=temp;
	}

	public static void main(String[] args) {
		Box box1=new Box(1,30f,45.5f,67.8f);
		Box box2=new Box(2,75f,90f,10f);
		BoxWrapper boxw1 = new BoxWrapper(box1);
		BoxWrapper boxw2 = new BoxWrapper(box2);
		swap(boxw1,boxw2);
		boxw1.myBox.characteristics();
		boxw2.myBox.characteristics();
	}
}

