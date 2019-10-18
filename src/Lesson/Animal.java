package Lesson;

public class Animal {
    int id;
    int age;
    int weight;
    String color;

    public Animal(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public String voice(){
        return "Hello";
    }
}

class Pet extends Animal{
    String name;
    boolean isVaccinated;

    public Pet(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
    }
    public String voice(){
        return "Hello, my name is " + name;
    }
}

class Wild extends Animal{
    boolean isPredator;

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    public String voice(){
       if(isPredator)
        return "Hello, I am a wild animal and I am angry";
       else return "Hello, I am a wild animal";
    }
}

class Cat extends Pet{
    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public String voice(){
        return "Hello, my name is " + name + " Meow";
    }
}

class Hamster extends Pet{
    public Hamster(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }
}

class Dog extends Pet{
    public Dog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    public String voice(){
        return "Hello, my name is " + name + " Woof";
    }
}

class GuideDog extends Dog{
    boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }
    public String voice(){
        if(isTrained)
            return "Hello, I can take you home";
        else return "Hello, my name is " + name + " Woof";
    }
}

class Fish extends Wild{
    public Fish(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
    public String voice(){
        return "---";
    }
}

class Wolf extends Wild{
    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}

class Lion extends Wild{
    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}

class Giraffe extends Wild{
    public Giraffe(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}

class Crocodile extends Wild{
    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Fish fish = new Fish(4, 5, 2, "Silver", false);
        Cat cat = new Cat(9, 10, 7, "Grey", "Vasya", true);
        Wolf wolf = new Wolf(5,15,50,"Gray", true);
        Hamster hamster = new Hamster(10,3,1,"white","Homa",true);
        Dog dog = new Dog(11,9,25,"brown","Sharik",true);
        GuideDog guideDog = new GuideDog(12,9,28,"brown","K9",true,true);
        Lion lion = new Lion(6,15,150,"red",true);
        Giraffe giraffe = new Giraffe(7,30,300,"yellow",true);
        Crocodile crocodile = new Crocodile(8,50,120,"green",true);

        Animal[] animals = new Animal[9];//массив с объектами
        animals[0] = fish;
        animals[1] = cat;
        animals[2] = wolf;
        animals[3] = hamster;
        animals[4] = dog;
        animals[5] = guideDog;
        animals[6] = lion;
        animals[7] = giraffe;
        animals[8] = crocodile;

        for (Animal animal : animals){
            System.out.println(animal.voice());
        }
    }
}
