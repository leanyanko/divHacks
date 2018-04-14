package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Laberer {
    public static void main(String[] args) {
        String csvFile = args[0];
        String line = "";
        String cvsSplitBy = ",";
        double T = 0.5;
        int l = 0;

        List output = new ArrayList();
        output.add("id, number, percentage, label");
        String NEW_LINE_SEPARATOR = "\n";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                double guessed = 0;
                double attempt = 0;
                 if (l > 0 ){
                    String[] data = line.split(cvsSplitBy);
                    for (int i = 2; i < data.length; i++) {
                        if (Integer.parseInt(data[i]) == 1) guessed++;
                        attempt++;
                    }
                    double percent = guessed / attempt;
                    String label = "";
                    if ( percent > T ) label = "EASY";
                    else label = "HARD";

                    String labeled = data[0] + ", " + data[1] + ", " + percent+ ", " + label;
                    output.add(labeled);
                 }
                l++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(args[1]);

            for (Object st: output){
                fileWriter.append(st.toString());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }

            System.out.println("CSV file was created successfully");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter");
                e.printStackTrace();
            }
        }


    }
}
