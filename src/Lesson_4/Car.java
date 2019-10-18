package Lesson_4;

public class Car {
    double capacity = 50; //Емкость бака. Перед началом поездки заливаем полный бак.
    double remain = 50; //остаток топлива в баке
    double consumption = 5.8; //расход топлива л/100км

    static final double COST = 32; //цена топлива в гривнах
    static final double PATH1 = 178; //Расстояние Одесса - Кривое Озеро
    static final double PATH2 = 154; //Расстояние Кривое Озеро - Жашков
    static final double PATH3 = 141; //Расстояние Жашков - Киев
    static final double PATH4 = 473; //Общее расстояние


    double fillTank(double capacity, double remain) { //метод определяющий сколько нужно залть топлива до полного бака
        return capacity - remain;
    }

    double fuelRemaining(double path) { //метод определяющий остаток топлива
        return capacity - (path * consumption / 100);// параметр double path - путь пройденный машиной
    }

    double fuelShortage(double path) { //метод определяющий сколько топлива израсходовано
        return path * consumption / 100;
    }

    Car (double cap, double rem,  double con ){
        capacity = cap;
        remain = rem;
        consumption = con;
    }

    public static void main(String[] args) {

        Car car = new Car(50, 50, 5.8);

        System.out.printf("Расход топлива на маршруте Одесса - Кривое Озеро (литры) %.2f %n", car.fuelShortage(PATH1));
        System.out.printf("Остаток топлива (литры) %.2f %n", (car.fuelRemaining(PATH1)));

        System.out.printf("\nРасход топлива на маршруте Кривое Озеро - Жашков (литры) %.2f %n", (car.fuelShortage(PATH2)));
        System.out.printf("Остаток топлива (литры) %.2f %n", (car.fuelRemaining(PATH2)));

        System.out.printf("\nРасход топлива на маршруте Жашков - Киев (литры) %.2f %n", (car.fuelShortage(PATH3)));
        System.out.printf("Остаток топлива (литры) %.2f %n", (car.fuelRemaining(PATH3)));

        System.out.printf("\nОбщий расход топлива Одесса - Киев (литры) %.2f %n", (car.fuelShortage(PATH4)));
        System.out.printf("Общяя стоимость топлива Одесса - Киев (гривны) %.2f %n", (car.fuelShortage(PATH4)) * COST);

        System.out.printf("\nОстаток топлива в пункте назначения (литры) %.2f %n", (car.fuelRemaining(PATH3)));
    }

}
