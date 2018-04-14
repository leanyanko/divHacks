package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LabelReader {
    private static int byteArrayToInt(byte[] b)
    {
        return   b[3] & 0xFF |
                (b[2] & 0xFF) << 8 |
                (b[1] & 0xFF) << 16 |
                (b[0] & 0xFF) << 24;
    }
    public static void main(String[] args) {
        //C:/Users/mrsle/IdeaProjects/mlfigures/train-images.idx3-ubyte
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
            System.exit(0);
        }

        String inputFile = "C:/Users/mrsle/IdeaProjects/mlfigures/train-labels.idx1-ubyte";//args[0];
        String outputFile = "file"; //args[1];

        try {
            Path path = Paths.get(inputFile);
            System.out.println(path.toString());
            byte[] fileContents = Files.readAllBytes(path);

            byte[] rno = new byte[4];

            for (int i = 0; i < 4; i++)
                rno[i] = fileContents[i];
            System.out.println(byteArrayToInt(rno));

            for (int i = 0; i < 4; i++)
                rno[i] = fileContents[i+4];
            System.out.println(byteArrayToInt(rno));

            for (int i = 0; i < 60000; i ++){
                int positive = fileContents[i + 8] & 0xff;
                System.out.println(positive);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
