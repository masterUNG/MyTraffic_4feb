package appewtc.masterung.mytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by masterUNG on 2/5/2017 AD.
 */

public class MyAdapter extends BaseAdapter{

    //Explicit การประกาศตัวแปร
    private Context context;
    private int[] ints; // for icon
    private String[] titleStrings, detailStrings;

    public MyAdapter(Context context,
                     int[] ints,
                     String[] titleStrings,
                     String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //Initial View
        ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView2);

        //Show view
        imageView.setImageResource(ints[i]);
        titleTextView.setText(titleStrings[i]);
        detailTextView.setText(detailStrings[i]);

        return view1;
    }
}   // Main Class
