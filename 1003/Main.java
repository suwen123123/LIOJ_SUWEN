import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();


        // 讀取輸入文字
        int strCount = scanner.nextInt();
        for (int i = 0; i <= strCount ; i++) {
            str1.append(scanner.nextLine());
        }

        //System.out.println(str1);


        //決定取得字元
        int strIndex = 0;
        int x = scanner.nextInt();

        for (int i = 0; i < x; i++) {
            strIndex = scanner.nextInt();
            str2.append( str1.charAt(strIndex - 1) );
        }

        System.out.println(str2);

        // 呼叫 nextLine() 來清除緩衝區
        // scanner.nextLine();

        scanner.close();
    }
}