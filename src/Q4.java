public class Q4 {
    Q4() {
        this("Hello"); // this referansını kullanarak diğer bir constructor'ı çağırıyoruz
        System.out.println("Default constructor");
    }

    Q4(String message) {
        System.out.println("Parameterized constructor with message: " + message);
    }

    public static void main(String[] args) {
        Q4 obj = new Q4();
    }
}
