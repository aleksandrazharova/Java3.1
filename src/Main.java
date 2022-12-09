public class Main {
    public static void main(String[] args) {
        BmiServise servise = new BmiServise();
        float weight = 43;
        float height = 169;
        float bmi = servise.calculate(weight, height);
        System.out.println(bmi);
    }
}