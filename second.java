import java.util.Scanner;

public class second {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count0 = 0, count1 = 0, count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                count0++;
            if (arr[i] == 1)
                count1++;
            if (arr[i] == 2)
                count2++;
        }

        int index = 0;
        for (int i = 0; i < count0; i++)
            arr[index++] = 0;
        for (int i = 0; i < count1; i++)
            arr[index++] = 1;
        for (int i = 0; i < count2; i++)
            arr[index++] = 2;

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

}
