package abstractfactory.products.implementations.headphones;

import abstractfactory.products.interfaces.Headphones;

public class SamsungHeadphones implements Headphones {
    @Override
    public void printType() {
        System.out.println("over ear");
    }
}
