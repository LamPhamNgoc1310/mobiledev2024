package vn.edu.usth.usthweather;

import android.util.Log;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class WeatherActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("USTHWeather", "onCreate called");
//        EdgeToEdge.enable(this);
        setContentView(R.layout.fragment_forecast);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            ForecastFragment firstFragment = new ForecastFragment();
//            getSupportFragmentManager().beginTransaction().add(
//                    R.id.main, firstFragment).commit();
//            return insets;
//        });

}
    @Override
    public void onStart(){
        super.onStart();
        Log.i("USTHWeather", "onStart called");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("USTHWeather", "onResume called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.i("USTHWeather", "onPause called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.i("USTHWeather", "onStop called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i("USTHWeather", "onDestroy called");
    }
}

