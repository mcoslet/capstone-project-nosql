package com.gridu.capstone.common.filters;

import com.gridu.capstone.common.constants.Constants;
import com.gridu.capstone.common.interfaces.PlayerFilterProcessor;
import com.gridu.capstone.common.pojo.Player;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.conversions.Bson;

public class PlayerFilter implements PlayerFilterProcessor {
    private MongoCollection<Player> collection;

    public PlayerFilter(MongoCollection<Player> collection){
        this.collection = collection;
    }

    @Override
    public FindIterable<Player> findByNationality(String nationality) {
        return collection.find(Filters.eq(Constants.Columns.nationality, nationality));
    }
}
