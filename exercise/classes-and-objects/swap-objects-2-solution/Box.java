public class Box {
	int no;
	float length;
	float depth;
	float width;

	Box(int n,float l, float d, float w) {
		no=n;
		length=l;
		depth=d;
		width=w;
	}

	void characteristics() {
		System.out.println("Box number:"+no+" Length:"+length+" Depth:"+depth+" Width:"+width);
	}
}

