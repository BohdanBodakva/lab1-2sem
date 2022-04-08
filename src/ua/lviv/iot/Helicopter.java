package ua.lviv.iot;

public record Helicopter (float maxWeight, String name,
                          float maxHeight, float maxDistance,
                          String weaponType, int personnel) {

    static String ownerCountry;

    static String getOwnerCountry(){
        return ownerCountry;
    }

    public Helicopter{
        if(maxWeight<500) maxWeight=500;
        if(maxHeight<200) maxHeight=200;
        if(maxDistance<5) maxDistance=5;
        if(personnel<2) personnel=2;
    }

    public Helicopter(float maxWeight, String name, float maxHeight){
        this(maxWeight, name, maxHeight, 0.0f, "without weapon", 0);
    }

    @Override
    public String toString(){
        return String.format("Helicopter: %s" +
                        "\t\tMAX Weight: %f" +
                        "\t\tMAX Height: %f" +
                        "\t\tMAX Distance: %f" +
                        "\t\tWeapon type: %s" +
                        "\t\tPersonnel: %d",
                name, maxWeight, maxHeight,
                maxDistance, weaponType, personnel);
    }
}