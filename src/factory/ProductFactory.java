package factory;

import products.Car;
import products.House;

public interface ProductFactory {
    Car getProductA();
    House getProductB();
}
