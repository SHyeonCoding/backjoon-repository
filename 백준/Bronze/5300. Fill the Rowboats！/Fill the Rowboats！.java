import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i < n; i++) {
            sb.append(i).append(" ");
            if(i % 6 == 0) sb.append("Go!").append(" ");
        }

        sb.append(n).append(" Go!");
        System.out.println(sb);
    }
}