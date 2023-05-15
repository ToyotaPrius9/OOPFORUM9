
import java.util.LinkedList;

public class SalesPerson {
    
    private String id;
    private LinkedList<Sales> salesHistory = new LinkedList<>(); // Initiate a linked list for sale history
    private int count = 0; // number of sales made, stored into a variable

    // constructor for new salesperson
    public SalesPerson(String id){
        
        this.id = id; // Assign ID
    }

   
    public SalesPerson(String id, Sales[] s, int c){
        // code missing
    }

    public int getCount(){
        return count; // give back count value
    }

    public String getId(){
        return id; // give back id value
    }

    public void setSalesHistory(Sales s){ // function for adding a sale into sale history

        salesHistory.add(s); // add to the linked list called salesHistory

        count = count +1; // increment count value

    }

    public Sales getSalesHistory(int i){
        return salesHistory.get(i); // gives value of sale history
    }


    public double calcTotalSales(){// to calculate total sales

        
        double sum = 0.00; // create a variable called sum

        for (Sales sale : salesHistory){ // for loop to put in the value of sale multiplied by quantity of sales into the recently created variable "sum"
            sum += sale.getValue() * sale.getQuantity();
        }

        return sum; //give back value of sum, after the for loop
    }



    public Sales largestSale() {
        if (count == 0) {
            return null; // If there are no sales, return null
        }

        Sales highest = getSalesHistory(0); // Start with the first sale as the highest

        for (int i = 1; i < count; i++) { // for loop to iterate over all the sales value index
            Sales current = getSalesHistory(i); // Get the current sale
            double currentValue = current.getValue() * current.getQuantity(); // Calculate total value of current sale
            double highestValue = highest.getValue() * highest.getQuantity(); // Calculate total value of highest sale so far

            if (currentValue > highestValue) {
                highest = current; // If the current sale has a higher total value, update the highest sale
            }
        }

        return highest; // Return the sale with the highest total value
    }
}
