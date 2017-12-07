package c.gridview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //    Images Array Containing All the Images in the Order to Be put in the GridView
    int[] androidVersionImages =
            new int[]{R.drawable.one,R.drawable.two,R.drawable.three, R.drawable.four,R.drawable.five,R.drawable.six
                    ,R.drawable.seven,R.drawable.eight,R.drawable.nine,R.drawable.ten,R.drawable.eleven,
                    R.drawable.twelve,R.drawable.thirteen,R.drawable.fourteen,R.drawable.fifteen};
    //    String Array consisting the names of the versions in the order to be sDisplayed in the GridView
    String [] androidVersionNames=
            new String[]{"Alpha", "Beta","CupCake","Donut","Eclair","Froyo","GingerBread", "HoneyComb",
                    "IceCreamSandwich","JellyBean","Kitkat","LollyPop","Marshmallow","Nougat","Oreo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        Grid View Initialization
        GridView gridView = (GridView) findViewById(R.id.gridview);

//        Object of the CustomAdapter Class to Implement BaseAdaptor class
        CustomAdaptor customAdaptor= new CustomAdaptor();
//        Setting adaptor to the Grid View
        gridView.setAdapter(customAdaptor);

    }

    //    Implementing The BaseAdaptor Class using subClass CustomAdapter
    class CustomAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return androidVersionImages.length;
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

            view= getLayoutInflater().inflate(R.layout.cell,null);
            ImageView versionImage=(ImageView)view.findViewById(R.id.imageView);
            TextView versionName= (TextView)view.findViewById(R.id.textView2);

//            Assigning Data to ImageView and TextViews
            versionImage.setImageResource(androidVersionImages[i]);
            versionName.setText(androidVersionNames[i]);

            return view;
        }
    }
}
