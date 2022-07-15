package javaclass;

public class j1_finalProjectA2_RetailItem {

    RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
    RetailItem item2 = new RetailItem("Designer Jeans", 40,34.95);
    RetailItem item3 = new RetailItem("Shirt",20,24.95);

}
//---------------------------------------------------------------------------------
//Class for retail Item
class RetailItem{
    private String description;
    private static int unitsOnHand;
    private double price;
    //---------------------------------------------------------------------------------
    //no-arg constructor
    RetailItem(){
        description = " ";
        unitsOnHand = 0;
        price = 0;
    }
    //default constructor
    RetailItem( String description, int unitsOnHand, double price){
        description = description;
        unitsOnHand = unitsOnHand;
        price = price;
    }
    //---------------------------------------------------------------------------------
    //subtract amount
    static void SubtractAmount(int quantity)
    {
               unitsOnHand = unitsOnHand-quantity;
    }
//Mutator Methods for setting
    public void setDescription(String d) {
        description = d;
    }
    public void setUnitsOnHand(int u) {
        unitsOnHand = u;
    }
    public void setPrice(double p){
        price = p;
    }
    //---------------------------------------------------------------------------------
//Accessor methods for getting
    public String getDescription() {

        return description;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public double getPrice() {
        return price;
    }

}