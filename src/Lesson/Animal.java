package Lesson;

//Рефакторинг программы с учетом использования интерфейсов

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

    public String voice(){ return "";} //Затычка используется для того, чтобы распечатать
    // голоса животных в цикле FOREACH.


}

class Pet extends Animal implements Voice{
    String name;

    public Pet(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color);
        this.name = name;
    }

    public String voice(){return " ";}
}

class Wild extends Animal implements Voice, Predator{

    public Wild(int id, int age, int weight, String color) {
        super(id, age, weight, color);

    }

    public boolean isPredator(){return true;}

    public String voice(){
       if(this.isPredator())
        return "Hello, I am a wild animal and I am angry";
       else return "Hello, I am a wild animal";
    }
}

class Cat extends Pet implements Vaccinated{
    public Cat(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    public String voice(){
        return "Hello, my name is " + name + " Meow";
    }
    public boolean isVaccinated(){ return true;}

}

class Hamster extends Pet implements Vaccinated{
    public Hamster(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }
    public String voice(){
        return "Hello, my name is " + name;
    }
    public boolean isVaccinated(){ return true;}
}

class Dog extends Pet implements Vaccinated{
    public Dog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
    }

    public String voice(){
        return "Hello, my name is " + name + " Woof";
    }
    public boolean isVaccinated(){ return true;}
}

class GuideDog extends Dog implements Trained{
    //boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name) {
        super(id, age, weight, color, name);
        //this.isTrained = isTrained;
    }

    public boolean isVaccinated(){ return true;}
    public boolean isTrained(){return true;}

    public String voice(){
        if(this.isTrained())
            return "Hello, I can take you home";
        else return "Hello, my name is " + name + " Woof";
    }
}

class Fish extends Wild{
    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public String voice(){
        return "---";
    }
    public boolean isPredator(){return false;}
}

class Wolf extends Wild{
    public Wolf(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public boolean isPredator(){return true;}
}

class Lion extends Wild{
    public Lion(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public boolean isPredator(){return true;}
}

class Giraffe extends Wild{
    public Giraffe(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public boolean isPredator(){return false;}
}

class Crocodile extends Wild{
    public Crocodile(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    public boolean isPredator(){return true;}
}

class TestAnimal{
    public static void main(String[] args) {
        Fish fish = new Fish(4, 5, 2, "Silver");
        Cat cat = new Cat(9, 10, 7, "Grey", "Vasya");
        Wolf wolf = new Wolf(5,15,50,"Gray");
        Hamster hamster = new Hamster(10,3,1,"white","Homa");
        Dog dog = new Dog(11,9,25,"brown","Sharik");
        GuideDog guideDog = new GuideDog(12,9,28,"brown","K9");
        Lion lion = new Lion(6,15,150,"red");
        Giraffe giraffe = new Giraffe(7,30,300,"yellow");
        Crocodile crocodile = new Crocodile(8,50,120,"green");

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
        System.out.println(guideDog.isTrained());
    }
}
