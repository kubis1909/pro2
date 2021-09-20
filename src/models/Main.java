package models;

public class Main{

    private String name;
    private String desception;
    private int price;

    public Main(String name, String desception, int price){
        this.name = name;
        this.desception = desception;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesception() {
        return desception;
    }

    public void setDesception(String desception) {
        this.desception = desception;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
