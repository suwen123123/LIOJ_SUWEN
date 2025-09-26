import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> matrixName = new ArrayList<>();
        ArrayList<Integer> matrixKing = new ArrayList<>();

        int lineCount =  Integer.parseInt(scanner.nextLine());

        for(int i = 0 ; i < lineCount ; i++){
            String[] splitStr = scanner.nextLine().split(" ");

            matrixName.add( splitStr[0] );
            matrixKing.add( Integer.parseInt( splitStr[1] ) );
        }

        int KingMax = Collections.max( matrixKing );

        for(int i = 0 ; i < lineCount ; i++){
            if( matrixKing.get(i) == KingMax ) {
                System.out.println( matrixName.get(i) );
            }

        }
    }
}