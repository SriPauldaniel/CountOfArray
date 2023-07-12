import java.util.Scanner;

public class CountOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findValue(arr,n));
        sc.close();
    }

    static int findValue(int[] arr,int n) {
        int max = Integer.MIN_VALUE,count = 0;
        for(int i=0;i<n;i++) {
            if(max < arr[i]) {
                max = arr[i];
                count = 1;
            } else if(arr[i] == max) {
                count++;
            }
        }
        return n-count;
    }
}