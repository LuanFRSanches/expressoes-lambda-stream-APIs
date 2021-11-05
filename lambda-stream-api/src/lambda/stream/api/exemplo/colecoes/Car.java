package lambda.stream.api.exemplo.colecoes;

public class Car {
    private String brand;
    private double prince;

    public Car(String brand, double prince) {
        this.brand = brand;
        this.prince = prince;
    }

    public void addTax() {
        prince = prince += prince * 0.1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrince() {
        return prince;
    }

    public void setPrince(double prince) {
        this.prince = prince;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", prince=" + prince +
                '}';
    }
}
