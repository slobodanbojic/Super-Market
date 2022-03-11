package Shop;

public class StandingProduct {
    protected Product product;
    protected int standingAmount;

    public StandingProduct(Product product, int standingAmount) {
        this.product = product;
        this.standingAmount = standingAmount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStandingAmount() {
        return standingAmount;
    }

    public void setStandingAmount(int standingAmount) {
        this.standingAmount = standingAmount;
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Name of Product on standing :");
        sb.append(product);
        sb.append("\n");
        sb.append("Amount on standing is :");
        sb.append(standingAmount);
        sb.append("\n");
        return sb.toString();
    }
}
