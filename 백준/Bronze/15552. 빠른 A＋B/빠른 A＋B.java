import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t,a,b;
        t = Integer.parseInt(br.readLine());
        while(t-->0){
            String [] input = br.readLine().split(" ");
            a = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            bw.write((a+b)+"\n");
        }
        bw.flush();
        br.close();
    }
}
