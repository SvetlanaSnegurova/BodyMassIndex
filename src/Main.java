public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 100;
        double height = 1.74;
        double massIndex = service.calculate((float) weight, (float) height);
        System.out.println("Ваш индекс массы тела составляет = " + massIndex);
    }
}