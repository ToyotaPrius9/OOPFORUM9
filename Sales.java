

public class Sales {
// each object contains details of one sale
    

    private String itemId; // id of the item    

    private double value;  // the price of one item    

    private int quantity;  // the number of the items sold    

    
    public Sales(String id, double value, int quantity){// new constructor, to store the declared items
        this.itemId = id;
        this.value = value;
        this.quantity = quantity;
    }

    public double getValue() {return value;} // to return value

    public int getQuantity() {return quantity;} // to return quantity 

}
