package demo.retrofit.com.retrofitdemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Sangram Desai.
 * The class is responsible for creating an instance of Retrofit
 */
public class ApiClient {

    public static final String BASE_URL = "http://jsonplaceholder.typicode.com";

    public static Retrofit mRetrofit = null;

    public static Retrofit getAPiClient() {
        if(mRetrofit == null) {
            mRetrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create().create()).build();
        }

        return mRetrofit;
    }
}
