package com.example.decam9.flixster.Models;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by decam9 on 6/22/17.
 */

public class Config {

    //the base url for loading images
    String imageBaseUrl;
    //the poster size to use when fetching the images, part of the url
    String posterSize;
    // the backdrop size to use when fetching images
    String backdropSize;


    public Config(JSONObject object) throws JSONException {
        JSONObject images = object.getJSONObject("images");
        //get the image base url
        imageBaseUrl=images.getString("secure_base_url");
        //get the poster size
        JSONArray posterSizeOptions = images.getJSONArray("poster_sizes");
        //use the option at index J or w342 as a fallback
        posterSize= posterSizeOptions.optString(3,"w342");
        //parse the backdrop sizes and use the option at index 1 or w780 as a fallback
        JSONArray backdropSizeOptions = images.getJSONArray("backdrop_sizes");
        backdropSize= backdropSizeOptions.optString(1, "w780");
    }


    //helper method for creating urls
    public String getImageUrl(String size, String path) {
        return String.format ("%s%s%s", imageBaseUrl, size, path); //concentrate all three
    }
    public String getImageBaseUrl() {
        return imageBaseUrl;

    }

    public String getPosterSize() {
        return posterSize;
    }

    public String getBackdropSize() {
        return backdropSize;
    }
}