package com.example.dell.s5a1_menutextcolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


/**
 *Implemented options menu having option "TEXT COLOR" and its sub menu of at least
 3 colors. On click of each color should change the activity TextView color
 */

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text);
    }

    /**
     *option menu is taken and onCreateOptionsMenu options are created
     * on onOptionsItemSelected the according task will be performed and the color of the text will be changed
     */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.redcolor:
                textView.setTextColor(getResources().getColor(R.color.red));
                return true;

            case R.id.greencolor:
                textView.setTextColor(getResources().getColor(R.color.green));
                return true;

            case R.id.blueolor:
                textView.setTextColor(getResources().getColor(R.color.blue));
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
