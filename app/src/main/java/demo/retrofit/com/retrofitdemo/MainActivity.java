package demo.retrofit.com.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManger;
    private RecyclerAdapter mAdapter;
    private List<Album> mAlbumList;
    private ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);
        mLayoutManger = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManger);
        mRecyclerView.setHasFixedSize(true);


        mApiInterface = ApiClient.getAPiClient().create(ApiInterface.class);
        Call<List<Album>> call = mApiInterface.getAlbumList();
        call.enqueue(new Callback<List<Album>>() {
            @Override
            public void onResponse(Call<List<Album>> call, Response<List<Album>> response) {
                mAlbumList = response.body();
                mAdapter = new RecyclerAdapter(mAlbumList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<List<Album>> call, Throwable t) {

            }
        });
    }
}
