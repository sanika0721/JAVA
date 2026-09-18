import java.util.Scanner;

public class PlantWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter soil moisture level (%): ");
        int moisture = sc.nextInt();

        if (moisture < 30) {
            System.out.println("Soil is dry.");
            System.out.println("💧 Water the plant.");
        } 
        else if (moisture <= 60) {
            System.out.println("Soil moisture is normal.");
            System.out.println("No need to water now.");
        } 
        else {
            System.out.println("Soil is very wet.");
            System.out.println("Do not water the plant.");
        }

        sc.close();
    }
}