package edu.imu.reader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Welcome extends AppCompatActivity {
    private EditText name;
    private EditText pass;
    private Button  login;
    private Button  sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        name = findViewById(R.id.usernameEV);
        pass = findViewById(R.id.passwordEV);
        login = findViewById(R.id.loginbt);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname,upass;
                uname = name.getText().toString();
                upass = pass.getText().toString();
                Log.i("username:",uname);
                Log.i("password",upass);

            }
        });
    }
}
