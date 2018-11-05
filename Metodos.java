import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Metodos {
    
    public String lecFile(String ruta) throws FileNotFoundException, IOException{
        //CARGAR Y LEER ARCHIVO
        BufferedReader bf = new BufferedReader(new FileReader(ruta));
        //DECLARO VARIABLES
        String linea,lectura="";
        //RECORRO LINEAS
        while((linea=bf.readLine())!=null){
            lectura+=linea;
        }
        //RETORNO DATO
        return lectura;
    }
}
