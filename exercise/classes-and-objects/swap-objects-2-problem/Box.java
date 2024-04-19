public class Box {
	int length,box_no;
	
	Box(int l, int no) {
		length=l;
		box_no=no;
	}

	void characteristics() {
		System.out.println("Box no.:"+box_no+" ; length of box:"+length);
	}
}

