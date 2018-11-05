import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Metodos {
    //
    public String lecFile(String ruta) throws FileNotFoundException, IOException{        
        BufferedReader bf = new BufferedReader(new FileReader(ruta));
        String linea,lectura="";
        while((linea=bf.readLine())!=null){
            lectura+=linea;
        }
        return lectura;
    }
}
