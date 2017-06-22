package com.example.decam9.flixster;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.decam9.flixster.Models.Movie;

import java.util.ArrayList;

/**
 * Created by decam9 on 6/21/17.
 */

public class MovieAdapter {
    //list of movies
    ArrayList<Movie> movies;

    //initialize with list

    public MovieAdapter(ArrayList<Movie> movie) {
        this.movies = movie;
    }

    //create the viewholder as a static inner class
    public static class ViewHolder extends RecyclerView.ViewHolder{

        //track view objects
        ImageView ivPosterImage;
        TextView tvTitle;
        TextView tvOverview;

        public ViewHolder(View itemView) {
            super(itemView);
            //lookup view objects by id
            ivPosterImage = itemView
        }
    }
}
