package com.app.panicalert.eusuph.panicalert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class settings extends Activity {

    private EditText phoneNumber;
    private EditText contact2;
    private EditText contact3;
    private Button save;
    private Button editSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from new_activity.xml
        setContentView(R.layout.activity_settings);

        /*
         * registering EditText components
         */

        phoneNumber = (EditText) findViewById(R.id.securityNumber1);
        contact2 = (EditText) findViewById(R.id.contactNumber2);
        contact3 = (EditText) findViewById(R.id.contactNumber2);

        /*
         * registering the Button components
         */

        save = (Button) findViewById(R.id.saveButton);
        editSms = (Button) findViewById(R.id.editSMS);

        editSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideToSms();
            }
        });
    }

    public void slideToSms() {
        Intent my_intent = new Intent(settings.this, SettingsActivity.class);
        startActivity(my_intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
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
