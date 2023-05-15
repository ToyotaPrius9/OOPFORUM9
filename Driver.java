
public class Driver {
    public static void main(String[] args){

        SalesPerson[] salesPeople = new SalesPerson[6];

        salesPeople[0] = new SalesPerson("100");

        salesPeople[1] = new SalesPerson("101");

        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));

        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));

        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));

        System.out.println(salesPeople[2].getId());

        System.out.println(salesPeople[0].getCount());

        System.out.println(salesPeople[1].getSalesHistory(0).getValue());

        System.out.println(salesPeople[0].calcTotalSales());

    }

    public String highest(SalesPerson[] salesPeople) {// to get the most valued salesperson
        if (salesPeople.length == 0) {
            return null; // If the array is empty, return null
        }

        SalesPerson highest = salesPeople[0]; // store [0] index to variable called highest

        for (int i = 1; i < salesPeople.length; i++) { // for loop, increments i 
            SalesPerson current = salesPeople[i]; // new variable to store salesPeople with the index of i's value

            if (current.calcTotalSales() > highest.calcTotalSales()) { // if current is bigger than highest: 
                highest = current; // make highest = current
            }
        }

        return highest.getId(); // give back value of highest
    }

    public void addSales(Sales s, String id, SalesPerson[] salesPeople) { //add sales to the salesperson's ID
        
    	for (int i = 0; i < salesPeople.length; i++) { // for loop
            
        	SalesPerson current = salesPeople[i]; // again the same technique, store in current with salesPeople's i index
            
        	if (current.getId().equals(id)) { // if id matches:
                current.setSalesHistory(s); // set it to their salesHistory
                break; //stop
            }
        }
    }
}
