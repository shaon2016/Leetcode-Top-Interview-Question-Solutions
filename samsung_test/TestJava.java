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
       String s1="abc";
       String s2 = "abc";

       String s3 = new String("abc");

       System.out.println(s1==s3);
    }
}
