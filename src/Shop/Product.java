package Shop;

public class Product {
    protected String name;
    protected double price;
    protected String description;
    protected int weightOfProduct;

    public Product(String name, double price, String description, int weightOfProduct) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.weightOfProduct = weightOfProduct;
    }

    public Product(String name, double price, int weightOfProduct) {
        this.name = name;
        this.price = price;
        this.weightOfProduct = weightOfProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getWeightOfProduct() {
        return weightOfProduct;
    }

    public void setWeightOfProduct(int weightOfProduct) {
        this.weightOfProduct = weightOfProduct;
    }
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Name of product is :");
        sb.append(name);
        sb.append("\n");

        sb.append("The price of the product is :");
        sb.append(price);
        sb.append("\n");

        sb.append("Description of product is :");
        sb.append(description);
        sb.append("\n");

        sb.append("The weight of product in grams is:");
        sb.append(weightOfProduct);
        sb.append("\n");
        return sb.toString();
    }
}
