public class Main3 {
    public static void main(String[] args) {
        double[] temperatures = {25.5, 26.0, 24.5, 26.5, 27.0, 25.0, 24.0};
        String[] days = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};

        double sum = 0;
        for(double temperature : temperatures) {
            sum += temperature;
        }

        double avg = sum / temperatures.length;

        for(int i = 0; i < days.length; i++){
            System.out.println(days[i] + " : " + temperatures[i] + "度");
        }
        System.out.println("平均気温 : " + avg + "度");
    }
}
