package Workshop;
public class Question2 {
    public static void main(String[] args) {
        double[] arr = {10.5, 20.5, 30.5};
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = sum / arr.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}