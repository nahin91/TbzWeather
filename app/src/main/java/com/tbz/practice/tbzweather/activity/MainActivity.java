package com.tbz.practice.tbzweather.activity;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.tbz.practice.tbzweather.CustomPagerAdapter;
import com.tbz.practice.tbzweather.fragment.Fragment1;
import com.tbz.practice.tbzweather.fragment.Fragment2;
import com.tbz.practice.tbzweather.R;
import com.tbz.practice.tbzweather.response.WeatherResponce;
import com.tbz.practice.tbzweather.serviceAPI.WeatherServiceApi;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;
    Context context;
    TextView showNameTv;
    WeatherServiceApi weatherServiceApi;
    ImageView showIconIv;
    Bundle b = new Bundle();
    WeatherResponce weatherResponse;
    MaterialSearchView searchView;

    public static final String BASE_URL = "http://dotnet.nerdcastlebd.com/";
    public static final String BASE_URL_OF_WEATHER = "http://api.openweathermap.org/";
    public static final String BASE_URL_OF_ICON= "http://openweathermap.org/img/w/";
    public static final String _PNG= ".png";
    public static String SEARCH_CITY="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showIconIv= (ImageView) findViewById(R.id.weatherIcon);
        viewPager = (ViewPager) findViewById(R.id.vpPager);
        viewPager.setAdapter(new CustomPagerAdapter(this, getSupportFragmentManager()));

        /*Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Search");
        toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));

        searchView = (MaterialSearchView) findViewById(R.id.search_view);




        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if(newText != null && !newText.isEmpty()){
                    SEARCH_CITY=newText;

                }
                else{

                }
                return true;
            }


            <android.support.v7.widget.Toolbar
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/toolbar"
        android:background="@color/colorPrimary">

    </android.support.v7.widget.Toolbar>

    <com.miguelcatalan.materialsearchview.MaterialSearchView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/search_view">

    </com.miguelcatalan.materialsearchview.MaterialSearchView>




        });*/







        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }
        });



    }

    /*public class CustomPagerAdapter extends FragmentPagerAdapter {

        private  String[] fragments={"Current","Forecast"};
        private Context context;

        public CustomPagerAdapter( Context context, FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    //Fragment1 fragment1 = new Fragment1();
                    *//*b.putSerializable("response",weatherResponse);
                    fragment1.setArguments(b);
                    Log.e("weather", "bundle size: "+b );*//*
                    // fragment1.getWeatherResponse(weatherResponse);
                    return new Fragment1();
                case 1:
                    return new Fragment2();
                default:
                    return  null;
            }
        }

        @Override
        public int getCount() {
            return fragments.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragments[position];
        }
    }*/
}
