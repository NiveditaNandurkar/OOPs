/*
9. A car manufacturing company models a Car class that internally contains an Engine as a static nested class, since the engine specification does not depend on a specific car object. Write a Java program to implement this.
*/
class Q9 {
    static class Engine {
        String type;

        Engine(String type) {
            this.type = type;
        }

        void showEngineDetails() {
            System.out.println("Engine type: " + type);
        }
    }

    static class Car {
        String model;
        static Engine engine = new Engine("Petrol");

        Car(String model) {
            this.model = model;
        }

        void displayCarDetails() {
            System.out.println("Car model: " + model);
            engine.showEngineDetails();
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car("Swift");
        Car c2 = new Car("Baleno");

        c1.displayCarDetails();
        c2.displayCarDetails();
    }
}
