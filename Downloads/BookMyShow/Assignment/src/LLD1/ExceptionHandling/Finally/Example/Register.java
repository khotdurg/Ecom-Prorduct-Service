package LLD1.ExceptionHandling.Finally.Example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Register {
    public static void main(String[] args) {
        BufferedReader file = null;
        try {
            // Initialize BufferedReader to read from a file
            file = new BufferedReader(new FileReader("example.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
