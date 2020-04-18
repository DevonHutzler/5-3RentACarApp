package com.example.a5_3rentacarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class rentalcompanys extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] rental = { "Enterprise", "Hertz", "National", "Alamo", "Budget", "Rentalcars.com" };
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_rentalcompanys, R.id.companyList, rental));
    }

    //launching web pages - p.198
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0: //Enterprise
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.enterprise.com/")));
                break;
            case 1: //Hertz
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hertz.com/")));
                break;
            case 2: //National
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nationalcar.com/")));
                break;
            case 3: //Alamo
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alamo.com/")));
                break;
            case 4: //Budget
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.budget.com/")));
                break;
            case 5: //Rentalcars.com
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rentalcars.com/")));
                break;
            default:
                //stuff
                break;
        }
    }
}