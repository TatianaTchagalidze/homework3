public class Animal {
    private String name;
    private int age;

    //The constructor method that takes in two parameters 'name' and 'age'.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This is a getter method that returns the value of the 'name' variable.
    public String getName() {
        return name;
    }

    // This is a getter method that returns the value of the 'age' variable.
    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("I'm an animal!");
    }
}
