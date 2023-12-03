package IOTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCSV {
    public List<Country> readFileCsv(String fileName){
        List<Country> countryList = new ArrayList<>();
        try {
            File file = new File(fileName);
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine()) != null){
                String [] items = line.split(",");
                int id = Integer.parseInt(items[0]);
                String code = items[1];
                String name = items[2];

                Country country = new Country(id, code, name);
                countryList.add(country);

            }

            br.close();
            return countryList;

        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
