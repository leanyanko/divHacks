package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Statistics {
    public static void main(String[] args) {
        // 3 C:/Users/mrsle/IdeaProjects/mlfigures/labelsForTrain.csv
        String csvFile = args[1];//"C:/Users/mrsle/IdeaProjects/mlfigures/labelsForTrain.csv";//args[1];
        String line = "";
        String cvsSplitBy = ",";
        double T = 0.5;
        int l = 0;

       // int index = Integer.parseInt(args[0]);
        double[] statistics = new double[10];
        int counts[] = new int[10];
        for (int i = 0; i < 10; i++){
            statistics[i] = 0;
            counts[i] = 0;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
                if (l > 0){
                    String[] data = line.split(cvsSplitBy);
                    String s = data[1].split(" ")[0];
                 //   System.out.print(data[1].split(" "));
                    int figure = Integer.parseInt(data[1]);
                    statistics[figure] += Double.parseDouble(data[2]);
                    counts[figure] ++;
                }
                l++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        double avg[] = new double[10];
        for (int i = 0; i < 10; i++) {
            avg[i] = statistics[i] / counts[i];
            System.out.println("Average percentage for figure " + i + " is " + avg[i]);

        }

    }
}
