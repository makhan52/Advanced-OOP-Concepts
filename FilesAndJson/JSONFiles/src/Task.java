import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }

    public String readFile(String path){
        String contains = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            int val = 0;
            while ((val = br.read()) != -1)
                contains += (char) val;
        }catch(IOException e) {
            e.printStackTrace();
        }
        return contains;
    }
    public JsonObject readJson(String filename){
        String var = readFile(filename);
        JsonObject contains = (JsonObject) Jsoner.deserialize(var,new JsonObject());
        return contains;
    }
}