package cskku.amornpalang.mananchaya.petpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class myDogActivity extends AppCompatActivity {
    //Explicit
    private Button btnAddMyDogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dog);

        btnAddMyDogButton = (Button) findViewById(R.id.btnAddMydog);

        btnAddMyDogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(myDogActivity.this,registerMyDogActivity.class));
            }
        });
    }//main method
}//main class
