package com.example.logika;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rGroup;
    private RadioButton rbred;
    private RadioButton rbgreen;
    private RadioButton rbblue;
    private RadioButton rbyellow;
    private RadioButton rbcyan;
    private RadioButton rbmagenta;

    private CheckBox cba;
    private CheckBox cbb;
    private CheckBox cbc;
    private CheckBox cbd;

    private TextView tViewA;
    private TextView tViewB;
    private TextView tViewC;
    private TextView tViewD;

    private TextView tViewRandomA;
    private TextView tViewRandomB;
    private TextView tViewRandomC;
    private TextView tViewRandomD;

    private String ccred;
    private String ccgreen;
    private String ccblue;
    private String ccyellow;
    private String cccyan;
    private String ccmagenta;

    private RadioButton colors[];
    private CheckBox checkbox[];
    private TextView textview[];
    private String Colorcode[];
    private TextView random[];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        rGroup = findViewById(R.id.rg1);
        rbred = findViewById(R.id.red);
        rbgreen = findViewById(R.id.green);
        rbblue = findViewById(R.id.blue);
        rbyellow = findViewById(R.id.yellow);
        rbcyan = findViewById(R.id.cyan);
        rbmagenta = findViewById(R.id.magenta);

        cba = findViewById(R.id.checkBoxA);
        cbb = findViewById(R.id.checkBoxB);
        cbc = findViewById(R.id.checkBoxC);
        cbd = findViewById(R.id.checkBoxD);

        cba.setOnClickListener(this);
        cbb.setOnClickListener(this);
        cbc.setOnClickListener(this);
        cbd.setOnClickListener(this);

        rbred.setOnClickListener(this);
        rbgreen.setOnClickListener(this);
        rbblue.setOnClickListener(this);
        rbyellow.setOnClickListener(this);
        rbcyan.setOnClickListener(this);
        rbmagenta.setOnClickListener(this);

        rbred.setEnabled(false);
        rbgreen.setEnabled(false);
        rbblue.setEnabled(false);
        rbyellow.setEnabled(false);
        rbcyan.setEnabled(false);
        rbmagenta.setEnabled(false);

        tViewA = findViewById(R.id.TextViewA);
        tViewB = findViewById(R.id.TextViewB);
        tViewC = findViewById(R.id.TextViewC);
        tViewD = findViewById(R.id.TextViewD);

      //  RadioButton Colors[] = {rbred, rbgreen, rbblue, rbyellow, rbcyan, rbmagenta};

        //TextView textview[] = {tViewA, tViewB, tViewC, tViewD};







        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /*public void CheckboxStatus() {

        if (cba.isChecked() || cbb.isChecked() || cbc.isChecked() || cbd.isChecked()) {
            rbred.setEnabled(true);
            rbgreen.setEnabled(true);
            rbblue.setEnabled(true);
            rbyellow.setEnabled(true);
            rbcyan.setEnabled(true);
            rbmagenta.setEnabled(true);

        } else {
            rbred.setEnabled(false);
            rbgreen.setEnabled(false);
            rbblue.setEnabled(false);
            rbyellow.setEnabled(false);
            rbcyan.setEnabled(false);
            rbmagenta.setEnabled(false);

        }
    }
*/

    public void checkall() {

        CheckBox checkbox[] = {cba, cbb, cbc, cbd};
        RadioButton colors[] = {rbred, rbgreen, rbblue, rbyellow, rbcyan, rbmagenta};
        TextView textview[] = {tViewA, tViewB, tViewC, tViewD};
        String Colorcode[] = {ccred, ccgreen, ccblue, ccyellow, cccyan, ccmagenta};

        ccred = "#F44336";
        ccgreen = "#4CAF50";
        ccblue = "#2196F3";
        ccyellow = "#FFEB3B";
        cccyan = "#00BCD4";
        ccmagenta = "#E91E63";

        for (int i = 0; i < 4; i++) {

            if (checkbox[i].isChecked()) {
                for (int z = 0; z < 6; z++) {
                    colors[z].setEnabled(true);
                }

                for (int k = 0; k < 6; k++) {

                    if (colors[k].isChecked()) {

                        textview[i].setBackgroundColor(Color.parseColor(Colorcode[k]));

                    }
                }
            } else if (!checkbox[0].isChecked() && !checkbox[1].isChecked() && !checkbox[2].isChecked() && !checkbox[3].isChecked()) {

                rbred.setEnabled(false);
                rbgreen.setEnabled(false);
                rbblue.setEnabled(false);
                rbyellow.setEnabled(false);
                rbcyan.setEnabled(false);
                rbmagenta.setEnabled(false);
            }

        }
    }

    public void setRandomColors(){
        String Colorcode[] = {ccred, ccgreen, ccblue, ccyellow, cccyan, ccmagenta};
        TextView randomTextView[]={tViewRandomA,tViewRandomB,tViewRandomC,tViewRandomD};

        ccred = "#F44336";
        ccgreen = "#4CAF50";
        ccblue = "#2196F3";
        ccyellow = "#FFEB3B";
        cccyan = "#00BCD4";
        ccmagenta = "#E91E63";


        for (int b = 0; b < 4; b++) {

            Random rand = new Random();
            int randomint = rand.nextInt(6);
           // randomTextView[randomint].setBackgroundColor(ccred);

        }

    }

    public void Compare(){

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

    @Override
    public void onClick(View v) {
        checkall();
    }
}
