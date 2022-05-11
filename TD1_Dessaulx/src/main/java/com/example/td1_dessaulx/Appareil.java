package com.example.td1_dessaulx;

public class Appareil {
    /**
     * l'intensite de l'appareil
     * on suppose que l'appareil est eteint si l'intensité vaut 0
     */
    int intensite = 0;

    /**
     * permet d'allumer ou d'augmenter l'intensite de l'appareil
     */
    public void allumer () {
        this.intensite += 10;
        if (this.intensite > 100)
            this.intensite = 100;
    }

    /**
     * permet d'eteindre l'appareil (intensite mise a 0)
     */
    public void eteindre () {
        this.intensite = 0;
    }

    public int getIntensite(){
        return (this.intensite);
    }
}
