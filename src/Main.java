public class Main {
    public static void main(String[] args) {
        double[] numbers = {-5.3, 5.2, 3.1, -5.2, 7.1, 6.2, 8.5, 9.3, 0.9, -9.2, 8.2, 0.1, 1.2, 4.3, 0.3};
        double first = 0;
        int second = 0;
        for (double overage : numbers) {
            if (overage > 0) {
                second++;
                first += overage;
                System.out.println(first / second);
            }
    }
}
}