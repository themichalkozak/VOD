package sample.system.produkt.serial;

import sample.system.produkt.Produkt;
import sample.system.produkt.Sensacyjny;

import java.util.ArrayList;

public abstract class Serial extends Produkt implements Sensacyjny {

    private ArrayList<Episode> episodes;


    public Serial(String name, String photo, String description, String productionDate, String productionCountry, String actorsList, double rate, int timeDuring, int price, ArrayList<Episode> episodes) {
        super(name, photo, description, productionDate, productionCountry, actorsList, rate, timeDuring, price);
        this.episodes = episodes;
    }
}
