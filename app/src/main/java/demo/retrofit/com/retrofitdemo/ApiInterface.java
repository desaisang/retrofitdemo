package demo.retrofit.com.retrofitdemo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Sangram Desai.
 * This contains the list of possible API calls
 */

public interface ApiInterface {

    @GET("albums")
    Call<List<Album>> getAlbumList();
}
