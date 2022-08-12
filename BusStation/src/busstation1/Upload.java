package busstation1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Upload extends AbstractClass {
    Logic logic = new Logic();
     Object[] Upload() {
        filePath = logic.getFile();
        File file = new File(filePath);
        int i;
        Object[] lines = null;
        try {
            FileReader r = new FileReader(file);
            BufferedReader b = new BufferedReader(r);
            lines = b.lines().toArray();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lines;
    }

    Object[] TripsUpload() {
         filePath = "C:\\Users\\mariam\\Documents\\NetBeansProjects\\BusStation1\\Trips.txt";
        File file = new File(filePath);
        int i;
        Object[] lines = null;
        try {
            FileReader r = new FileReader(file);
            BufferedReader b = new BufferedReader(r);
            lines = b.lines().toArray();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lines;
    }

}
