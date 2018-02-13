package GroceryList;

public class GroceryList
{
    private GroceryItemOrder[] groceryList = new GroceryItemOrder[10];

    public void add(GroceryItemOrder grocerItemOrder)
    {
        if (size() == groceryList.length)
        {
            expandArray();
        }

        for (int i = 0; i < this.groceryList.length; i++)
        {
            if (this.groceryList[i] == null)
            {
                this.groceryList[i] = grocerItemOrder;
                break;
            }
        }
    }

    private void expandArray()
    {
        int newSize = this.groceryList.length * 2;

        GroceryItemOrder[] newArray = new GroceryItemOrder[newSize];

        for (int i = 0; i < this.groceryList.length; i++)
        {
            newArray[i] = this.groceryList[i];
        }

        this.groceryList = newArray;
    }

    public int size()
    {
        int size = 0;

        for (int i = 0; i < this.groceryList.length; i++)
        {
            if (this.groceryList[i] == null)
            {
                break;
            }
            size++;
        }
        return size;
    }

    public void clear()
    {
        this.groceryList = new GroceryItemOrder[10];
    }

    public void remove(int index)
    {
        int size = size();

        this.groceryList[index] = null;

        for (int i = 0; i < size - index; i++)
        {
            this.groceryList[index] = this.groceryList[index + 1];
        }

        if (this.groceryList[size() - 1] != null) {
            this.groceryList[size() - 1] = null;
        }
    }



    public GroceryItemOrder get(int index)
    {
        return this.groceryList[index];
    }

    public int indexOf(GroceryItemOrder number)
    {
        for (int i = 0; i < size(); i++)
        {
            if (number == this.groceryList[i])
            {
                return i;
            }
        }
        return -1;
    }

    private int getTotalCost()
    {
        int totalCost = 0;

        for (int i = 0; i < size(); i++)
        {
            totalCost = totalCost + groceryList[i].getCost();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        String str = null;

        for (int i = 0; i < this.size(); i++) {

            if (str == null)
            {
                str = groceryList[i].toString() + "\n";
            }else {
                str = str + groceryList[i].toString() + "\n";
            }

        }
        str = str + "\nTotal cost: " + getTotalCost();
        return str;
    }
}
