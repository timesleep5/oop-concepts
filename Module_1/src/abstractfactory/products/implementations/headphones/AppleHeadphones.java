package abstractfactory.products.implementations.headphones;

import abstractfactory.products.interfaces.Headphones;

public class AppleHeadphones implements Headphones {
    @Override
    public void printType() {
        System.out.println("in ear");
    }
}
