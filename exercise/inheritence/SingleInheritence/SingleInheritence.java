class A {
	int i,j;
	A() {
	}

	A(int a,int b) {
		i=a;
		j=b;
	}
	void Showij() {
		System.out.println("i="+i);
		System.out.println("j="+j);
	}
}

class B extends A {
	int k;
	B(int a, int b, int c) {
		i=a;
		j=b;
		k=c;
	}
	void Showk() {
		System.out.println("k="+k);
	}
}

public class SingleInheritence {
	public static void main(String[] args) {
		B subobj = new B(5,10,15);
		subobj.Showij();
		subobj.Showk();
	}
}

