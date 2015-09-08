package pl.com.jnachyla.sallarycounter;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarek on 2015-09-08.
 */
public class DataReader {
    private List<String> list  = new ArrayList();
    public DataReader(String path) {



        LineIterator it = null;
        try {
            it = FileUtils.lineIterator(new File(path), "UTF-8");


            while (it.hasNext()) {
                String line = it.nextLine();

                list.add(line);

            }

        } catch (IOException e) {
            System.out.println("Blad podczas wczytawania pliku, sprawdz czy sciezka do pliku jest poprawna, oraz czy plik istnieje. Path:" + path);
        }finally {
            it.close();
        }
    }
    public List<String> getList() {return  list;}
}
