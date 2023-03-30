package com.gridu.capstone.common.filters;

import com.gridu.capstone.common.constants.Constants;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;

import com.mongodb.client.model.Accumulators;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Sorts;
import org.bson.Document;
import org.bson.conversions.Bson;

import java.util.List;

public class FilterData {

    private FilterData(){}
    public static Bson findByNationality(String nationality){
        return Filters.eq(Constants.Columns.nationality, nationality);
    }

    public static FindIterable<Document> findHighestPlayers(MongoCollection<Document> collection, int limit) {
        return collection.find().sort(Sorts.descending(Constants.Columns.height)).limit(limit);
    }

    public static FindIterable<Document> findYoungestPlayer(MongoCollection<Document> collection) {
        return collection.find().sort(Sorts.ascending(Constants.Columns.age)).limit(1);
    }

    public static AggregateIterable<Document> avgAge(MongoCollection<Document> collection){
        return collection.aggregate(List.of(
                Aggregates.group("$" + Constants.Columns.nationality, Accumulators.avg(Constants.Columns.age + "_AVG", "$"+Constants.Columns.age)),
                Aggregates.sort(Sorts.descending(Constants.Columns.age + "_AVG"))
                )
        );
    }

    public static AggregateIterable<Document> countByColumn(MongoCollection<Document> collection, String column){
        return collection.aggregate(
                List.of(
                       Aggregates.sortByCount("$" + column)
                )
        );
    }

    public static AggregateIterable<Document> countByPreferredFoot(MongoCollection<Document> collection){
        return collection.aggregate(
                List.of(
                        Aggregates.sortByCount("$" + Constants.Columns.preferredFoot)
                )
        );
    }

    public static FindIterable<Document> sortByColumn(MongoCollection<Document> collection, String column){
        return collection.find().sort(Sorts.descending(column));
    }

    public static void printSchema(MongoCollection<Document> collection){
        Document schemaObj = collection.find().first();
        for (String key : schemaObj.keySet()){
            System.out.println(key);
        }
    }
}
