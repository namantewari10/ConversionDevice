import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int valueInFeet = Integer.parseInt(br.readLine().trim());
        Convertor convertor = new Convertor();
        convertor.convertFeetToInches(valueInFeet);
        convertor.printValueInInches();

        int valueInYard = Integer.parseInt(br.readLine().trim());
        Convertor convertorNew = new Convertor();
        convertorNew.convertYardToFeet(valueInYard);
        convertorNew.printValueInFeet();
    }
}