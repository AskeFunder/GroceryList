package GroceryList;

public class GroceryItemOrder
{
    private String name;
    private int quantity;
    private int pricePerUnit;

    public GroceryItemOrder(String name, int quantity, int pricePerUnit){
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public int getCost()
    {
        int cost = this.pricePerUnit * this.quantity;

        return cost;
    }

    @Override
    public String toString() {
        String str;
        str = this.name;
        for (int i = 0; i < 10 - this.name.length(); i++)
        {
            str = str + " ";
        }

        str = str + "|";

        for (int i = 0; i < 4 - Integer.toString(this.quantity).length(); i++) {
            str = str + " ";
        }

        str = str + quantity;
        str = str + " x ";

        if (Integer.toString(this.pricePerUnit).length() == 1)
        {
            str = str + " ";
        }

        str = str + this.pricePerUnit;

        str = str + "  ";

        str = str + "|";
        for (int i = 0; i < 4 - Integer.toString(this.getCost()).length(); i++)
        {
            str = str + " ";
        }

        str = str + this.getCost();




        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
}
