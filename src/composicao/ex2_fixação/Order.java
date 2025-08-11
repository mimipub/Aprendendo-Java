package composicao.ex2_fixação;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Cliente cliente;
    private OrderItem orderItem;
    // Lista de itens do pedido
    List<OrderItem> orderItems = new ArrayList<>();
    //List<Cliente> clientes = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
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

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void addItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem) {
        orderItems.remove(orderItems);
    }

    public double Total(){
        double sum = 0.0;
        for (OrderItem items : orderItems) {
            sum += items.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY:\n");
        sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(cliente.getName()).append(" (").append(cliente.getBirthDate()).append(") - ").append(cliente.getEmail()).append("\n");
        sb.append("\n");
        sb.append("Order items:\n");

        for(OrderItem item : orderItems){
            sb.append(item.toString() + "\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", Total()));

        return sb.toString();
    }
}
