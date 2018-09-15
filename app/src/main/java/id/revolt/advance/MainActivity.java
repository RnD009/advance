package id.revolt.advance;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

//    Button button;

//    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                PopupMenu popupMenu = new PopupMenu(MainActivity.this, button);
//                popupMenu.getMenuInflater().inflate(R.menu.main_menu, popupMenu.getMenu());
//
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        switch (item.getItemId()){
//                            case R.id.pilihan1:
//                                Toast.makeText(MainActivity.this, "Bluetooth Must Connect", 0).show();
//                                return true;
//                            case R.id.pilihan2:
//                                MainActivity.this.startActivityForResult(new Intent(MainActivity.this, intruksi.class), 4);
//
//                            default:
//                                return false;
//                        }
//
//
//                    }
//                });
//
//                popupMenu.show();
//            }
//        });

    }

    //menu
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cpass) {
            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, changepassword.class), 4);
        } else if (id == R.id.nav_cas) {
            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, cas.class), 4);
        } else if (id == R.id.nav_operation) {
            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, intruksi.class), 4);
        } else if (id == R.id.nav_setup) {
            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, setup.class), 4);
        } else if (id == R.id.nav_about) {
            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, about.class), 4);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




}
