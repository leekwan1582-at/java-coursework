
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
Attributes:
Name: The name of the product
Price: The price of the product
SKU: The SKU of the product

Add a toString method

Encapsulation
An application usually has business logic.  Those are the rules and processes that apply to various operations done by the application. For example:
The price of a product cannot be less than 0
The name of a product cannot be empty
The SKU of a product be more than three characters

 */
public class Product
{
    private String name;
    private double price;
    private String SKU;

    @Override 
    public String toString()
    {
        // put your code here
        String template = "Name: %s Price: %f SKU: %s";
        return String.format(template, name, price, SKU);
    }
    
    public Product(){
        this.name = "nodefined";
        this.price = 0.00;
        this.SKU = "Null";
    }
    
    public Product(String name, double price, String SKU){
        setName(name);
        setPrice(price);
        setSKU(SKU);
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        if (name.length() > 0 ){
            this.name = name;
        } else {
            throw new IllegalArgumentException("The name cannot be blank");
        }
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        if (price >= 0) {
            this.price = price;
        } else{
            throw new IllegalArgumentException("Price cannot be negative value");
        }
    }
    
    public String getSKU(){
        return this.SKU;
    }
    
    public void setSKU(String SKU){
        if (SKU.length() > 0) {
            this.SKU = SKU;
        } else {
            throw new IllegalArgumentException("The SKU cannot be blank");
        }
    }

}