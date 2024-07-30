public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test_10mb.jpg");

        // Image will be loaded from disk
        image1.display(); 
        System.out.println("");

        // Image will not be loaded from disk again, cached version is used
        image1.display(); 
    }
}
