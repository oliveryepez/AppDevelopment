package com.example.oliver.contactlist;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.oliver.contactlist.models.Contact;

import org.json.JSONArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class contact_list extends ListActivity {

    public static int CONTACT_NUMBER = 50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayList<Contact> arrayOfContacts = new ArrayList<Contact>();
        ContactsAdapter adapter = new ContactsAdapter(this, arrayOfContacts);


        ListView listview = getListView();
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListAdapter adapter = (ListAdapter) parent.getAdapter();
                Intent intent = new Intent(view.getContext(), contact_details.class);
                String lastName = Integer.toString(position + 1);
                String phone = Integer.toString(position++) + Integer.toString(position++) + Integer.toString(position++) + " - " +
                         Integer.toString(position++) + Integer.toString(position++) + Integer.toString(position++);


                intent.putExtra("name", "Contact");
                intent.putExtra("last_name", lastName);
                intent.putExtra("email", "contact_" + lastName + "@ulacit.com");
                intent.putExtra("phone", phone);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact_list, menu);
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
