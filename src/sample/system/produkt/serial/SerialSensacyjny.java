package sample.system.produkt.serial;

import sample.system.produkt.Sensacyjny;

public class SerialSensacyjny extends Serial implements Sensacyjny {

    public SerialSensacyjny(String name, String photo, String description, String productionDate, String productionCountry, String actorsList, double rate, int timeDuring, int price) {
        super(name, photo, description, productionDate, productionCountry, actorsList, rate, timeDuring, price);
    }
}
