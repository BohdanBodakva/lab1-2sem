package ua.lviv.iot;

public class Main {

    public static void main(String[] args) {
        ua.lviv.iot.Helicopter helly1 = new ua.lviv.iot.Helicopter(1000, "KT-112", 2500,
                9.2f, "guns", 4);

        ua.lviv.iot.Helicopter helly2 = new ua.lviv.iot.Helicopter(1500, "Skyline SL-222", 3000,
                7.1f, "rockets", 3);

        ua.lviv.iot.Helicopter helly3 = new ua.lviv.iot.Helicopter(1200, "Mi-8", 4500);


        ua.lviv.iot.Helicopter.ownerCountry = "Ukraine";
        System.out.println(ua.lviv.iot.Helicopter.ownerCountry);


        System.out.println(helly1);
        System.out.println(helly2);
        System.out.println(helly3);




    }
}