package com.tbz.practice.tbzweather.serviceAPI;

import android.widget.EditText;

import com.tbz.practice.tbzweather.activity.MainActivity;
import com.tbz.practice.tbzweather.response.WeatherResponce;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by USER on 17-Dec-16.
 */

public interface WeatherServiceApi {
    @GET("data/2.5/weather?q=Dhaka&units=metric&appid=a08e0c10fac76b0cf63afb035f0ffc7e")
    Call<WeatherResponce> getWeatherInformation();


}
