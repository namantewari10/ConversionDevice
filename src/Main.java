import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value in feet: ");
        int valueInFeet = Integer.parseInt(br.readLine().trim());
        System.out.println("valueInInches:" + valueInFeet*12);
    }
}