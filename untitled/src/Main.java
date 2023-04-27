import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        int[] ary = new int[N];

        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.nextInt();
        }

        for (int i = 0; i < M*2; i++) {
            queue.add(sc.nextInt());
        }

        while (queue.size() > 0){
            int start = queue.poll();
            int last = queue.poll();
            int answer = 0;

            for (int i=start-1; i<=last-1; i++){
                answer += ary[i];
            }
            System.out.println(answer);
        }
    }
}