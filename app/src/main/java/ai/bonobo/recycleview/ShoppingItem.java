package ai.bonobo.recycleview;

/**
 * Created by cardel6 on 08/09/2018.
 */

public class ShoppingItem {
    private int id;
    private String name;
    private double price;
    // TODO: image variable;
    public ShoppingItem( int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
