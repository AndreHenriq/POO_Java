package Ex_Aula_152.Entities;

public class OrderItem {
    private int quantity;
    private double price;

    public OrderItem() {
    }

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double subTotal(){
        return 0;
    }
}
