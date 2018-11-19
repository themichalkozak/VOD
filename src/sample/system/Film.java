package sample.system;

import sample.system.produkt.Produkt;

public abstract  class Film extends Produkt {

   private String zwiastunUrl;
   private String promotionDuring;

    public Film(String name, String photo, String description, String productionDate, String productionCountry, String actorsList, double rate, int timeDuring, int price, String zwiastunUrl, String promotionDuring) {
        super(name, photo, description, productionDate, productionCountry, actorsList, rate, timeDuring, price);
        this.zwiastunUrl = zwiastunUrl;
        this.promotionDuring = promotionDuring;
    }
}
