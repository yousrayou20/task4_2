//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Objects;


class Car {
    private String model;
    private String brand;
    private int year;
    private int price;
    private String color;
    private int quantity;

    public Car(String model, String brand, int year, int price, String color, int quantity) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    public String getModel() {return model;}

    public String getBrand() {return brand;}

    public int getYear() {return year;}

    public int getPrice() {return price;}

    public String getColor() {return color;}

    public int getQuantity() {return quantity;}

    public void setModel(String model) {this.model = model;}

    public void setBrand(String brand) {this.brand = brand;}

    public void setYear(int year) {this.year = year;}

    public void setPrice(int price) {this.price = price;}

    public void setColor(String color) {this.color = color;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model + '\'' +
                ", brand=" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color=" + color +
                ", quantity=" + quantity +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && price == car.price && quantity == car.quantity && Objects.equals(model, car.model) && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, brand, year, price, color, quantity);
    }

    void sll(int sold){ quantity -= sold; }

    void delivery (int delivery) {quantity +=delivery;}

}


class CarDemo {
    public static void main(String[] args) {

        Car car1 = new Car("GLE", "Mercedes", 2020, 400000, "White", 5 );

        System.out.println(car1.toString());

        System.out.println(car1.getColor());
        car1.sll(1);
        car1.delivery(2);
        int year = car1.getYear();
        car1.setColor("black");
        System.out.println(car1.toString());

    }
}