public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("karabas",3);
        System.out.println("My dog's name is " + myDog.name + ". And it is " + myDog.age + " years old. ");

        Dog d2 = new Dog();
        Dog d3 = new Dog("Dino");
    }
}
