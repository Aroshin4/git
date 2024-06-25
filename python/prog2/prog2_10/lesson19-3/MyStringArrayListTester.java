// MyStringArrayListTester.java
public class MyStringArrayListTester {
    public static void main(String[] args) {
        MyStringArrayList list = new MyStringArrayList();
        System.out.println("<listに要素を追加>");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for(int i = 0; i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
        System.out.println("<INSITIAL_CAPACITYを超えてlistに要素を追加>");
        list.add("EX");
        list.add("EX2");
        for(int i = 0; i<=list.size()-1;i++){
            System.out.println(list.get(i));
        }
        System.out.println("<格納されている要素数が正しく取得できていることを確認>");
        System.out.println(list.size());
        System.out.println("<IndexOutOfBoundsExceptionが投げられる場合>");
        try{
            list.get(10);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}