package abstractfactory.products.implementations.tablets;

import abstractfactory.products.interfaces.Tablet;

public class HuaweiTablet implements Tablet {

    @Override
    public void printDiagonal() {
        System.out.println("8 inch");
    }
}
