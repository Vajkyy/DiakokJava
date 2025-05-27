package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KonzolosProgram {

    public static void main(String[] args) {
        try {
            String sor=Files.readString(Path.of("diakok.txt"));
            System.out.println("Beolvasott fájl tartalma: \n" + sor);
        } catch (IOException ex) {
            Logger.getLogger(KonzolosProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
