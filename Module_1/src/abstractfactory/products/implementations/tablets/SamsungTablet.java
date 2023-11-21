package abstractfactory.products.implementations.tablets;

import abstractfactory.products.interfaces.Tablet;

public class SamsungTablet implements Tablet {

    @Override
    public void printDiagonal() {
        System.out.println("10 inch");
    }
}
