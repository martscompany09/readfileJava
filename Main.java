import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //INSTANCIO METODO
       Metodos m = new Metodos();
        //ASIGNO LECTURA A VARIBLE
      String datoFinal = m.lecFile("aqui va la ruta donde se encuentra el archivo");
        //IMPRIMO
        System.out.println(datoFinal);
    }
    
}
