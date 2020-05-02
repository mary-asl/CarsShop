
public class Car {
    private String brand;
    private String color;
    private int power;
    private double price;
    private double height;
    private double width;
    private double length;

    public Car(String brand, String color, int power, double price, double height, double width, double length) {
        this.brand = brand;
        this.color = color;
        this.power = power;
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}


