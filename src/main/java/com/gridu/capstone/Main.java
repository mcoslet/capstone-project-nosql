package com.gridu.capstone;

import com.gridu.capstone.common.constants.Constants;
import com.gridu.capstone.common.filters.FilterData;
import com.gridu.capstone.common.filters.PlayerFilter;
import com.gridu.capstone.common.pojo.Player;
import com.gridu.capstone.jobs.JobRunner;
import com.learn.mongo.connect.SingletonConnect;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;

/*

You’ll play the role of a back-end developer for a Java application,
and your job is to implement the application’s communication with MongoDB. This includes:

    Reading and writing data
    Using the Aggregation Framework
    Managing the configuration of the database client through the Java driver
    Creating a robust application by handling exceptions and timeouts

 */


/**
 * Group players by nationality and calculate the average overall rating of players from each nationality.
 * Group players by their preferred foot and calculate the average wage and value of players with left and right feet.
 * Group players by their positions and calculate the maximum overall rating of players in each position.
 * Group players by their work rate and calculate the average value of players with different work rates.
 * Find the top 10 players with the highest overall rating and sort them by their age.
 * Group players by their body type and calculate the average rating for each body type.
 * Find the players with the highest dribbling and ball control stats and calculate the average rating of these players.
 * Group players by their clubs and calculate the average wage and value of players in each club.
 * Calculate the average rating of players for each position and preferred foot combination. This could help you identify which positions are most suited to players with left or right feet.
 * Group players by their body type and position, and calculate the average overall rating of players in each group. This could help you identify which body types are most suited to different positions on the field.
 * Find the top 10 clubs with the highest value of players and sort them by the average overall rating of their players. This could help you identify the most valuable clubs based on the quality of their players.
 * Group players by their nationality and age, and calculate the average overall rating of players in each group. This could help you identify which nationalities produce the best players at different ages.
 * Calculate the average rating of players with a particular skill move level (e.g., 5-star skill moves) and preferred foot. This could help you identify which skill moves are most valuable for players with left or right feet.
 * Group players by their positions and calculate the maximum value of players in each position. This could help you identify the most valuable positions on the field.
 * Find the top 10 players with the highest composure rating and sort them by their overall rating. This could help you identify the most composed players who perform well under pressure.
 */
public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = SingletonConnect.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase(Constants.DataBase.capstone);
        MongoCollection<Player> collection = database.getCollection(Constants.Table.input, Player.class);
//        collection.find(FilterData.findByNationality("Argentina")).limit(5);
//        FilterData.findHighestPlayers(collection, 5);
//        FilterData.findYoungestPlayer(collection).forEach(System.out::println);
        //FilterData.avgAge(collection).forEach(System.out::println);
        //FilterData.countByColumn(collection, Constants.Columns.club).forEach(System.out::println);
        //FilterData.countByPreferredFoot(collection).forEach(System.out::println);
        //FilterData.sortByColumn(collection, Constants.Columns.value).forEach(System.out::println);
        // FilterData.printSchema(collection);


        PlayerFilter filter = new PlayerFilter(collection);

        filter.findByNationality("Argentina").forEach(System.out::println);
    }

}
