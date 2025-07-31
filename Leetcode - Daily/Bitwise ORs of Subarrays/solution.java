import java.util.HashSet;

public class solution {
    public int subarrayBitwiseORs(int[] arr) {
        HashSet<Integer> uniqueResult = new HashSet<>();
        HashSet<Integer> previous = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> current = new HashSet<>();
            current.add(arr[i]);
            uniqueResult.add(arr[i]);
            for (Integer prev : previous) {
                current.add(prev | arr[i]);
                uniqueResult.add(prev | arr[i]);
            }
            previous = current;
        }
        return uniqueResult.size();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2}; // Example input
        solution solution = new solution();
        int result = solution.subarrayBitwiseORs(arr);
        System.out.println("Number of unique bitwise ORs of subarrays: " + result);
    }
}
