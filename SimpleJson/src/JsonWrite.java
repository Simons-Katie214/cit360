/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ksimons
 */
public class JsonWrite {
  public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("Band Name", "BigBang");
        obj.put("Company Name", "YG Entertainment");
        obj.put("Years Debuted", new Integer(11));

        JSONArray list = new JSONArray();
        list.add("G-Dragon - Leader and Rapper");
        list.add("Top - Rapper");
        list.add("Taeyang - Vocals");
        list.add("Daesung - Vocals");
        list.add("Seungri - Vocals");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("test")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }
   
}
