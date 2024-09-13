package vn.edu.usth.usthweather;

import android.util.Log;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("USTHWeather", "onCreate called");
        setContentView(R.layout.activity_main);
        PagerAdapter adapter = new HomeFragmentPagerAdapter(
                getSupportFragmentManager()) ;
        ViewPager pager = (ViewPager) findViewById (R.id.weatherpager);
        pager. setOffscreenPageLimit (3);
        pager. setAdapter (adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab);
        tabLayout.setupWithViewPager(pager);
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

