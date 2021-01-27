import java.io.FileInputStream;

public class ExceptionPadaMainMethod {
    public static void main(String[] args) throws Exception {
        // ! akan error
        FileInputStream fileInput = new FileInputStream("input.txt");
    }
}
