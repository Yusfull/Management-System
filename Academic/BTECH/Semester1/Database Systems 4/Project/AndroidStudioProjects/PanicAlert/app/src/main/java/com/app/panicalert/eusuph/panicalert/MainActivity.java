package com.app.panicalert.eusuph.panicalert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    private Button addContacts;


    // components for sending sms
    private Button editSms;
    private EditText textPhoneNo;
    private EditText textSMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        addContacts = (Button) findViewById(R.id.addcontact);
        // Capture button clicks
        addContacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addContacts();
            }
        });

    }

    public void addContacts() {
        Intent myIntent = new Intent(MainActivity.this,
                settings.class);
        startActivity(myIntent);
    }

    public void editSms() {
        Intent objIntent = new Intent(MainActivity.this,
                settings.class);
        startActivity(objIntent);
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
