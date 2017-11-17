package demo.retrofit.com.retrofitdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sangram Desai.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

   private List<Album> albumList;

   public RecyclerAdapter(List<Album> list) {
       albumList= list;
   }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowitem, parent, false);
       return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder  holder, int position) {
        holder.albumName.setText(albumList.get(position).getAlbumTitle());
        holder.albumID.setText(albumList.get(position).getAlbumID());
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

       TextView albumID;
       TextView albumName;

       public MyViewHolder(View itemView) {
            super(itemView);
            albumID = (TextView)itemView.findViewById(R.id.albumID);
            albumName = (TextView)itemView.findViewById(R.id.albumTitle);
        }
    }
}
