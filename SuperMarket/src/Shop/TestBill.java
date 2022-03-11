package Shop;

import java.util.ArrayList;

public class TestBill {
    public static void main(String[] args) {


        Product p1 = new Product("mleko", 100, 1000);
        Product p2 = new Product("secer", 89, 1000);
        Product p3 = new Product("cokolada", 100, 800);
        Person o1 = new Person("Strahinja", "Bojic", 2018, 110);
        Person o2 = new Person("Ana", "Mijailovic", 1992, 170);

        Bill b1 = new Bill("21.22.2022", o1, o2, 100.0);
        b1.addProducts(p1);
        b1.addProducts(p2);
        b1.removeProducts(p1);
        ArrayList <Product>productArrayList = new ArrayList<>();
        productArrayList.add(p1);
        productArrayList.add(p2);

        Bill b2 = new Bill("1.1.2010",o1,o2,100,productArrayList);

    }
}
