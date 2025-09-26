import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<String>> matrixStr = new ArrayList<>();

        int lineCount =  Integer.parseInt(scanner.nextLine());

        for(int i = 0 ; i < lineCount ; i++){
            matrixStr.add(new ArrayList<String>());
            String[] splitStr = scanner.nextLine().split(" ");

            for (int j = 0 ; j < splitStr.length ; j++) {
                matrixStr.get(i).add( splitStr[j] );
            }
        }


        for (int i = 0 ; i < matrixStr.size() ; i++ ) {
            BigInteger a = new BigInteger( matrixStr.get(i).get(0) );
            BigInteger b = new BigInteger( matrixStr.get(i).get(1) );

            if (a.compareTo(b) == 0) {
                System.out.println("DRAW");
            }
            else if (( a.compareTo(b) > 0 ) && (Objects.equals(matrixStr.get(i).get(2), "1"))) {
                System.out.println("A");
            } else if (( a.compareTo(b) > 0 ) && (Objects.equals(matrixStr.get(i).get(2), "-1"))) {
                System.out.println("B");
            } else if (( b.compareTo(a) > 0 ) && (Objects.equals(matrixStr.get(i).get(2), "1"))) {
                System.out.println("B");
            } else if (( b.compareTo(a) > 0 ) && (Objects.equals(matrixStr.get(i).get(2), "-1"))) {
                System.out.println("A");
            }
        }


        scanner.close();

    }
}