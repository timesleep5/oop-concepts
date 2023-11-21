package abstractfactory.bin;

import abstractfactory.factories.AbstractFactory;
import abstractfactory.factories.AppleFactory;
import abstractfactory.factories.HuaweiFactory;
import abstractfactory.factories.SamsungFactory;
import abstractfactory.products.interfaces.Headphones;
import abstractfactory.products.interfaces.Phone;
import abstractfactory.products.interfaces.Tablet;

public class Client {
    private final AbstractFactory factory;

    Client(String brand) throws Exception {
        switch (brand) {
            case "Apple":
                factory = new AppleFactory();
                break;
            case "Samsung":
                factory = new SamsungFactory();
                break;
            case "Huawei":
                factory = new HuaweiFactory();
                break;
            default:
                throw new Exception("unknown product brand");
        }
    }

    public static void main(String[] args) throws Exception {
        String brand = "Apple";
        Client client1 = new Client(brand);

        Phone phone1 = client1.factory.createPhone();
        Tablet tablet1 = client1.factory.createTablet();
        Headphones headphones1 = client1.factory.createHeadphones();

        System.out.println(brand + " factory:");
        phone1.printLogo();
        tablet1.printDiagonal();
        headphones1.printType();


        brand = "Samsung";
        Client client2 = new Client(brand);

        Phone phone2 = client2.factory.createPhone();
        Tablet tablet2 = client2.factory.createTablet();
        Headphones headphones2 = client2.factory.createHeadphones();

        System.out.println("\n" + brand + " factory:");
        phone2.printLogo();
        tablet2.printDiagonal();
        headphones2.printType();
    }
}
