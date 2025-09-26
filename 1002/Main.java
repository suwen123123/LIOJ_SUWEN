import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        ArrayList<String> inStr = new ArrayList<>();

        String getStr = "";

        int x = 0;

        do {
            getStr = in.nextLine();
            if( !Objects.equals(getStr, "0 0") ) {
                inStr.add( getStr );
                x++;
            }
        }
        while ( !Objects.equals(getStr, "0 0") );


        for (int i = 0; i < inStr.size() ; i++) {

            String[] Array1;
            Array1 = inStr.get(i).split(" ");
            int a = Integer.parseInt( Array1[0] );
            int b = Integer.parseInt( Array1[1] );


            if ( a > b ) {
                System.out.println( a );
            }
            else {
                System.out.println( b );
            }
        }

    }

}