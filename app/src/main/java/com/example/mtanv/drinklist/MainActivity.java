package com.example.mtanv.drinklist;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    /* Drinks entered by user stored in ArrayList */
    ArrayList<String> list = new ArrayList<String>();

    /* Declaring an ArrayAdapter to set items to ListView */
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	    /* add button to the layout activity_main.xml */
        Button btn = findViewById(R.id.btnAdd);
	    
	    /* delete button to the layout activity_main.xml */
        Button btnDel = findViewById(R.id.btnDel);
	
	    /* Defining the ArrayAdapter to set items to ListView */
        adapter = new ArrayAdapter<String>(this, R.layout.item_option, list);
	
	    /* Defining a click event listener for the button Add */
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.txtItem);
                list.add(edit.getText().toString());
                edit.setText("");
                adapter.notifyDataSetChanged();
            }
        };
	            
	    /* Defining a click event listener for the button Delete*/
        OnClickListener listenerDel = new OnClickListener() {
            @Override
            public void onClick(View v) {
	    		/* Getting the checked items from the listview */
                SparseBooleanArray checkedItemPositions = getListView().getCheckedItemPositions();
                int itemCount = getListView().getCount();

                for (int i = itemCount - 1; i >= 0; i--) {
                    if (checkedItemPositions.get(i)) {
                        adapter.remove(list.get(i));
                    }
                }
                checkedItemPositions.clear();
                adapter.notifyDataSetChanged();


            }
        };
	
	    /* Setting the event listener for the add button */
        btn.setOnClickListener(listener);

        /**Setting the event listener for the delete button */
        btnDel.setOnClickListener(listenerDel);
	
	    /* Setting the adapter to the ListView */
        setListAdapter(adapter);
    }
}