public class Main {

    public static void main(String[] args){

      Customer c1= new Customer("Koi");
      Order o1= new Order("ORD35");

      c1.placeOrder(o1);
      c1.viewOrder();
    }

}

class Customer {
    private String name;
    private Order order;


    public Customer(String name){
        this.name= name;
    }

    public void placeOrder(Order order){
        this.order= order;
    }

    public void viewOrder(){
        if (order != null) {
            order.showOrderDetails();
        }else {
            System.out.println("No order");
        }
    }


}


class Order {
    private String orderId ;

    public Order(String orderId){
        this.orderId= orderId;
    }

    public void showOrderDetails(){
        System.out.println("OrderId:"+ orderId) ;
    }
}





