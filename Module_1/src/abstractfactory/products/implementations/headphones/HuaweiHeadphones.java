package abstractfactory.products.implementations.headphones;

import abstractfactory.products.interfaces.Headphones;

public class HuaweiHeadphones implements Headphones {
    @Override
    public void printType() {
        System.out.println("on ear");
    }
}
