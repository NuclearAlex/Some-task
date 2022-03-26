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
                null
        };

        printData(cars);

        try {
            System.out.println("\nAverage cost of these cars: " + Car.averageCost(cars) + " nums of money");
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        }


        Car[] cars1 = null;

        System.out.println("\nThe new array of cars have null data\n");
        try {
            System.out.println("Average cost of these cars: ");
            System.out.println(Car.averageCost(cars1));
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Program is working anyway");
        }


        Car[] cars2 = new Car[]{};
        System.out.println("\nThe new array of cars have empty data\n");
        try {
            System.out.println("Average cost of these cars: ");
            System.out.println(Car.averageCost(cars2));
        } catch (Exception e) {
            System.out.println(ANSI_YELLOW + e.getMessage() + ANSI_RESET);
        } finally {
            System.out.println("Program is working anyway");
        }

    }

    public static void printData(Car[] cars) {
        for (Car car : cars) {
            if (car == null) {
                System.out.println("This car doesn't have any information");
            } else {
                System.out.printf("Car %s has color %s and cost %d\n", car.getMark(), car.getColor(), car.getCost());
            }
        }
    }
}
