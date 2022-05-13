package KD1;

public class Main {

    public static void main(String[] args) {

        int box = 5;
        System.out.println(box);
        box = box+2;
        System.out.println(box);
        box = box-3;
        System.out.println(box);
        box = box*3;
        System.out.println(box);
        box = box/3;
        System.out.println(box);

        int liftingCapacity = 50;
        int stuffLoaded = 20;
        int capacityLeft = liftingCapacity-stuffLoaded;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        int appleWeight = 4;
        int orangesWeight = 2;
        int fruitsWeight = appleWeight + orangesWeight;
        System.out.println(fruitsWeight + " кг");

        int meatWeight = 8;
        int zucciniWeight = 8;
        int tomatoWeight = 10;
        int vegetableWeight = zucciniWeight + tomatoWeight;
        int foodWeight = vegetableWeight + fruitsWeight + meatWeight;
        System.out.println("Общий вес продуктов " + foodWeight + " кг");


        int newFoodWeight = foodWeight * 2;
        int remainingWeight = liftingCapacity - newFoodWeight - stuffLoaded;
        System.out.println(remainingWeight);

        int overload = (newFoodWeight + stuffLoaded) % liftingCapacity;
        System.out.println("Перегруз составляет " + overload + " кг");
    }
}

