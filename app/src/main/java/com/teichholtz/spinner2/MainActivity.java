package com.teichholtz.spinner2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner1, spinner2;
    private Button btnSubmit;
    public  TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }


    public void addListenerOnSpinnerItemSelection() {
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        t = (TextView)findViewById(R.id.textView);
        t.setText("some static text");

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
                // get the value of what was selected
                String Selected;
                int position = spinner1.getSelectedItemPosition();
                String combined;
                combined = "Position " + Integer.toString(position);
                Toast.makeText(MainActivity.this,combined,Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,Integer.toString(position),Toast.LENGTH_SHORT).show();

                Selected = String.valueOf(spinner1.getSelectedItem());

                if (Selected.equals("Italy"))
                        t.setText("I was there");
                else
                        t.setText("Nope, not Italy");

                //t.setText(Selected);

            }

        });
    }



}
