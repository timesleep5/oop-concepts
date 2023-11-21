package abstractfactory.products.implementations.tablets;

import abstractfactory.products.interfaces.Tablet;

public class AppleTablet implements Tablet {

    @Override
    public void printDiagonal() {
        System.out.println("9 inch");
    }
}
