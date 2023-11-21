package abstractfactory.products.implementations.phones;

import abstractfactory.products.interfaces.Phone;

public class SamsungPhone implements Phone {

    @Override
    public void printLogo() {
        System.out.println("Samsung");
    }
}
