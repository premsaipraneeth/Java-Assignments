public class Product {
    double price = 10.0;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getPrice(int q) {

        System.out.println(q*price);
    }


}
