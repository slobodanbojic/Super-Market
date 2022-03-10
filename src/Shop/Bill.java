package Shop;

import Journey2020.Person;

import java.util.ArrayList;

public class Bill {
    protected ArrayList <Product> arrayPurchasedItems;
    protected String date;
    protected Person customer;
    protected Person cashier;
    protected double amount;

    public Bill( String date, Person customer, Person cashier, double amount) {

        this.date = date;
        this.customer = customer;
        this.cashier = cashier;
        this.amount = amount;
       this.arrayPurchasedItems = new ArrayList <Product>();
}
    public Bill(String date, Person customer, Person cashier, double amount,ArrayList<Product> arrayPurchasedItems) {
        this.date = date;
        this.customer = customer;
        this.cashier = cashier;
        this.amount =0;
        for (Product p : arrayPurchasedItems){
            this.amount = this.amount + p.getPrice();
        }
        this.arrayPurchasedItems=arrayPurchasedItems;
    }

    public ArrayList<Product> getArrayPurchasedItems() {
        return arrayPurchasedItems;
    }

    public void setArrayPurchasedItems(ArrayList<Product> arrayPurchasedItems) {
        this.arrayPurchasedItems = arrayPurchasedItems;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Person getCashier() {
        return cashier;
    }

    public void setCashier(Person cashier) {
        this.cashier = cashier;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public void addProducts (Product p){
        arrayPurchasedItems.add(p);
        amount += p.getPrice();
    }
    public void removeProducts (Product p){

        if (arrayPurchasedItems.contains(p)){
            amount = amount - p.getPrice();
        }
        else {
            System.out.println("Product does not exist in array");
        }
    }
    public String toString (){
        StringBuilder sb = new StringBuilder();
        sb.append("Customer :");
        sb.append(customer.getName()+" "+customer.getLastname());
        sb.append("\n");

        sb.append("Cashier :");
        sb.append(cashier.getName()+" "+cashier.getLastname());
        sb.append("\n");

        sb.append("Date :");
        sb.append(date);
        sb.append("\n");

        sb.append("Amount :");
        sb.append(amount);
        sb.append("\n");

        sb.append("Purchased products are :       \n");
        for (Product p : arrayPurchasedItems){
            sb.append(p.getName() + p.getPrice());
            sb.append("\n");
        }
        return sb.toString();
    }
}
