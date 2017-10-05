package com.gregoryzuroff.hw1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeScreen extends Activity implements Button.OnClickListener{

    private Button buttonLogIn;
    private EditText editTextUsername;
    private EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

        buttonLogIn = (Button) findViewById(R.id.buttonLogIn);
        editTextUsername = (EditText) findViewById(R.id.editTextUsername);
        editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        buttonLogIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        if(view == buttonLogIn){
            if(editTextUsername.getText().toString().equals("ross") && editTextPassword.getText().toString().equals("to426")){
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
            }
            else{
                Toast.makeText(this, "Access Denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
