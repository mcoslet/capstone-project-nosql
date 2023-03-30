package com.learn.mongo.read;

import com.gridu.capstone.common.constants.Constants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private Reader(){}

    public static String getConnectionString() {
        String currentLine = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(Constants.Path.connectionString))) {
             currentLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentLine;
    }
}
