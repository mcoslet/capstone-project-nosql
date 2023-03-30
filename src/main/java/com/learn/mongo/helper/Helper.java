package com.learn.mongo.helper;

import com.learn.mongo.helper.pojo.SurfaceTemperatureC;
import org.bson.Document;

public class Helper {
    public static Document pojoToDoc(SurfaceTemperatureC surfaceTemperatureC){
        Document doc = new Document();

        doc.put("min",surfaceTemperatureC.getMin());
        doc.put("max",surfaceTemperatureC.getMax());
        doc.put("mean",surfaceTemperatureC.getMean());

        return doc;
    }
}
