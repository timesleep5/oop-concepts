package abstractfactory.factories;

import abstractfactory.products.implementations.headphones.AppleHeadphones;
import abstractfactory.products.implementations.phones.ApplePhone;
import abstractfactory.products.implementations.tablets.AppleTablet;
import abstractfactory.products.interfaces.Headphones;
import abstractfactory.products.interfaces.Phone;
import abstractfactory.products.interfaces.Tablet;

public class HuaweiFactory implements AbstractFactory {
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Tablet createTablet() {
        return new AppleTablet();
    }

    @Override
    public Headphones createHeadphones() {
        return new AppleHeadphones();
    }
}
