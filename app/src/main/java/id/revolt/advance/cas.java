package id.revolt.advance;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStream;


public class cas extends AppCompatActivity {
    OutputStream mmOutputStream;

    private Button oke;
    private TextView pswdx;


    private View.OnClickListener oke1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent as = new Intent();
            as.setData(Uri.parse(cas.this.pswdx.getText().toString()));
            Toast.makeText(cas.this, cas.this.pswdx.getText().toString(), Toast.LENGTH_SHORT).show();
            cas.this.setResult(-1, as);
            cas.this.finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cas);

        this.oke = (Button) findViewById(R.id.btn_start);
        this.pswdx = (TextView) findViewById(R.id.edit1);
        this.oke.setOnClickListener(this.oke1);

    }

}

