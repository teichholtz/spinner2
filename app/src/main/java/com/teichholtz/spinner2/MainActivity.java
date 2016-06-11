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
        t.setText("Pick a room, any room");

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                //Toast.makeText(MainActivity.this,
                //        "OnClickListener : " +
                //                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
                //        Toast.LENGTH_SHORT).show();
                // get the value of what was selected
                String Selected;
                int position = spinner1.getSelectedItemPosition();
                String combined;
                combined = "Position " + Integer.toString(position);
                //Toast.makeText(MainActivity.this,combined,Toast.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this,Integer.toString(position),Toast.LENGTH_SHORT).show();
                combined=GetLocation(position);
                Selected = String.valueOf(spinner1.getSelectedItem());

                t.setText(combined);

                //if (Selected.equals("Italy"))
                //        t.setText("I was there");
                //else
                //        t.setText("Nope, not Italy");

                //t.setText(Selected);

            }

        });
    }

    public java.lang.String GetLocation(int position) {
        String combined;
        combined = "Position from routine " + Integer.toString(position);
        //Toast.makeText(MainActivity.this,combined,Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivity.this,Integer.toString(position),Toast.LENGTH_SHORT).show();


        // declares an array of strings
        String[] confLocArray;

        // allocates memory for 29 strings (we have that many conference rooms!!)
        confLocArray = new String[30];

        // initialize the elements
        //Copley
	confLocArray[9] = "First floor near Event Production" ;
	//Boylston
        confLocArray[5] = "First floor near Event Production";
	//Atlantic
        confLocArray[0] = "Second floor, Tech area";
	//Sunset
        confLocArray[25] = "Second floor, small room in tech area";
	// Rodeo
        confLocArray[23] = "Second floor, near Corp IT";
	// Bedford
        confLocArray[2] = "Second floor, small room next to Corp IT";
	// Bourbon
        confLocArray[4] = "Second floor near little steps, Window looks out on Channel Center";
	// The Library
        confLocArray[26] = "Second floor, middle of office,Window looks out on A street";
	// Broadway
        confLocArray[6] = "Second floor, by Cafe area, windows looks out to Channel Center";
	// Pike
        confLocArray[22] = "Second floor, small room by Cafe area, ";
	// Market
        confLocArray[15] = "Second floor, by Cafe area, windows look out on A street";
	    // Filmore
        confLocArray[10] = "Second floor in the annex";
	// Tremont 
        confLocArray[27] = "Third floor, hidden away in the corner by AP/AR";
	// Capri
        confLocArray[7] = "Third floor Mothers room";
	// Beale
        confLocArray[1] = "Third floor, small room by Talent";
	// Lombard
        confLocArray[13] = "Third floor, small room by Talent";
	// Bleeker
        confLocArray[3] = "Third floor, small room by Talent";
	// Oak
        confLocArray[19] = "Third floor, big room by Talent";
	// Spring
        confLocArray[24] = "Third floor, small room by Talent (next to Oak)";
	// Newbury
        confLocArray[18] = "Third floor, by reception";
	// Peachtree
        confLocArray[21] = "Third floor, by reception";
	// Mulholland
        confLocArray[17] = "Third floor, by cafe, windows look out on A street";
	// Ocean
        confLocArray[20] = "Third floor, by cafe, small room next to Mulholland";
	// Madison
        confLocArray[14] = "Third floor, by cafe, windows look out on Channel Center";
	//Michigan
        confLocArray[16] = "Third Floor, annex, windows look out on A street";
	// Greenwich
        confLocArray[11] = "Third floor, annex, small room, windows look out on A street";
	// LakeShore
        confLocArray[12] = "Third floor annex";
	// Charles
        confLocArray[8] = "Third floor annex";
        confLocArray[29] = "Not assigned.";
	
	return confLocArray[position];
}
}