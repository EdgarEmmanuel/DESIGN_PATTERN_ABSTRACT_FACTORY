import factory.ProductFactoryBalance;
import factory.ProductFactoryBills;

public class Main {
    public static void main(String[] args){
        System.out.println("PRICES OF OUR PRODUCTS DURING BALANCE PERIOD ");
        System.out.println("CAR => $"+new ProductFactoryBalance().getProductA().getPrix());
        System.out.println("HOUSE => $"+new ProductFactoryBalance().getProductB().getPrix());

        System.out.println("===========================================================");

        System.out.println("PRICES OF OUR PRODUCTS WHEN THE CUSTOMER HAS BILLINGS");
        System.out.println("CAR => $"+new ProductFactoryBills().getProductA().getPrix());
        System.out.println("HOUSE => $"+new ProductFactoryBills().getProductB().getPrix());
    }
}
