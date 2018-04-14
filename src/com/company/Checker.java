package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checker {
    public static void main(String[] args) {
        String csvFile = args[1];
        String line = "";
        String cvsSplitBy = ",";
        double T = 0.5;
        int l = 0;

        int index = Integer.parseInt(args[0]);

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
                if (l == index ){
                    String[] data = line.split(cvsSplitBy);

                    String label = data[3];

                    System.out.println("For data with index " + data[0] + " which is figure " + data[1] + " to guess was " + label);
                }
                l++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
