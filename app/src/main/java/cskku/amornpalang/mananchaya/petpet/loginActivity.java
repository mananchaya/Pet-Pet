package cskku.amornpalang.mananchaya.petpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class loginActivity extends AppCompatActivity {
    //Explicit
    private Button btnLoginButton,btnGuestButton,btnRegisterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLoginButton = (Button) findViewById(R.id.btnLogin);
        btnGuestButton = (Button) findViewById(R.id.btnGuest);
        btnRegisterButton = (Button) findViewById(R.id.btnRegister);

        // btnlogin controller
        btnLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this, selectOneActivity.class));
            }
        });

        // btnguest controller
        btnGuestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,selectOneActivity.class));

            }
        });

        //btnRegister controller
        btnRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(loginActivity.this,registerActivity.class));
            }
        });



    }//main mathon
}//main class
