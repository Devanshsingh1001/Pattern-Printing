// 11111
// 2222
// 333
// 44
// 5
import java.util.*;
public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
