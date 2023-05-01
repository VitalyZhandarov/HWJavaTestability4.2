// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.87;
        int weightKg = 98;
        int bmi = service.calculate(heightMeters, weightKg);

        System.out.println(bmi);

    }
}