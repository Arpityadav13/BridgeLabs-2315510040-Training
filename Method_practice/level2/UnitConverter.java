package Level_2_Java_Methods_Practice_Problems;

public class UnitConverter {
    public static double convertKmToMiles(double km) { return km * 0.621371; }
    public static double convertMilesToKm(double miles) { return miles * 1.60934; }
    public static double convertMetersToFeet(double meters) { return meters * 3.28084; }
    public static double convertFeetToMeters(double feet) { return feet * 0.3048; }

    public static double convertYardsToFeet(double yards) { return yards * 3; }
    public static double convertFeetToYards(double feet) { return feet * 0.333333; }
    public static double convertMetersToInches(double meters) { return meters * 39.3701; }
    public static double convertInchesToMeters(double inches) { return inches * 0.0254; }
    public static double convertInchesToCm(double inches) { return inches * 2.54; }

    public static double convertFarhenheitToCelsius(double f) { return (f - 32) * 5 / 9; }
    public static double convertCelsiusToFarhenheit(double c) { return (c * 9 / 5) + 32; }
    public static double convertPoundsToKg(double pounds) { return pounds * 0.453592; }
    public static double convertKgToPounds(double kg) { return kg * 2.20462; }
    public static double convertGallonsToLiters(double g) { return g * 3.78541; }
    public static double convertLitersToGallons(double l) { return l * 0.264172; }
}

