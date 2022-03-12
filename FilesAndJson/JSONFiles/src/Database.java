import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

import java.math.BigDecimal;

public class Database {
    private JsonObject db;


    public Database(JsonObject data){
        this.db = data;
    }

    public JsonObject getRestaurant(String name){
        JsonArray r = (JsonArray) this.db.get("restaurants");
        int id = 0;
        for(int i = 0; i < r.toArray().length; i++){
            JsonObject test = (JsonObject) r.get(i);
            if(test.get("name").equals(name))
                id = i;
        }

        JsonObject restStuff = (JsonObject) r.get(id);
        return restStuff;
    }

    public double getAvgReviews(String name){
        JsonObject r = getRestaurant(name);
        JsonArray rev = (JsonArray) r.get("reviews");
        double rate = 0;
        for(int i=0; i < rev.toArray().length; i++){
            JsonObject test = (JsonObject) rev.get(i);
            BigDecimal tmp = (BigDecimal) test.get("rating");
            rate += tmp.doubleValue();
        }
        return rate/rev.size();
    }
}
