public class BmiService {
    public float calculate(float weight, float height) {
        float massIndex = weight / (height * height);
        return massIndex;
    }
}