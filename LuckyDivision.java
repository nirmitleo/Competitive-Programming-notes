import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author zodiacLeo
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();


            PriorityQueue<Integer> queue = new PriorityQueue<>();
            queue.add(4);
            queue.add(7);
            while (true)
            {
                int num = queue.poll();
                if (num > 1000)
                {
                    break;
                }
                luckyNumbers.add(num);

                queue.add(num * 10 + 4);
                queue.add(num * 10 + 7);
            }

            int n = in.nextInt();
            for (int i = 0; i < luckyNumbers.size(); i++)
            {
                if (n % luckyNumbers.get(i) == 0)
                {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }

    }
}
