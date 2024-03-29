class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bark bark");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The cat says: Don't touch me!");
    }
}

class Bird extends Animal {
    public void animalSound() {
        System.out.println("The bird says: Chirp chirp");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myBird = new Bird();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myBird.animalSound();
    }
}
