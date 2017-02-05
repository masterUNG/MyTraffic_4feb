package appewtc.masterung.mytraffic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    ListView listView;  // Short Explicit
    private int[] ints = new int[]{R.drawable.traffic_01, R.drawable.traffic_02,
            R.drawable.traffic_03, R.drawable.traffic_04, R.drawable.traffic_05,
            R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
            R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11,
            R.drawable.traffic_12, R.drawable.traffic_13, R.drawable.traffic_14,
            R.drawable.traffic_15, R.drawable.traffic_16, R.drawable.traffic_17,
            R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

    private String[] titleStrings, detailStrings, shortDetailStrings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View
        listView = (ListView) findViewById(R.id.livTraffic);

        //Get Value
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        //SubString detail การตัดคำ
        shortDetailStrings = new String[detailStrings.length];
        for (int i=0;i<detailStrings.length;i++) {

            shortDetailStrings[i] = detailStrings[i].substring(0, 30) + "...";

        }   // for

        //Create ListView
        MyAdapter myAdapter = new MyAdapter(MainActivity.this, ints, titleStrings, shortDetailStrings);
        listView.setAdapter(myAdapter);

    }   // Main Method

}   // Main Class
