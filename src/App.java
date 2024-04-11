import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class CalendarProgram {

    public static void main(String[] args) {
        // 年と月の入力
        Scanner scanner = new Scanner(System.in);
        System.out.print("年を入力してください: ");
        int year = scanner.nextInt();
        System.out.print("月を入力してください: ");
        int month = scanner.nextInt();

        // カレンダーの表示
        printCalendar(year, month);

        scanner.close();
    }

    private static void printCalendar(int year, int month) {
        // カレンダーオブジェクトの取得
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // 月は0から始まるため、-1する

        // 日付フォーマットの設定
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月");
        System.out.println(dateFormat.format(calendar.getTime()));

        // 曜日のヘッダーを表示
        System.out.println("日 月 火 水 木 金 土");

        // 1日の曜日まで空白を埋める
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("   ");
        }

        // 月の日数分ループして日付を表示
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int day = 1; day <= lastDay; day++) {
            System.out.printf("%2d ", day);

            // 改行を行う（土曜日まで表示したら改行）
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
                System.out.println();
            }

            // 日付を1日進める
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
