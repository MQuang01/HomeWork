package ExceptionAndDebug;

import java.util.Scanner;

public class TriagleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập b: ");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Hãy nhập c: ");
        int c = Integer.parseInt(scanner.nextLine());

        Triagle triagle = new Triagle(a, b, c);
        try {
            triagle.checkTriangle(a, b, c);
            System.out.println("Ba cạnh trên tạo thành một tam giác.");
            System.out.println(triagle);
        } catch (IllegalTriangleException e) {
            System.out.println("Ba cạnh trên không thể tạo thành một tam giác.");
        }
    }
    public void checkTriangle(int a, int b, int c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException();
        }
    }


}
class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
        super("Ba cạnh không thể tạo thành một tam giác.");
    }
}
