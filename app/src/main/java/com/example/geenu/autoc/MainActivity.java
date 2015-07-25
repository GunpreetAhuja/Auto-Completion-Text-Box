package com.example.geenu.autoc;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    AutoCompleteTextView t1;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t= (TextView) findViewById(R.id.textView);
        t1=(AutoCompleteTextView)findViewById(R.id.at);
        String list[] = {"apple", "Sony", "Samsung", "Hp", "Dell" , "Toshiba"};
        
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, list);

        t1.setThreshold(1);
        t1.setAdapter(adapter);
        t1.setTextColor(Color.RED);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
