package com.example.movieproapp.view;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.movieproapp.R;
import com.example.movieproapp.databinding.ActivityMovieBinding;
import com.example.movieproapp.model.Movie;


public class MovieActivity extends AppCompatActivity {

    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

//        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
//       // setSupportActionBar(toolbar);
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        activityMovieBinding= DataBindingUtil.setContentView(this, R.layout.activity_movie);

        Intent i=getIntent();

        if(i.hasExtra("movie")){
            movie=getIntent().getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
           // getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}