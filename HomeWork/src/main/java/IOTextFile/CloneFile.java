package IOTextFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CloneFile {
    public static void main(String[] args) {
        CloneFile cloneFile = new CloneFile();
        cloneFile.copyFile("./data/file.txt", "./data/fileClone.txt");
    }
    public void copyFile(String sourceFileName, String targetFileName){
        List<String> listSource = new ArrayList<>();
        try {
            File file = new File(sourceFileName);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));

            String line = "";
            while ((line = br.readLine()) != null){
                listSource.add(line);
            }


            checkFileExists(targetFileName);
            BufferedWriter bw = null;

            bw = new BufferedWriter(new FileWriter(targetFileName));
            for(String lineSrc : listSource){
                bw.write(lineSrc + "\n");
            }

            br.close();
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean checkFileExists(String fileName){

        File file = new File(fileName);
        return file.exists();
    }

}
