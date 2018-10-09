package id.revolt.advance;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;


public class cas extends AppCompatActivity {

    private Button oke;
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;


    private View.OnClickListener oke1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            if (cb1.isChecked() && cb1.isChecked() && cb1.isChecked() &&){
//
//
//            }
            Intent as = new Intent();
            as.setData(Uri.parse("<"));
            Toast.makeText(cas.this, "Wait a Moment", Toast.LENGTH_SHORT).show();
            cas.this.setResult( 1, as);
            cas.this.finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cas);

        this.oke = (Button) findViewById(R.id.btn_start);
        this.cb1 = (CheckBox) findViewById(R.id.cb1);
        this.cb2 = (CheckBox) findViewById(R.id.cb2);
        this.cb3 = (CheckBox) findViewById(R.id.cb3);

        this.oke.setOnClickListener(this.oke1);

    }

}
