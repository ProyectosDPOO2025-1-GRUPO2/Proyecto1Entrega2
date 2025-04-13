package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArchivoPlano {

	public void escribir(String nombreArchivo, ArrayList<String> lineasTexto) {
        try {
            File archivo = new File(nombreArchivo);
            archivo.getParentFile().mkdirs(); // 🟢 Crea las carpetas necesarias

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for(String linea : lineasTexto) {
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public ArrayList<String> leer (String nombreArchivo){
		ArrayList<String> lineasTexto = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			while((linea = br.readLine()) != null) {
				lineasTexto.add(linea);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lineasTexto;
	}
	
	
}

