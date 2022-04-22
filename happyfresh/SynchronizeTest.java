package happyfresh;

public class SynchronizeTest {
    public synchronized  void methodA(int i, String msg) {
        System.out.println(i);
        System.out.println(msg);
    }

    public  void methodB(int i, String msg) {
        synchronized (this) {
            System.out.println(i);
            System.out.println(msg);
        }
    }
}
