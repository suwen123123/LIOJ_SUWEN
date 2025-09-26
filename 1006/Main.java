import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );
        ArrayList<Integer> hold = new ArrayList<>();
        ArrayList<ArrayList<Integer>> site = new ArrayList<>();

        int siteCount = Integer.parseInt(scanner.nextLine());
        int intCount = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i < intCount; i++) {
            hold.add( Integer.parseInt(scanner.nextLine()) );
        }

        // Seat combination 1
        int siteHalf = siteCount / 2 ;
        int startSite = 1 ;
        for(int i = 0 ; i < siteHalf ; i++) {
            site.add(new ArrayList<>());
            site.get(i).add(startSite);
            site.get(i).add(startSite + 1);

            startSite = startSite + 2;
        }

        // Seat combination 2
        startSite = 1 ;

        while ( startSite <  (siteCount-1) ) {
            int siteSize = site.size();

            site.add(new ArrayList<>());
            site.get( siteSize ).add(startSite);
            site.get( siteSize ).add(startSite + 2);

            site.add(new ArrayList<>());
            site.get( siteSize + 1 ).add(startSite + 1);
            site.get( siteSize + 1 ).add(startSite + 3);

            startSite = startSite + 2;
        }


        // Placeholder
        int holdSite = site.size();

        for(int i = 0 ; i < site.size() ; i++) {
            boolean booleanHold = false;
            int j = 0;

            while ( booleanHold == false && j < hold.size() ) {
                booleanHold = site.get(i).contains( hold.get(j) );
                j++;
                if ( booleanHold == true ) holdSite = holdSite - 1;

            }

        }

        System.out.print( holdSite );

    }
}