package factory;

import products.Car;
import products.CarBalance;
import products.House;
import products.HouseBalance;

public class ProductFactoryBalance implements ProductFactory{
    @Override
    public Car getProductA() {
        return new CarBalance();
    }

    @Override
    public House getProductB() {
        return new HouseBalance();
    }

}
