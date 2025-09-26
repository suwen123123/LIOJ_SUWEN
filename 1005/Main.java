import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> matrixInt1 = new ArrayList<>();
        ArrayList<Integer> matrixInt2 = new ArrayList<>();
        ArrayList<Integer> matrixInt3 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixFactor1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> matrixFactor2 = new ArrayList<>();

        // read int
        int loopEnd = scanner.nextInt();

        while ( loopEnd > 0 ) {
            matrixInt1.add( loopEnd );

            loopEnd = scanner.nextInt();
        }
        int lineCount =  matrixInt1.size();



        for (int i = 0 ; i < lineCount ; i++) {

            // get factor
            matrixFactor1.add(new ArrayList<>());
            for (int j = 1; j <= matrixInt1.get(i) ; j ++) {
                if (matrixInt1.get(i) % j == 0) {
                    matrixFactor1.get(i).add(j);
                }
            }

            // get other int
            int sumFactor1 = 0;
            for (int j = 0; j < matrixFactor1.get(i).size() ; j ++) {
                sumFactor1 = sumFactor1 + matrixFactor1.get(i).get(j);
            }
            sumFactor1 = sumFactor1 - matrixInt1.get(i);

            matrixInt2.add(sumFactor1);

            // get factor2
            matrixFactor2.add(new ArrayList<>());
            for (int j = 1; j <= matrixInt2.get(i) ; j ++) {
                if (matrixInt2.get(i) % j == 0) {
                    matrixFactor2.get(i).add(j);
                }
            }

            // get other int2
            int sumFactor2 = 0;
            for (int j = 0; j < matrixFactor2.get(i).size() ; j ++)  {
                sumFactor2 = sumFactor2 + matrixFactor2.get(i).get(j);
            }
            sumFactor2 = sumFactor2 - matrixInt2.get(i);

            matrixInt3.add(sumFactor2);

        }


        for (int i = 0 ; i < lineCount ; i++) {

            if( matrixInt1.get(i).equals( matrixInt3.get(i) ) ) {
                System.out.println( matrixInt2.get(i) );
            }
            else {
                System.out.println( "QQ" );
            }
        }

    }
}