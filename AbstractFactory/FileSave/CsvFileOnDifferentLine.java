package DesignPatterns.AbstractFactory.FileSave;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFileOnDifferentLine implements CsvFile {

    public final String DIR_PATH = "/home/varunu28/Documents/JavaPrac/src/DesignPatterns/";
    public File file = new File(DIR_PATH + "fileDiffLine.csv");

    @Override
    public void saveCsvFileFormatted(int... arr) throws Exception {

        if (file.exists()) {
            file.delete();
        }
        else {
            file.createNewFile();
        }

        try {
            BufferedWriter writer =
                    new BufferedWriter(new FileWriter(file, true));

            for (int n : arr) {
                writer.write(n + "," + "\n");
            }

            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("Updated to CSV file with data on different line");
    }
}
