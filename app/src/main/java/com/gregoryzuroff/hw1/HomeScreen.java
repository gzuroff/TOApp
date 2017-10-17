package com.gregoryzuroff.hw1;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeScreen extends Activity implements Button.OnClickListener {

    private Button buttonInventory;
    private Button buttonAddInventory;
    private Button buttonLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        buttonInventory = (Button) findViewById(R.id.inventoryButton);
        buttonAddInventory = (Button) findViewById(R.id.addInvetoryButton);
        buttonLogOut = (Button) findViewById(R.id.logoutButton);

        buttonInventory.setOnClickListener(this);
        buttonAddInventory.setOnClickListener(this);
        buttonLogOut.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mainMenuInflator = getMenuInflater();
        mainMenuInflator.inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.menuHome){
            Intent intentHome = new Intent(this, HomeScreen.class);
            this.startActivity(intentHome);
        }
        else if(item.getItemId() == R.id.menuInventory){
            Intent intentInventory = new Intent(this, InventoryCheckScreen.class);
            this.startActivity(intentInventory);
        }
        else if(item.getItemId() == R.id.menuAddInventory){
            Intent intentAddInventory = new Intent(this, AddInventory.class);
            this.startActivity(intentAddInventory);
        }
        else if(item.getItemId() == R.id.menuLogOut) {
            Intent intentLogOut = new Intent(this, WelcomeScreen.class);
            this.startActivity(intentLogOut);
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick(View view){

        if(view == buttonInventory){
            Intent intentInventory = new Intent(this, InventoryCheckScreen.class);
            this.startActivity(intentInventory);
        }
        else if(view == buttonAddInventory){
            Intent intentAddInventory = new Intent(this, AddInventory.class);
            this.startActivity(intentAddInventory);
        }
        else if(view == buttonLogOut){
            Intent intentLogOut = new Intent(this, WelcomeScreen.class);
            this.startActivity(intentLogOut);
        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
