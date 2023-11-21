package abstractfactory.factories;

import abstractfactory.products.interfaces.Headphones;
import abstractfactory.products.interfaces.Phone;
import abstractfactory.products.interfaces.Tablet;

public interface AbstractFactory {
    Phone createPhone();
    Tablet createTablet();
    Headphones createHeadphones();
}
