import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       Metodos m = new Metodos();
      String datoFinal = m.lecFile("C:\\IDE\\ide.txt");
        System.out.println(datoFinal);
    }
    
}
