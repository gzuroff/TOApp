package com.gregoryzuroff.hw1;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AddInventory extends Activity implements OnClickListener{

    private Button buttonHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_inventory);

        buttonHome = (Button) findViewById(R.id.buttonHome);
        buttonHome.setOnClickListener(this);
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

    @Override
    public void onClick(View view) {
        if(view == buttonHome){
            Intent intentHome = new Intent(this, HomeScreen.class);
            this.startActivity(intentHome);
        }
    }
}
