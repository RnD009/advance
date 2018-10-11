package id.revolt.advance;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class header extends AppCompatActivity {
//    private Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header);

//        this.sw = (Switch) findViewById(R.id.switch3);
//
//        this.sw.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (sw.isChecked()){
//                    Intent sw1 = new Intent();
//                    sw1.setData(Uri.parse("?"));
//                    startActivityForResult(sw1, 5);
//                    header.this.setResult( 1, sw1);
//                    header.this.finish();
//                    //Toast.makeText(header.this, "Compressor ON", Toast.LENGTH_SHORT).show();
//                }else {
//                    //Toast.makeText(header.this, "Compressor OFF", Toast.LENGTH_SHORT).show();
//                    Intent sw2 = new Intent();
//                    sw2.setData(Uri.parse("/"));
//                    header.this.setResult( 3, sw2);
//                    header.this.finish();
//                }
//            }
//        });
    }
}
