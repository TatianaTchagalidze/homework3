// Main.java file
public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Fluffy", 2, "White");

        // Call the speak method of genericAnimal (which just prints "I am an animal.")
        genericAnimal.speak();
        // Print the name and age of genericAnimal using the getters
        System.out.println("Name: " + genericAnimal.getName() + ", Age: " + genericAnimal.getAge());

        // Call the speak method of dog (which prints "Woof! Woof!")
        dog.speak();
        // Print the name, age, and breed of dog using the getters
        System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + dog.getBreed());

        // Call the speak method of cat (which prints "Meow! Meow!")
        cat.speak();
        // Print the name, age, and color of cat using the getters
        System.out.println("Name: " + cat.getName() + ", Age: " + cat.getAge() + ", Color: " + cat.getColor());
    }
}
