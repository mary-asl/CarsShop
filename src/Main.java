public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Suzuki", "black", 63, 800000, 1.3, 1.5, 3.1);
        Car car2 = new Car("BMW", "white", 65, 850000, 1.4, 1.6, 3.0);
        Car car3 = new Car("BMW", "yellow", 60, 650000, 1.6, 2.0, 3.5);
        Car car4 = new Car("KIA", "yellow", 100, 950000, 4.2, 3.3, 5.4);
        Car car5 = new Car("KIA", "white", 100, 950000, 1.5, 1.9, 2.5);
        Car car6 = new Car("Audi", "red", 90, 900000, 1.7, 1.8, 3.5);
        Car car7 = new Car("KIA", "pink", 90, 900000, 1.7, 1.9, 3.5);
        Shop cars = new Shop();

        try {
            cars.add(car1);
            System.out.println("+ car1");
            cars.add(car2);
            System.out.println("+ car2");
            cars.add(car3);
            System.out.println("+ car3");
            cars.add(car4);
            System.out.println("+ car4");
            cars.add(car5);
            System.out.println("+ car5");
            cars.add(car6);
            System.out.println("+ car6");
            cars.add(car7);
            System.out.println("+ car7");
        } catch (OutOfFreePlaceException e) {
            System.out.println("Too small car!");
        } catch (TooBigCarException e) {
            System.out.println("Too big car!");
        }
        cars.printAll();
    }
}
