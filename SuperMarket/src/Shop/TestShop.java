package Shop;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class TestShop {
    public static void main(String[] args) {
        Person p1 = new Person("Slobodan","Bojic",33,194);
        Person p2 = new Person("ana","Mijailovic",29,170);
        Product pr1 = new Product("mleko",80,1000);
        Product pr2 = new Product("cokolada",100,100);
        StandingProduct sp1 = new StandingProduct(pr1,40);
        StandingProduct sp2 = new StandingProduct(pr2,4);
        Shop shop1 = new Shop("Step Shop","7 oktobra 195");
        shop1.addStaff(p1);
        shop1.addStaff(p2);
        shop1.addProductOnStandingInShop(sp1);
        shop1.addProductOnStandingInShop(sp2);
        ArrayList<Product>shoplist = new ArrayList<>();
        shoplist.add(pr1);
        shoplist.add(pr2);
        System.out.println(shop1);

    }
}
