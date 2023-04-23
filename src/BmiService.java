public class BmiService {

    public int calculate(double a, int b) {
        double index = b / (a * a);
        return (int) index;
    }
}
