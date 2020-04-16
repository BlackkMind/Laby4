package laby2;

import java.util.Date;

public class Start {
    public static void main(String[] args)throws Exception{
        Wypożyczalnia ZZZ = new Wypożyczalnia();
        Muzyka metal = new Muzyka(new Date(72,12,27), "Testament ", " epper ", 40, "death" , 120);
        Książki jakuba = new Książki(new Date(91,00,22), " Pilipiuk ", " fabryka slow ", 45, " bimbrownikus ", 255);
        Filmy edu = new Filmy(new Date(98,17,26),"Look skywalker", "bbc", 36, "juz nie jestem twoim ojcem", 10000);
        Audiobook idk = new Audiobook(new Date(42,53,20),"matrer wielki","fiskus",90,"korona skad tys",30,2);
        ZZZ.add(jakuba);
        ZZZ.add(metal);
        ZZZ.add(edu);
        ZZZ.add(idk);
        System.out.println("zasoby wypożyczalni:");
        ZZZ.showWypożyczalnia();
        Klient XYZ = new Klient("XYZ", "XYZ", "YXZ", 82);
        ZZZ.addUser(XYZ);
        Klient YXZ = new Klient("YXZ", "YXZ", "ZZZ", 72);
        ZZZ.addUser(YXZ);
        long d1= ZZZ.wyp(XYZ.getID(), metal.getID());
        XYZ.show();
        ZZZ.wyp(XYZ.getID(), metal.getID());
        Thread.sleep(8000);
        long d2= ZZZ.zwrot(XYZ.getID(), metal.getID());
        ZZZ.zaplata( d1,d2);

        System.out.println("dane zbiorów:");

        edu.informacje();
        jakuba.informacje();
        metal.informacje();
        idk.informacje();
    }
}
