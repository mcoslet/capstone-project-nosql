package com.gridu.capstone.common.interfaces;

import com.gridu.capstone.common.pojo.Player;
import com.mongodb.client.FindIterable;
import org.bson.conversions.Bson;

public interface PlayerFilterProcessor {
    FindIterable<Player> findByNationality(String nationality);

}
