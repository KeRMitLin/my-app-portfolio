package com.kermitlin.appportfolio;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button bt1, bt2, bt3, bt4, bt5, bt6;
    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListeners();
    }

    private void findViews() {
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
    }

    private void setListeners() {
        bt1.setOnClickListener(bt_1);
        bt2.setOnClickListener(bt_2);
        bt3.setOnClickListener(bt_3);
        bt4.setOnClickListener(bt_4);
        bt5.setOnClickListener(bt_5);
        bt6.setOnClickListener(bt_6);
    }

    private Button.OnClickListener bt_1 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt1.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

    private Button.OnClickListener bt_2 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt2.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

    private Button.OnClickListener bt_3 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt3.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

    private Button.OnClickListener bt_4 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt4.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

    private Button.OnClickListener bt_5 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt5.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

    private Button.OnClickListener bt_6 = new Button.OnClickListener() {
        public void onClick(View v) {
            // TODO Auto-generated method stub
            Toast.makeText(context, "This button will launch " + bt6.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    };

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
