import java.util.Scanner;

/* Runtime arror: reduce for loop, Do not use a separate class, just did in main class */
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        int[] w = new int[num];
        int[] h = new int[num];
        int[] result = new int[num];
        int i,j;

        for (i=0; i<num; i++){
            w[i] = s.nextInt();
            h[i] = s.nextInt();
        }
        
        for (i=0; i<num; i++){
            for (j=0; j<num; j++){
                if(w[j] > w[i] && h[j]> h[i]) {
                    result[i] ++;
                }
            }
            System.out.printf("%d ", result[i]+1);
        }

        s.close();
    }
}
        
