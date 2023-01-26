public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 82.0;
        double height = 1.84;
        double bmi = service.calculateBMI(weight, height);

        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}