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
		System.out.println("B's method");
	}

}

class C extends B {
	C() {
		System.out.println("C's constructor");
	}
	void methodC() {
		System.out.println("C's method");
	}
}

class MultilevelInheritence {
	public static void main(String[] args) {
		C c = new C();
		c.methodA();
		c.methodB();
		c.methodC();
	}
}

