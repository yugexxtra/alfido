class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says Woof Woof");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says Meow");
    }
}

public class task1 {
    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30};

        System.out.println("Even and Odd Numbers:");

        for (int num : numbers) {

            if (num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }

        Animal a1 = new Dog("Rocky");
        Animal a2 = new Cat("Kitty");

        System.out.println("\nAnimal Sounds:");

        a1.sound();
        a2.sound();
    }
}