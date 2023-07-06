import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int n;
                Scanner bob = new Scanner(System.in);
                    System.out.println("Number : ");
                    n = bob.nextInt();
                    for (int k=1;k<=n;k*=4) {
                        for (int altan = 1; altan <= n; altan *= 5) {
                            System.out.println(k + altan);
                        }

                    }


            }
        }