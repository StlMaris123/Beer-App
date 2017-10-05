package com.example.stella.testing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Spinner;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private BeerExpert expert = new BeerExpert();

     @Override
    protected void onCreate(Bundle savedInstanceState) {
               super.onCreate(savedInstanceState);
               setContentView(R.layout.activity_main);
           }
           public void onClickFindBeer(View view){
               TextView brands = (TextView) findViewById(R.id.brands);
               //brands.setText("Gottle of geer");
               Spinner color = (Spinner) findViewById(R.id.color);
               //color.getSelectedItem()
               String beerType = String.valueOf(color.getSelectedItem());
               List<String> brandsList = expert.getBrands(beerType);
               StringBuilder brandsFormatted = new StringBuilder();
               for (String brand:brandList){
                   brandsFormatted.append(brand).append("\n");
               }
               char[] beerFormatted;
               brands.setText(beerFormatted);
           }
    }