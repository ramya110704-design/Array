import java.util.Scanner;
public class AverageDouble{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextDouble();
            sum += arr[i];
        }
        double avg = sum/n;
        System.out.println("Average: "+avg);
    }
}
    

