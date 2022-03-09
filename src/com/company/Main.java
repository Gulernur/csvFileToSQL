package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MovieHandler mh = new MovieHandler();
        System.out.println(mh.addFileDataToList());
        mh.writeToSqlFile();
    }
}
