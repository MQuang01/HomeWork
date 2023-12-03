package IOTextFile;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ReadFileExample {
    private static String PATH_FILE_NAME = "./data/file.txt";
    public static void main(String[] args) {
        String path = PATH_FILE_NAME;

        ReadFileExample readFileExample = new ReadFileExample();
//        readFileExample.readFileText(path);

        List<Integer> listNum = readFileExample.readFileText(path);
        readFileExample.getMax(listNum);
    }

    public List<Integer> readFileText(String filePath){
        List<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filePath);

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                System.out.println(line);
//                sum += Integer.parseInt(line); // Bài ReadFile tính tổng

                numbers.add(Integer.parseInt(line));

            }
            br.close();

//            System.out.println("Tổng là " + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
        return numbers;
    }

    public void getMax(List<Integer> list){
        int max = list.get(0);
        for(Integer num : list){
            if (num > max){
                max = num;
            }
        }
        System.out.println("Max is: " + max);
    }
}
