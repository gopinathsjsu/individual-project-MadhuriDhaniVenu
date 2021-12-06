package com.inventory;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvFileOperations implements FileOperations {
    @Override
    public List<List<String>> readFile(File filename) {
        //  public List<List<String>> readFile(String filePath) {
        List<List<String>> records = new ArrayList<>();

        try  {
           // BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/inventory/Input.csv"));
           BufferedReader br = new BufferedReader(new FileReader(filename.getName()));
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
                //String[] values = line.split(",");
               // records.add(values[0]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return records;
    }

    @Override
    public void writeFile(String filename , List<String> value) throws IOException {
        FileWriter csvWriter = new FileWriter(filename);
        BufferedWriter out = new BufferedWriter(csvWriter);
        for(String l : value){
            out.write(l);
        }
        out.close();
    }



}


