import by.itClass.Car;

public class Main {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        Car[] cars = new Car[]{
                new Car(2, "red", "mercedes"),
                new Car(4, "white", "BMW"),
                new Car(6, "black", "volvo"),
                new Car(8, "brown", "kia"),
                new Car(10, "aquamarine", "lamborghini")
        };

        printData(cars);

        try {
            System.out.println("Average cost of these cars: " + Car.averageCost(cars) + " nums of money");
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        }

        Car[] cars1 = null;

        printData(cars1);

        try {
            System.out.println("Average cost of these cars: " + Car.averageCost(cars1));
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Program is working anyway\n");
        }

        Car[] cars2 = new Car[]{};

        printData(cars2);

        try {
            System.out.println("Average cost of these cars: " + Car.averageCost(cars2));
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Program is working anyway, again");
        }
    }

    public static void printData(Car[] cars) {
        if (cars == null) {
            System.out.println(ANSI_YELLOW + "\nThe new array of cars have empty data" + ANSI_RESET);
            return;
        }
        for (Car car : cars) {
            if (car == null) {
                System.out.println(ANSI_YELLOW + "This car doesn't have any information" + ANSI_RESET);
            } else {
                System.out.printf("Car %s has color %s and cost %d\n", car.getMark(), car.getColor(), car.getCost());
            }
        }
    }
}
