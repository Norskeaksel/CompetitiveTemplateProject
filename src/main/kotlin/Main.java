import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int solve(int n) {
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = reader.readLine();
            if (input == null) break;

            int n = Integer.parseInt(input);
            int ans = solve(n);
            System.out.println(ans);
        }
    }
}
