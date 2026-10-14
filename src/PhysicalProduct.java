
/**
 * Write a description of class PhysicalProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)

1. Add the following attributes to the PhysicalProduct:
1.1 private double salesTax
1.2. private String dimension
1.3. private double weight

2. Add getter and setters as such:

Super()
private String name;
private double price;
private String SKU;
*/
public class PhysicalProduct extends Product
{
    private double weight;
    private String dimension;
    private double salesTax;
    
    public PhysicalProduct(){
        super();
        setDimension("0x0x0");
    }
    
    // overloaded constructor
    public PhysicalProduct(String name, double price, String SKU,
                           double weight, String dimension, double salesTax){
        super(name, price, SKU);
        setWeight(weight);
        setDimension(dimension);
        setSalesTax(salesTax);
    }
    
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public String getDimension(){
        return dimension;
    }
    public void setDimension(String dimension){
        this.dimension = dimension;
    }
    
    public double getSalesTax(){
        return this.salesTax;
    }
    public void setSalesTax(double salesTax){
        this.salesTax = salesTax;
    }
    /**
     * Calculates sales tax as the tax rate times the product price.
     * Uses {@link Product#getPrice()} inherited from the parent class.
     */
    public double calculateSalesTax(){
        return this.salesTax * getPrice();
    }

}