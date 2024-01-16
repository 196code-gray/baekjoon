import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = n; i > 0; i--){
            String s = "*".repeat(i);
            for (int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            System.out.println(s);
        }
    }
}