package laby2;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Klient {
    String imie;
    String nazwisko;
    String adres;
    int wiek;
    Date datazapisu;
    UUID ID;
    ArrayList<UUID> wypozyczone;

    public Klient(String imie, String nazwisko, String adres, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.wiek = wiek;
        this.datazapisu = new Date();
        this.ID = UUID.randomUUID();
        this.wypozyczone = new ArrayList<>();
    }
    public void wyp(UUID x){
        wypozyczone.add(x);
    }
    public void zwrot(UUID x){
        wypozyczone.remove(x);
    }

    public UUID getID() {
        return this.ID;
    }
    public void show(){
        System.out.println(this.wypozyczone);
    }
}
