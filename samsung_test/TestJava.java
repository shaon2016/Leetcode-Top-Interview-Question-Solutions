package samsung_test;

class TestJava {
    static class P {
        public void speak() {
            System.out.println("Parent");
        }
    }

    static class C extends P {
        public void speak() {
            System.out.println("Child");
        }
    }

    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        if(s1 == s2)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
