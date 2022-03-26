package by.itClass;

public class Car {

    int cost;
    String color;
    String mark;

    public Car(int cost, String color, String mark) {
        this.cost = cost;
        this.color = color;
        this.mark = mark;
    }

    public int getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public static int averageCost(Car[] cars) throws NullPointerException, ArithmeticException {
        if (cars == null) {
            throw new NullPointerException("You have an empty array of cars");
        }
        int totalCost = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                throw new NullPointerException("You have an empty data car");
            }
            if (cars[i].cost <= -1) {
                throw new ArithmeticException("You have a car with negative cost");
            }
            totalCost += cars[i].cost;
        }
        return cars.length == 0 ? 0 : totalCost / cars.length;
    }
}
