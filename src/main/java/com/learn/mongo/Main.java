package com.learn.mongo;

import com.learn.mongo.connect.SingletonConnect;
import com.learn.mongo.helper.Helper;
import com.learn.mongo.helper.pojo.SurfaceTemperatureC;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        MongoClient mongoClient = SingletonConnect.getMongoClient();
        MongoDatabase database = mongoClient.getDatabase("sample_guides");
        String dummyText = "Test Java driver";
        MongoCollection<Document> listingsAndReviews = database.getCollection("planets");
//        Document appendItem = new Document()
//                .append("_id",new ObjectId())
//                .append("name", dummyText)
//                .append("orderFromSun", 666)
//                .append("hasRings", true)
//                .append("mainAtmosphere", Arrays.asList("J", "A","V","A"))
//                .append("surfaceTemperatureC", Helper.pojoToDoc(new SurfaceTemperatureC(-666, 666, 12345)));

        Bson filter = Filters.eq("name", dummyText);

        listingsAndReviews.find(Filters.and(filter)).forEach(System.out::println);

        listingsAndReviews.updateOne(filter, Updates.set("hasRings", false));

        listingsAndReviews.find(Filters.and(filter)).forEach(document -> System.out.println(document.toJson()));

        listingsAndReviews.deleteOne(filter);

    }
}
