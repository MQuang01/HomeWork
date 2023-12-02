package StackAndQueue.ex4;

import java.util.Scanner;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi cần đếm từ
        System.out.println("Nhập chuỗi: ");
        String inputString = scanner.nextLine();

        // Tách chuỗi thành các từ bằng cách sử dụng khoảng trắng làm dấu phân cách
        String[] words = inputString.split("");

        // Sử dụng TreeMap để lưu trữ từ và số lượng của nó
        TreeMap<String, Integer> wordCountMap = new TreeMap<>();

        // Duyệt qua từng từ trong mảng words
        for (String word : words) {
            // Chuyển từ thành chữ hoa hoặc chữ thường để coi như là một key duy nhất
            String formattedWord = word.toLowerCase(); // Chuyển thành chữ thường, hoặc có thể sử dụng toUpperCase() để chuyển thành chữ hoa

            // Kiểm tra xem từ đã có trong map chưa
            if (wordCountMap.containsKey(formattedWord)) {
                // Nếu từ đã có trong map, tăng giá trị (số lượng từ) lên 1
                int count = wordCountMap.get(formattedWord);
                wordCountMap.put(formattedWord, count + 1);
            } else {
                // Nếu từ chưa có trong map, đưa từ vào map với giá trị mặc định là 1
                wordCountMap.put(formattedWord, 1);
            }
        }

        // Hiển thị map gồm key (từ) và value (số lượng mỗi từ)
        System.out.println("Kết quả đếm từ: ");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + ": " + count);
        }

        scanner.close();
    }
}
