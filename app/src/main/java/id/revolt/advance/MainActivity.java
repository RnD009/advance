package id.revolt.advance;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button button;

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
                popupMenu.getMenuInflater().inflate(R.menu.main_menu, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.pilihan1:
                                Toast.makeText(MainActivity.this, "Bluetooth Must Connect", 0).show();
                                return true;
                            case R.id.pilihan2:
                                MainActivity.this.startActivityForResult(new Intent(MainActivity.this, intruksi.class), 4);

                            default:
                                return false;
                        }


                    }
                });

                popupMenu.show();
            }
        });

    }

}
