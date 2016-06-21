package mx.yellowme.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mx.yellowme.util.Util;

public class LoginActivity extends AppCompatActivity {

    private MyappApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        app = (MyappApplication) getApplication();
    }

    public void doLogin(View view){
        app.registerLogIn();
        Util.sendAndFinish(this, MainActivity.class);
    }
}
