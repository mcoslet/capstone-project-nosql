package com.gridu.capstone.common.connect;

import com.gridu.capstone.common.constants.Constants;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SingletonConnect {

    private SingletonConnect(){}
    private static MongoClient mongoClient;


    public static synchronized MongoClient getMongoClient(){
        if (mongoClient == null){
            System.out.println(getConnectionString());
            ConnectionString connectionString =
                    new ConnectionString(getConnectionString());
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(connectionString)
                    .serverApi(ServerApi.builder()
                            .version(ServerApiVersion.V1)
                            .build())
                    .build();
            mongoClient = MongoClients.create(settings);
        }
        return mongoClient;
    }




    private static String getConnectionString() {
        String currentLine = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(Constants.Path.connectionString))) {
            currentLine = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentLine;
    }
}
