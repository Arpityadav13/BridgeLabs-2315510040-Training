package Level_1_Practice_Programs;

public class VolumeEarth {

    public static void main(String[] args) {
        
        float radiusKm = 6378.0f;
        float kmToMiles = 0.621371f;
        float pi = 3.1415927f;

        float volumeKm3 = (4.0f / 3.0f) * pi * (float)Math.pow(radiusKm, 3);
        float radiusMiles = radiusKm * kmToMiles;
        float volumeMiles3 = (4.0f / 3.0f) * pi * (float)Math.pow(radiusMiles, 3);

        System.out.println(
            "The volume of Earth in cubic kilometers is " + volumeKm3 +
            " and in cubic miles is " + volumeMiles3
        );
    }
}
