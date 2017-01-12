package cskku.amornpalang.mananchaya.petpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class selectOneActivity extends AppCompatActivity {

    //Explicit
    private Button btnMydogButton,btnStrayDogButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_one);
        btnMydogButton = (Button) findViewById(R.id.btnMyDog);
        btnStrayDogButton = (Button) findViewById(R.id.btnStrayDog);
        // btn My Dog Controller
        btnMydogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(selectOneActivity.this,myDogActivity.class));
            }
        });

        //btn Stray Dog Controller
        btnStrayDogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(selectOneActivity.this,strayDogActivity.class));
            }
        });

    }//main method
}//main class
