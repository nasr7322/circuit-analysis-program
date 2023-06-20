import java.util.Scanner;

public class App {

    public static int[][] input() {

        /////////////// taking input ///////////////////////

        System.out.println("How many nodes do you have?");

        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        int[][] adjmatrix = new int[nodes][nodes];

        System.out.println("1-> wire");
        System.out.println("2-> resistance");
        System.out.println("3-> battery");
        System.out.println("0-> no connection");

        for (int i = 0; i < nodes; i++) {
            for (int j = nodes - 1; j > i; j--) {
                System.out.println("enter what's between node " + i + " and node " + j);
                int obj = sc.nextInt();
                switch (obj) {
                    case 1:
                        adjmatrix[i][j] = 1;
                        adjmatrix[j][i] = obj;
                        continue;
                    case 2:
                        System.out.println("How many ohms");
                        adjmatrix[i][j] = sc.nextInt();
                        adjmatrix[j][i] = obj;
                        continue;
                    case 3:
                        System.out.println("How many volts");
                        adjmatrix[i][j] = sc.nextInt();
                        adjmatrix[j][i] = obj;
                        continue;
                    case 0:
                        continue;
                    default:
                        System.out.println("You entered a different character.");
                        continue;
                }
            }
        }

        System.out.println();

        for (int l = 0; l < nodes; l++) {
            System.out.print("node " + l + "\t");
            for (int m = 0; m < nodes; m++) {
                System.out.print(adjmatrix[l][m] + " ");
            }
            System.out.println();
        }

        return adjmatrix;
    }

    public static void main(String[] args) {
        int[][] cAdjMatrix = input();
        int nodes = cAdjMatrix.length;
        System.out.println(nodes);

        for (int i = 0; i < nodes; i++) {
            for (int j = nodes - 1; j > i; j--) {
            }
        }

    }

}
