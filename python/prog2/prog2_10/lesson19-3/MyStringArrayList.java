// MyStringArrayList.java
public class MyStringArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private String[] ar;
    private int sz;

    public MyStringArrayList() {
        ar = new String[INITIAL_CAPACITY];
        sz = 0;
    }

    public void add(String s) {
        if (ar.length == sz) {
            String[] ar2 = new String[ar.length * 2];
            System.arraycopy(ar, 0, ar2, 0, ar.length);
            ar = ar2;
        }
        ar[sz] = s;
        sz++;
    }

    public String get(int n) {
        if (0 <= n && n < sz) {
            return ar[n];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return sz;
    }
}