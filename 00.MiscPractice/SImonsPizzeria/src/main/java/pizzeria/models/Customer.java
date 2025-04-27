package pizzeria.models;

public class Customer {

    private String name;
    private Order order;

    public Customer(String name, Order order){
        this.name = name;
        this.order = order;
    }

    public void giveOrder(){
        // TODO: print the order
    }

    public Order getOrder(){
        return order;
    }

    public String getName(){
        return name;
    }
}
