package id.revolt.advance;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.OutputStream;


public class cas extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cas);


    }


    public void start(View view) {

        Toast.makeText(cas.this, "Start Calibration, Wait a Moment", Toast.LENGTH_LONG).show();
    }
}
