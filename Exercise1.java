Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.
package main;

/**
 *
 * @author shreethaar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person1 = new Person("Ean Craig", 22);
        Person person2 = new Person("Evan Ross", 12);
        System.out.println(person1.getName() + " is " + person1.getAge());
        System.out.println(person2.getName() + " is " + person2.getAge());
                
    }
    
}
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
