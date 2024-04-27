class A {
	A() {
		System.out.println("A's constructor");
	}
	void methodA() {
		System.out.println("A's method");
	}
}

class B extends A {
	B() {
		System.out.println("B's constructor");
	}
	void methodB() {
		System.out.println("B's Method");
	}
}

class C extends A {
	C() {
		System.out.println("C's constructor");
	}
	void methodC() {
		System.out.println("C's Method");
	}
}

class HierarchicalInheritance {
	public static void main(String[] args) {
		B b = new B();
		b.methodA();
		b.methodB();
		C c = new C();
		c.methodA();
		c.methodC();
	}
}

