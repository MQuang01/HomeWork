package IOTextFile;

import java.util.List;

public class CountryClient {
    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        List<Country> listCountry = readFileCSV.readFileCsv("./data/fileCountry.csv");
        for(Country country : listCountry){
            System.out.println(country);
        }
    }
}
