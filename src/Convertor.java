public class Convertor {
    int valueInInches;
    int valueInFeet;
    public void convertFeetToInches(int valueInFeet) {
        valueInInches = valueInFeet * ConversionFactors.FEET_TO_INCH;
    }

    public void convertYardToFeet(int valueInYard) {
        valueInFeet = valueInYard * ConversionFactors.YARD_TO_FEET;
    }
    public void printValueInInches(){
        System.out.println(valueInInches);
    }

    public void printValueInFeet(){
        System.out.println(valueInFeet);
    }
}
