package com.cafeblue.bishop.cafeblue;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lv = (ListView)findViewById(R.id.list);
        lv.setAdapter(new MyAdapter(this, R.layout.list_item,R.id.textView1,
                getResources().getStringArray(R.array.CafeMenu)));

    }

    public class MyAdapter extends ArrayAdapter<String> {
        public MyAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
            super(context, resource, textViewResourceId, objects);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = inflater.inflate(R.layout.list_item,parent,false);
            String[] items = getResources().getStringArray(R.array.CafeMenu);

            ImageView iv = (ImageView)findViewById(R.id.imageView2);
            TextView tv = (TextView)findViewById(R.id.textView1);

           //tv.setText("dfdgdgd");
           //Toast.makeText(getContext(),"gfhgjggty "+items[position],Toast.LENGTH_LONG).show();

           if(items[position].equals("Meal"))
            {
                //iv.setImageResource(R.mipmap.meal);
            }
            /*else if(items[position].equals("Hot Beverage"))
            {
                iv.setImageResource(R.mipmap.hot);
            }
            else if(items[position].equals("Cold Beverage"))
            {
                iv.setImageResource(R.mipmap.cold);
            }
            else if (items[position].equals("Reward"))
            {
                iv.setImageResource(R.mipmap.hot);
            }
            else if(items[position].equals("Location"))
            {
                iv.setImageResource(R.mipmap.hot);
            }
            else if(items[position].equals("About"))
            {
                iv.setImageResource(R.mipmap.hot);
            }
            else if(items[position].equals("Facebook"))
            {
                iv.setImageResource(R.mipmap.hot);
            }*/

            return row;
        }
    }

}
