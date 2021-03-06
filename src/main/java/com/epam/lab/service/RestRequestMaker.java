package com.epam.lab.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 */
public class RestRequestMaker {
    private static final Logger LOGGER = Logger.getLogger(RestRequestMaker.class);
    Number number = null;
    NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);

    public double getResultFromJson(String requestUrl) {
        URL url = null;
        try {
            url = new URL(requestUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection request = null;
        try {
            request = (HttpURLConnection) url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            request.connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Convert to a JSON object to print data
        JsonParser jp = new JsonParser(); //from gson
        JsonElement root = null; //Convert the input stream to a json element
        try {
            root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        try {
            number = format.parse(rootobj.get("result").getAsString());
        } catch (ParseException e) {
            LOGGER.error(e);
        }
        return number.doubleValue();
    }
}
