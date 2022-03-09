package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieHandler {

    public String addFileDataToList(){
        File movieFile = new File("data/imdb-data.csv");
        String result = "CREATE TABLE Movies(\n";
        try{
            Scanner scanner = new Scanner(movieFile);

                String line = scanner.nextLine();
                String[] data = line.split(";");

            for(int i=0; i< data.length; i++){
                if(i== data.length-1) {
                    result += data[i] + " varChar(255)\n";
                }else
                    result += data[i] + " " + " varChar(255), \n";
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found");
        }
        return result += ")";
    }

    public void writeToSqlFile(){
        try{
            File movieFile = new File("data/ddl.sql");
            FileWriter fileWriter = new FileWriter(movieFile, false);
            fileWriter.write(addFileDataToList());
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
