public class BmiServise {
    public float calculate(float weight, float height) {
        float result;
        float height2 = height / 100;
        if (height2 > 0) {
            result = weight / (height2 * height2);
        } else {
            result = 0;
        }
        return result;
    }
}
