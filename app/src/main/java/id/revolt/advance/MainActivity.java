package id.revolt.advance;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

//    Button button;

    public Vibrator h;

    //button up-down
    private ImageButton a1;
    private ImageButton a2;
    private ImageButton a3;
    private ImageButton a4;
    private ImageButton a5;
    private ImageButton a6;
    private ImageButton a7;
    private ImageButton a8;
    private ImageButton a9;
    private ImageButton a10;
    private ImageButton a11;
    private ImageButton a12;
    private ImageButton a13;
    private ImageButton a14;
    private ToggleButton btn_bt;

    private TextView e;

    BluetoothAdapter mBluetoothAdapter;
    BluetoothDevice mmDevice;
    InputStream mmInputStream;
    OutputStream mmOutputStream;
    BluetoothSocket mmSocket;
    private Set<BluetoothDevice> pairedDevices;

    volatile boolean stopWorker;

    private View.OnTouchListener ta1 = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
                    MainActivity.this.a7.setEnabled(false);
                    MainActivity.this.a8.setEnabled(false);
                    MainActivity.this.a9.setEnabled(false);
                    MainActivity.this.a10.setEnabled(false);
                    MainActivity.this.a11.setEnabled(false);
                    MainActivity.this.a12.setEnabled(false);
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa1();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
                    MainActivity.this.a6.setEnabled(true);
                    MainActivity.this.a7.setEnabled(true);
                    MainActivity.this.a8.setEnabled(true);
                    MainActivity.this.a9.setEnabled(true);
                    MainActivity.this.a10.setEnabled(true);
                    MainActivity.this.a11.setEnabled(true);
                    MainActivity.this.a12.setEnabled(true);
                    MainActivity.this.a13.setEnabled(true);
                    MainActivity.this.a14.setEnabled(true);
                    try {
                        MainActivity.this.fa15();
                        break;
                    }catch (IOException e2){
                        e2.printStackTrace();
                        break;
                    }
            }

            return true;
        }
    };

//    @Override
    @SuppressLint("WrongConstant")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.a1 = (ImageButton) findViewById(R.id.front_left_up);
        this.a2 = (ImageButton) findViewById(R.id.front_right_up);
        this.a3 = (ImageButton) findViewById(R.id.front_left_down);
        this.a4 = (ImageButton) findViewById(R.id.front_right_down);
        this.a5 = (ImageButton) findViewById(R.id.rear_left_up);
        this.a6 = (ImageButton) findViewById(R.id.rear_right_up);
        this.a7 = (ImageButton) findViewById(R.id.rear_left_down);
        this.a8 = (ImageButton) findViewById(R.id.rear_right_down);
        this.a9 = (ImageButton) findViewById(R.id.front_all_up);
        this.a10 = (ImageButton) findViewById(R.id.front_all_down);
        this.a11 = (ImageButton) findViewById(R.id.rear_all_up);
        this.a12 = (ImageButton) findViewById(R.id.rear_all_down);
        this.a13 = (ImageButton) findViewById(R.id.all_up);
        this.a14 = (ImageButton) findViewById(R.id.all_down);
        this.e = (TextView) findViewById(R.id.e);
        this.btn_bt = (ToggleButton) findViewById(R.id.tg_bt);
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (this.mBluetoothAdapter == null) {
            Toast.makeText(this, "No bluetooth adapter available", 0).show();
        }
        if (!this.mBluetoothAdapter.isEnabled()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 0);
        }

        this.btn_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (MainActivity.this.btn_bt.isChecked()){
                        MainActivity.this.a1.setEnabled(true);
                        MainActivity.this.a2.setEnabled(true);
                        MainActivity.this.a3.setEnabled(true);
                        MainActivity.this.a4.setEnabled(true);
                        MainActivity.this.a5.setEnabled(true);
                        MainActivity.this.a6.setEnabled(true);
                        MainActivity.this.a7.setEnabled(true);
                        MainActivity.this.a8.setEnabled(true);
                        MainActivity.this.a9.setEnabled(true);
                        MainActivity.this.a10.setEnabled(true);
                        MainActivity.this.a12.setEnabled(true);
                        MainActivity.this.a13.setEnabled(true);
                        MainActivity.this.a14.setEnabled(true);
                        MainActivity.this.e.setEnabled(true);
                        try {
                            MainActivity.this.startActivityForResult(new Intent(MainActivity.this, list.class), 3);
                            return;
                        }catch (Exception e){
                            e.printStackTrace();
                            return;
                        }
                    }
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
                    MainActivity.this.a7.setEnabled(false);
                    MainActivity.this.a8.setEnabled(false);
                    MainActivity.this.a9.setEnabled(false);
                    MainActivity.this.a10.setEnabled(false);
                    MainActivity.this.a11.setEnabled(false);
                    MainActivity.this.a12.setEnabled(false);
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    //MainActivity.this.Z();
                    new Handler().postDelayed(new Runnable() {
                        public void run() {
                            try {
                                MainActivity.this.closeBT();
                                MainActivity.this.e.setText(BuildConfig.FLAVOR);
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    }, 1000);
                    MainActivity.this.e.setEnabled(false);
                } catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        });

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


    void fa1() throws IOException {
        this.mmOutputStream.write("[".getBytes());
    }
    void fa15() throws IOException {
        this.mmOutputStream.write("s".getBytes());
    }

    @SuppressLint("WrongConstant")
    void closeBT() throws IOException{
        this.e.setText(BuildConfig.FLAVOR);
        this.stopWorker = true;
        this.mmOutputStream.close();
        this.mmInputStream.close();
        this.mmSocket.close();
        Toast.makeText(this, "Bluetooth Disconnect", 0).show();
        this.e.setText(BuildConfig.FLAVOR);
    }

}
