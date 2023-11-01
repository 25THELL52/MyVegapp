package com.example.myvegapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ListView listview ;
    ArrayAdapter<String> myvegadapter ;
    String [] myvegarray = {
            "asparagus","avocado","sweet potatoes","broccoli","carrots","corn","cucumber","green beans" ,"eggplant","garlic",
            "onions","peas","potatoes"
            ,"tomatoes","turnips","sweet peppers"
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();


    }

    public void setup(){


        //fill up the listview with array items

                imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.asparagus);
        listview = (ListView)findViewById(R.id.listview);
        myvegadapter = new ArrayAdapter<String>(this,R.layout.simple_list_item_1,R.id.tvforadapter,
                myvegarray);
        listview.setAdapter(myvegadapter);


        // onItemClickListener

        listview.setOnItemClickListener(
                (list, row, index, rowID) -> {
                    // code to run when user clicks that item

                    int i = index;
                    String myDrawableName = myvegarray[i].replaceAll(" ","_");
                    int resID = getResources().getIdentifier(myDrawableName , "drawable", getPackageName());
                    imageView.setImageResource(resID);
/*
                    switch (myDrawableName) {


                        case "green beans"  : {  imageView.setImageResource(R.drawable.green_beans); break;}
                        case "sweet potatoes"  : {  imageView.setImageResource(R.drawable.sweet_potatoes);break;}
                        case "sweet peppers"  : {  imageView.setImageResource(R.drawable.sweet_peppers);break;}





                    }

 */


                }
        );








    }



}