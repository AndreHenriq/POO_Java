package Ex_Aula_152.Entities;

import Ex_Aula_152.Entities.Enum.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<OrderItem>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client, List<OrderItem> items) {
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.items = items;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem it: items){
            sum += it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Order: " +
                "data=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", items=" + items +
                '}';
    }
}
