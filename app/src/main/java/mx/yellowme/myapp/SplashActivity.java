package mx.yellowme.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    private MyappApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        app = (MyappApplication) getApplicationContext();


        if(app.isLoginStart()){

        }else{

        }
    }
}
