// FileCopy.java
import java.io.*;
public class FileCopy{
    public static void main(String[] args)  {
        DataInputStream in=null;
        DataOutputStream out=null;
        if (args.length != 2) {
    System.out.println("使用法: java コピー元ファイル コピー先ファイル");
    System.out.println("例: java FileCopy srcfile dstfile");
    System.exit(0);
        }
    String srcName = args[0];
    String dstName = args[1];
    File dst = new File(dstName);
        if(dst.exists()){
            System.out.println("コピー先ファイルが存在します");
            System.exit(0);
        }
        try{
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(srcName)));
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dstName)));
            while(true){
            byte i =in.readByte();
            out.writeByte(i);
            }
            }catch (EOFException e) {
                System.out.println(e);
            }catch(IOException e){
                System.out.println(e);
            }
            try {
                if(in!=null&&out!=null){
                    in.close();
                    out.close();
                }
            }catch(IOException e){
                System.out.print(e);
            }
    }
}