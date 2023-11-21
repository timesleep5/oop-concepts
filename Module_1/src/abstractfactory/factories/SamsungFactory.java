package abstractfactory.factories;

import abstractfactory.products.implementations.headphones.SamsungHeadphones;
import abstractfactory.products.implementations.phones.SamsungPhone;
import abstractfactory.products.implementations.tablets.SamsungTablet;
import abstractfactory.products.interfaces.Headphones;
import abstractfactory.products.interfaces.Phone;
import abstractfactory.products.interfaces.Tablet;

public class SamsungFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new SamsungPhone();
    }

    @Override
    public Tablet createTablet() {
        return new SamsungTablet();
    }

    @Override
    public Headphones createHeadphones() {
        return new SamsungHeadphones();
    }
}
