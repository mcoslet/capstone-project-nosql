package com.gridu.capstone.common.reader;

import com.gridu.capstone.exception.InvalidDatabaseNameException;
import com.learn.mongo.connect.SingletonConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoReader {

    public MongoDatabase readDatabase(String dbName) throws InvalidDatabaseNameException {
        if (dbName.trim().isEmpty()) {
            throw new InvalidDatabaseNameException("Invalid name");
        } else {
            MongoClient mongoClient = SingletonConnect.getMongoClient();
            return mongoClient.getDatabase(dbName);
        }
    }


}
