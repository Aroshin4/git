// SearchWord.java
import java.io.*;

class SearchWord {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("使用法: java SearchWord ファイル名 キーワード");
            return;
        }
        String name = args[0];
        String word = args[1];
        searchFile(name, word);
    }
    public static void searchFile(String name, String keyword) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(name));
            String line;
            int lineNum = 0;
            boolean s = false;
            while ((line = reader.readLine()) != null) {
                lineNum++;
                int x = line.indexOf(keyword);
                if (x != -1) {
                    int  count= 8; 
                    int start = Math.max(0, x - count);
                    int end = Math.min(line.length(), x + keyword.length() + count);
                    String text = line.substring(start, end);
                    System.out.println("行 " + lineNum + ": " + text);
                    s = true;
                }
            }
            if (!s) {
                System.out.println("ファイルにキーワードが見つかりませんでした。");
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("エラーが発生しました: " + e.getMessage());
        }
    }
}
