import java.util.ArrayList;

public class Shop {

    Shop() {
    }

    private ArrayList<Car> listForCars = new ArrayList<>();

    public void add(Car car) throws OutOfFreePlaceException, TooBigCarException {
        double volume = car.getHeight() * car.getLength() * car.getWidth();
        if (listForCars.size()>5)
            throw new OutOfFreePlaceException();

        if (volume > 60)
            throw new TooBigCarException();
        listForCars.add(car);
    }

    public void totalPrice() {

        double total = 0;

        for (int i = 0; i < listForCars.size(); i++) {
            total += listForCars.get(i).getPrice();
        }
        System.out.println("\nTotal price: " + total);
    }


    public void carSelling(Car car) {
        listForCars.remove(car);
        System.out.println("One " + car.getBrand() + "\nwhich color is " + car.getColor() + "\nand power is " + car.getPower() + "\nwas sold by price " + car.getPrice());
    }

    public void printAll() {
        for (Car car : listForCars) {
            System.out.println(car);
        }

    }
}

