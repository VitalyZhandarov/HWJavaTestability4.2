public class BmiService {

    public int calculate(double heightMeters, int weightKg) {
        double index = weightKg / (heightMeters * heightMeters);
        return (int) index;
    }
}
