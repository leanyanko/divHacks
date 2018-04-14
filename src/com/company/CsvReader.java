package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
//    public static void main(String[] args) {
//        String csvFile = "C:/Users/mrsle/IdeaProjects/mlfigures/src/com/company/MNIST_train.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//        double T = 0.5;
//        int l = 0;
//
//        List output = new ArrayList();
//        output.add("id, number, percentage, label");
//        String NEW_LINE_SEPARATOR = "\n";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//
//          //  if ( l > 0) {
//                while ((line = br.readLine()) != null) {
//                    // use comma as separator
//                    double guessed = 0;
//                    double attempt = 0;
//                    //String[] country = line.split(cvsSplitBy);
//                    //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
//                    if (l > 0 ){
//                        String[] data = line.split(cvsSplitBy);
//                        for (int i = 2; i < data.length; i++) {
//                            if (Integer.parseInt(data[i]) == 1) guessed++;
//                            attempt++;
//                        }
//                        double percent = guessed / attempt;
//                        String label = "";
//                        if ( percent > T ) label = "EASY";
//                        else label = "HARD";
//
//                        String labeled = data[0] + ", " + data[1] + ", " + percent+ ", " + label;
//                        output.add(labeled);
//                   // System.out.println(data[0] + ". " + data[1] + " attemped: "+ attempt+ " guessed: " + guessed + ", guessed in " + persent + "% times");
//                }
//                l++;
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//        FileWriter fileWriter = null;
//
//        try {
//            fileWriter = new FileWriter("labelsForTrain.csv");
//
//            for (Object st: output){
//                fileWriter.append(st.toString());
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }
//
//            System.out.println("CSV file was created successfully");
//        } catch (Exception e) {
//            System.out.println("Error in CsvFileWriter !!!");
//            e.printStackTrace();
//        } finally {
//            try {
//                fileWriter.flush();
//                fileWriter.close();
//            } catch (IOException e) {
//                System.out.println("Error while flushing/closing fileWriter");
//                e.printStackTrace();
//            }
//        }
//
//
//    }
}
