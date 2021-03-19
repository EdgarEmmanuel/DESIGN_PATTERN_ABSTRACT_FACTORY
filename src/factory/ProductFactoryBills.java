package factory;

import products.Car;
import products.CarBills;
import products.House;
import products.HouseBills;

public class ProductFactoryBills implements ProductFactory{
    @Override
    public Car getProductA() {
        return new CarBills();
    }

    @Override
    public House getProductB() {
        return new HouseBills();
    }

}
