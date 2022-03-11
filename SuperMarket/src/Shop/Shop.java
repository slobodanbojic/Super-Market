package Shop;


import java.util.ArrayList;

public class Shop {
    protected String shopName;
    protected String street;
ArrayList<Person> arrayListOfStaff = new ArrayList<>();
ArrayList<StandingProduct> arrayofProductInShop = new ArrayList<>();
ArrayList<Bill> arrayOfPurchases =new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public ArrayList<Person> getArrayListOfStaff() {
        return arrayListOfStaff;
    }

    public void setArrayListOfStaff(ArrayList<Person> arrayListOfStaff) {
        this.arrayListOfStaff = arrayListOfStaff;
    }

    public ArrayList<StandingProduct> getArrayofProductInShop() {
        return arrayofProductInShop;
    }

    public void setArrayofProductInShop(ArrayList<StandingProduct> arrayofProductInShop) {
        this.arrayofProductInShop = arrayofProductInShop;
    }

    public ArrayList<Bill> getArrayOfPurchases() {
        return arrayOfPurchases;
    }

    public void setArrayOfPurchases(ArrayList<Bill> arrayOfPurchases) {
        this.arrayOfPurchases = arrayOfPurchases;
    }

    public Shop(String shopName, String street) {
        this.shopName = shopName;
        this.street = street;
       //we make arrays initially emty
        arrayListOfStaff = new ArrayList<Person>();
        arrayofProductInShop = new ArrayList<StandingProduct>();
        arrayOfPurchases = new ArrayList<Bill>();
    }
    public void addStaff (Person p){
        arrayListOfStaff.add(p);
    }
    public void removeStaff (Person p){
        arrayListOfStaff.remove(p);
    }

    public void addProductOnStandingInShop (StandingProduct product){
       if (arrayofProductInShop.contains(product)){                         //Are there productInShop ?
           for(StandingProduct i : arrayofProductInShop){                   // if exist then we must find him
               if(product.equals(i)){                                       //we compare him to product who customer send (StandingProduct product)
                   int newAmount = i.getStandingAmount() + product.getStandingAmount();//then new amount will be  ,amount on standing + amount of user send to program
                   i.setStandingAmount(newAmount);                                     // set her on that value
               }
           }
       }
       else {
           arrayofProductInShop.add(product);                                         //if does not exist we add her to array
       }
    }

}
