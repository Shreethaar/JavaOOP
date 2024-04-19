public class SwapObjects {
	public static void swap(Box myBox1, Box myBox2) {
		int temp=myBox1.box_no;
		myBox1.box_no=myBox2.box_no;
		myBox2.box_no=temp;
	}

	public static void main(String[] args) {
		Box box1= new Box(1);
		Box box2= new Box(2);
		swap(box1,box2);
		System.out.println("Box 1 number:"+box1.box_no);
		System.out.println("Box 2 number:"+box2.box_no);
	}
}

