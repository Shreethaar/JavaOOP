class Person {
	String name;
	int age;

	Person(String name, int age) {
		System.out.println("This is the original constructor");
		this.name=name;
		this.age=age;
	}

	Person(Person p) {
		System.out.println("This is a copy of the constructor");
		name=p.name;
		age=p.age;
	}

	public String toString() {
		return "Name:"+name+"\nAge:"+age;
	}

}

class CopyConstructor {
	public static void main(String[] args) {
		Person p1 = new Person("Disha",22);
		System.out.println(p1);
		Person p2 = new Person(p1);
		System.out.println(p2);
	}
}

