package com.example.oliver.contactlist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class contact_details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_details);

        Intent receiverIntent = getIntent();
        TextView txt_name = (TextView) findViewById(R.id.txt_name);
        TextView txt_lastname = (TextView) findViewById(R.id.txt_lastname);
        TextView txt_email = (TextView) findViewById(R.id.txt_email);
        TextView txt_phone = (TextView) findViewById(R.id.txt_phone);

        ImageView image = (ImageView) findViewById(R.id.img_contact);

        txt_name.setText(receiverIntent.getStringExtra("name"));
        txt_lastname.setText(receiverIntent.getStringExtra("last_name"));
        txt_email.setText(receiverIntent.getStringExtra("email"));
        txt_phone.setText(receiverIntent.getStringExtra("phone"));

        image.setImageResource(R.mipmap.ic_launcher);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contac_details, menu);
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
