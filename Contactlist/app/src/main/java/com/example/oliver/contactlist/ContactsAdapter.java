package com.example.oliver.contactlist;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.oliver.contactlist.models.Contact;

import java.util.ArrayList;

/**
 * Created by Oliver on 8/30/2015.
 */
public class ContactsAdapter extends ArrayAdapter<Contact> {
    public ContactsAdapter(Context context, ArrayList<Contact> contacts){
        super(context, 0, contacts);
    }

    @Override
    public int getCount(){ return 50; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        //Obtener la informacion del item en esta posicion

        //Verificar si una vista existente esta siendo utlizada, sino inflar la vista
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        TextView fullName = (TextView) convertView.findViewById(R.id.txtFullname);
        fullName.setText("Contact #" + (position + 1));

        return convertView;
    }

}
