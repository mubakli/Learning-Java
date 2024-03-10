public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal","Huge", 400);
        doAnimalStuf(animal,"slow");

        Dog dog = new Dog();
        doAnimalStuf(dog,"fast");

        Dog yorkie = new Dog("Yorkie",15);
        doAnimalStuf(yorkie,"fast");
        Dog retriver = new Dog("Labrador Retriever", 65 , "Flopy","Swimmer");
        doAnimalStuf(retriver, "slow");

        Dog wolf = new Dog("Wolf",40);
        doAnimalStuf(wolf,"slow");

        Fish goldie = new Fish("Goldfish",0.25,2,3);
        doAnimalStuf(goldie, "fast");
    }
    public static void doAnimalStuf(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ ");
    }
}
