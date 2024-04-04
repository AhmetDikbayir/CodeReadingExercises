public class Q3 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static int test(){
        /*static*/ int var =100; // static should not be used here
        return ++var;
    }
}
