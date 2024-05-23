import java.io.FileNotFoundException;

// 課題1: テキストファイルの文字列変換  TextToUpperTester.java
class TextToUpperTester {
    public static void main(String[] args) {
        try{    
             TextToUpper.readAndConvert("foobar.txt");
           }catch(FileNotFoundException e){
             System.out.println("エラー : " + e );
    }
    }
    }