public class DogClass {

    String breed;
    String name;
    String color;

    int age;

    void bark(){
        System.out.println(name + "can bark");
    }
    void eat(){
        System.out.println(name + " can eat");
    }
    void run(){
        System.out.println(name + " can run ");
    }

    public static void main(String[] args) {
        DogClass Huskey= new DogClass();

        Huskey.breed="African";
        Huskey.color="Silver ";
        Huskey.name="Jani";
        Huskey.age=5;
        System.out.println("i love this dog because " + (Huskey.breed)+ " " + (Huskey.color) +" "+ (Huskey.age) + " and i will name it to "+(Huskey.name));

        Huskey.eat();
        Huskey.run();
        Huskey.bark();

        DogClass BullDag=new DogClass();
        BullDag.color="Black";
        BullDag.breed="Japani";
        BullDag.name="Papi";
        BullDag.run();
        BullDag.eat();
        BullDag.bark();


        DogClass Labrado=new DogClass();
        Labrado.color="Pink";
        Labrado.breed="Chines";
        Labrado.name="Tiger";
        Labrado.age=5;
        Labrado.eat();
        Labrado.run();
        Labrado.bark();

    }

}
