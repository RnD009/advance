package id.revolt.advance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class setup extends AppCompatActivity {
    private Switch sw1;
    private Switch sw2;
    private Switch sw3;
    boolean switch1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        this.sw1 = (Switch) findViewById(R.id.sw1);
        this.sw2 = (Switch) findViewById(R.id.sw2);
        this.sw3 = (Switch) findViewById(R.id.sw3);
        sw1.setChecked(switch1);

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if (sw1.isChecked()){
                   switch1 = true;
               }else {
                   switch1 = false;
               }
            }
        });

    }


    public void save(View view) {
        if (switch1==true){
            Intent sw1 = new Intent();
            sw1.setData(Uri.parse("?"));
            setup.this.setResult( 1, sw1);
            setup.this.finish();
        }else if (switch1==false){
            Intent sw1 = new Intent();
            sw1.setData(Uri.parse("/"));
            setup.this.setResult( 2, sw1);
            setup.this.finish();
        }
    }
}
