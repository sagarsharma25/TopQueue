package it.crudmon.interview.topqueue;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.File;

public class CustomGridBook extends BaseAdapter{
    private Context mContext;
    private  final String[] web;
    private final String[] subh;

    PrefManager pref;



    public CustomGridBook(Context c,String[] web,String[] subh) {
        mContext = c;

        this.web = web;
        this.subh=subh;

    }

    @Override
    public int getCount() {

        return web.length;
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {

        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.book_card, null);
            pref=new PrefManager(grid.getContext());
            TextView textView1 = (TextView) grid.findViewById(R.id.title);
            TextView textView2=(TextView)grid.findViewById(R.id.subtitle);
            textView1.setText(web[position]);
            textView2.setText(subh[position]);


            //ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);          When Image to be added to cards
            //imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }

        return grid;
    }
//    private void setImageoncard(Context context, ImageView img, String url) {
//        Picasso.with(context)
//                .load(url)
//                .fit()
//                .centerCrop()
////                .placeholder(R.drawable.placeholder_cherish)
////                .placeholder(R.drawable.placeholder_cherish)
//                .into(img);
//    }

}