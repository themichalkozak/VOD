package sample.system.produkt;

public abstract class Produkt {

    private String name;
    private String photo;
    private String description;
    private String productionDate;
    private String productionCountry;
    private String actorsList;
    private double rate;
    private int timeDuring;
    private int price;

    public Produkt(String name, String photo, String description, String productionDate, String productionCountry, String actorsList, double rate, int timeDuring, int price) {
        this.name = name;
        this.photo = photo;
        this.description = description;
        this.productionDate = productionDate;
        this.productionCountry = productionCountry;
        this.actorsList = actorsList;
        this.rate = rate;
        this.timeDuring = timeDuring;
        this.price = price;
    }

}
