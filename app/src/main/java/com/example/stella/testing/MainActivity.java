package com.example.stella.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //call when the button gets clicked
    public void onClickFindBeer(View view){
        //get reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);
        //get reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the selected item in the spinner
        String beerType = String.valueOf(color.getSelected());
        //display the selected types
        brands.setText(beerType);

    }
}
