package vn.edu.usth.midgroupproject;


import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_library);

        ImageButton searchButton =  findViewById(R.id.searchButton);

    }
    @Override
    public void onStart(){
        super.onStart();
        Log.i("SpotifyLib", "onStart called");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("SpotifyLib", "onResume called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("SpotifyLib", "onPause called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("SpotifyLib", "onStop called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("SpotifyLib", "onDestroy called");
    }
}