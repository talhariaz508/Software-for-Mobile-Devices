package com.example.talhariaz.assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Csignup extends AppCompatActivity {
    RadioGroup r_group  ;
    RadioButton r_button;
    EditText mail ;
    EditText pass ;
    CheckBox checkbox ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csignup);
        r_group = (RadioGroup) findViewById(R.id.radioGroup);
        checkbox = (CheckBox) findViewById(R.id.checkBox);
        pass = (EditText) findViewById(R.id.password);
        mail = (EditText) findViewById(R.id.email);
    }
    public void on_register_click(View v) {


        if ((checkbox).isChecked()) {
            int radioId = r_group.getCheckedRadioButtonId();
            r_button = findViewById(radioId);
            Toast toast = Toast.makeText(getApplicationContext(), " EMAIL :" + mail.getText().toString() + "    PASSWORD :" + pass.getText().toString() + "    Gender :" + r_button.getText(), Toast.LENGTH_SHORT);
            toast.show();
        }
        else{
            Toast.makeText(getApplicationContext(),"User should accept the Terms and Conditions" , Toast.LENGTH_SHORT).show();

        }
    }
}
