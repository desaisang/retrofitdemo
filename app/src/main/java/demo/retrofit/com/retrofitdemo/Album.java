package demo.retrofit.com.retrofitdemo;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Sangram Desai.
 * A simple POJO class to serialize and deserailize the data
 */

public class Album {
    @SerializedName("userId")
    private String userID;

    @SerializedName("id")
    private String albumID;

    @SerializedName("title")
    private String albumTitle;

    public String getUserID() {
        return userID;
    }

    public String getAlbumID() {
        return albumID;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }
}
