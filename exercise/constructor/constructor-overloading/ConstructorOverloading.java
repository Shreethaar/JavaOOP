class Person {
	int age;
	double height;
	double weight;

	Person() {
		System.out.println("No parameterized constructor");
		age=0;
		height=0.0;
		weight=0.0;
	}

	Person(int age) {
		System.out.println("One parameter constructor");
		this.age=age;
		height=0.0;
		weight=0.0;
	}

	Person(int age, double height) {
		System.out.println("Two parameter constructor");
		this.age=age;
		this.height=height;
		weight=0.0;
	}

	Person(int age, double height, double weight) {
		System.out.println("Three paramter constuctor");
		this.age=age;
		this.height=height;
		this.weight=weight;
	}

	public String toString() {
		return "Age:"+age+"\nHeight:"+height+"\nWeight:"+weight;
	}
}


public class ConstructorOverloading {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person(22);
		System.out.println(p2);
		Person p3 = new Person(22,5);
		System.out.println(p3);
		Person p4 = new Person(22,5,65);
		System.out.println(p4);
	}
}

