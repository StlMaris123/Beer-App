package com.example.stella.testing;

/**
 * Created by stella on 10/2/17.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_find_beer);
    }
    //call when the button gets clicked
    public void onClickFindBeer(View view){
        //get reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);
        //get reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the selected item in the spinner
        String beerType = String.valueOf(color.getSelected());
        List<String> brandList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList){
            brandsFormatted.append(brand).append('\n');

        }
        //display the selected types
        brands.setText(beerFormatted);

    }
}
