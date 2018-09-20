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
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;


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

    String d;
    private TextView e;
    boolean fail;

    BluetoothAdapter mBluetoothAdapter;
    BluetoothDevice mmDevice;
    InputStream mmInputStream;
    OutputStream mmOutputStream;
    BluetoothSocket mmSocket;
    private Set<BluetoothDevice> pairedDevices;
    byte[] readBuffer;
    int readBufferPosition;
    private ImageButton scan;

    volatile boolean stopWorker;
    boolean sukses;

    private View.OnTouchListener ta1 = new View.OnTouchListener() {
        @SuppressLint({"WrongConstant", "PrivateResource"})
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

    private View.OnTouchListener ta2 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
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
                        MainActivity.this.fa2();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
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

    private View.OnTouchListener ta3 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
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
                        MainActivity.this.fa3();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
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

    private View.OnTouchListener ta4 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
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
                        MainActivity.this.fa4();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
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

    private View.OnTouchListener ta5 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
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
                        MainActivity.this.fa5();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
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

    private View.OnTouchListener ta6 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
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
                        MainActivity.this.fa6();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
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

    private View.OnTouchListener ta7 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
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
                        MainActivity.this.fa7();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
                    MainActivity.this.a6.setEnabled(true);
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

    private View.OnTouchListener ta8 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
                    MainActivity.this.a7.setEnabled(false);
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
                        MainActivity.this.fa8();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
                    MainActivity.this.a6.setEnabled(true);
                    MainActivity.this.a7.setEnabled(true);
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

    private View.OnTouchListener ta9 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
                    MainActivity.this.a7.setEnabled(false);
                    MainActivity.this.a8.setEnabled(false);
                    MainActivity.this.a10.setEnabled(false);
                    MainActivity.this.a11.setEnabled(false);
                    MainActivity.this.a12.setEnabled(false);
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa9();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
                    MainActivity.this.a6.setEnabled(true);
                    MainActivity.this.a7.setEnabled(true);
                    MainActivity.this.a8.setEnabled(true);
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

    private View.OnTouchListener ta10 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
                    MainActivity.this.a1.setEnabled(false);
                    MainActivity.this.a2.setEnabled(false);
                    MainActivity.this.a3.setEnabled(false);
                    MainActivity.this.a4.setEnabled(false);
                    MainActivity.this.a5.setEnabled(false);
                    MainActivity.this.a6.setEnabled(false);
                    MainActivity.this.a7.setEnabled(false);
                    MainActivity.this.a8.setEnabled(false);
                    MainActivity.this.a9.setEnabled(false);
                    MainActivity.this.a11.setEnabled(false);
                    MainActivity.this.a12.setEnabled(false);
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa10();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
                    MainActivity.this.a1.setEnabled(true);
                    MainActivity.this.a2.setEnabled(true);
                    MainActivity.this.a3.setEnabled(true);
                    MainActivity.this.a4.setEnabled(true);
                    MainActivity.this.a5.setEnabled(true);
                    MainActivity.this.a6.setEnabled(true);
                    MainActivity.this.a7.setEnabled(true);
                    MainActivity.this.a8.setEnabled(true);
                    MainActivity.this.a9.setEnabled(true);
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

    private View.OnTouchListener ta11 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
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
                    MainActivity.this.a12.setEnabled(false);
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa11();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
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

    private View.OnTouchListener ta12 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
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
                    MainActivity.this.a13.setEnabled(false);
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa12();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
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
                    MainActivity.this.a11.setEnabled(true);
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

    private View.OnTouchListener ta13 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
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
                    MainActivity.this.a14.setEnabled(false);
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa13();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
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
                    MainActivity.this.a11.setEnabled(true);
                    MainActivity.this.a12.setEnabled(true);
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

    private View.OnTouchListener ta14 = new View.OnTouchListener() {
        @SuppressLint("WrongConstant")
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()){
                case R.styleable.View_android_theme:
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
                    long[] pattern = new long[]{0, 1000, 0, 1000, 0, 1000, 0, 1000, 0};
                    MainActivity.this.h = (Vibrator) MainActivity.this.getApplicationContext().getSystemService("vibrator");
                    MainActivity.this.h.vibrate(pattern, -1);
                    try {
                        MainActivity.this.fa14();
                        break;
                    }catch (IOException e){
                        e.printStackTrace();
                        break;
                    }
                case R.styleable.View_android_focusable:
                    MainActivity.this.h.cancel();
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
                    MainActivity.this.a11.setEnabled(true);
                    MainActivity.this.a12.setEnabled(true);
                    MainActivity.this.a13.setEnabled(true);
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


    Thread workerThread;

    //onDestroy
    @SuppressLint("WrongConstant")
    public void onDestroy(){
        super.onDestroy();
        if (this.sukses){
            Toast.makeText(this, "destroy discon", 0).show();
            return;
        }
        try {
            Z();
        } catch (IOException e){
            e.printStackTrace();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    MainActivity.this.closeBT();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }, 1000);

    }

//    @Override
    @SuppressLint("WrongConstant")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        this.sukses = true;
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
                    MainActivity.this.Z();
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

    //end onCreate



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


    @SuppressLint("WrongConstant")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cpass) {
            if (MainActivity.this.sukses){
                Toast.makeText(MainActivity.this, "Bluetooth Must Connect", 0).show();
                return true;
            }
            try {
                MainActivity.this.sandi();
                MainActivity.this.startActivityForResult(new Intent(MainActivity.this, changepassword.class), 2);
                return true;
            }catch (IOException e){
                e.printStackTrace();
                return true;
            }
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

    //onActifityResult
    @SuppressLint("WrongConstant")
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == 1){
            if (resultCode == -1){
                try {
                    this.d = data.getData().toString();
                    Toast.makeText(this, data.getData().toString(), 0).show();
                    uji2();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            if (requestCode == 0){
                try {
                    closeBT();
                    this.btn_bt.setChecked(false);
                }catch (IOException e2){
                    e2.printStackTrace();
                }
            }
        } else if (requestCode == 2){
            if (resultCode == -1){
                try {
                    this.a1.setEnabled(false);
                    this.a2.setEnabled(false);
                    this.a3.setEnabled(false);
                    this.a4.setEnabled(false);
                    this.a5.setEnabled(false);
                    this.a6.setEnabled(false);
                    this.a7.setEnabled(false);
                    this.a8.setEnabled(false);
                    this.a9.setEnabled(false);
                    this.a10.setEnabled(false);
                    this.a11.setEnabled(false);
                    this.a12.setEnabled(false);
                    this.a13.setEnabled(false);
                    this.a14.setEnabled(false);
                    this.e.setEnabled(false);
                    this.d = data.getData().toString();
                    uji2();
                    Toast.makeText(this, "wait 4 second", 0).show();
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                MainActivity.this.save();
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
                                MainActivity.this.a11.setEnabled(true);
                                MainActivity.this.a12.setEnabled(true);
                                MainActivity.this.a13.setEnabled(true);
                                MainActivity.this.a14.setEnabled(true);
                                MainActivity.this.e.setEnabled(true);
                            }catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    }, 4000);
                }catch (IOException e22){
                    e22.printStackTrace();
                }
            }
            if (resultCode == 0){
                try {
                    gagal();
                }catch (IOException e222){
                    e222.printStackTrace();
                }
            }
        } else if (requestCode != 3){
        } else {
            if (resultCode == -1){
                try {
                    this.d = data.getData().toString();
                    findBT2();
                    openBT();
                } catch (IOException e2222){
                    e2222.printStackTrace();
                }
            }else if(resultCode == 0){
                this.btn_bt.setChecked(false);
            }
        }
    }

    @SuppressLint("WrongConstant")
    void findBT2(){
        Set<BluetoothDevice> pairedDevices = this.mBluetoothAdapter.getBondedDevices();
        if (pairedDevices.size() > 0){
            for (BluetoothDevice device : pairedDevices){
                if (device.getName().equals("REVOLT")){
                    this.mmDevice = device;
                    Log.v("ArduinoBT", "findBT found device named" + this.mmDevice.getName());
                    Log.v("ArduinoBT", "device address is" +this.mmDevice.getAddress());
                    break;
                }
            }
        }
        Toast.makeText(this, "Find Bluetooth", 0).show();
    }

    @SuppressLint("WrongConstant")
    void openBT() throws IOException {
        this.mmSocket = this.mmDevice.createRfcommSocketToServiceRecord (UUID.fromString("00001101-0000-1000-8000-00805f9b34fb"));
        this.mBluetoothAdapter.cancelDiscovery();
        try {
            this.mmSocket.connect();
        }catch (IOException e){
            Toast.makeText(this, "Bluetooth Connected failed", 0).show();
            this.fail = true;
            this.btn_bt.setChecked(false);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
        if (!this.fail){
            this.sukses = false;
            this.mmOutputStream = this.mmSocket.getOutputStream();
            this.mmInputStream = this.mmSocket.getInputStream();
            beginListenForData();
            Toast.makeText(this, "Bluetooth Connected", 0).show();
            startActivityForResult(new Intent(this, login.class), 1);
        }
    }

    void beginListenForData(){
        this.a1.setOnTouchListener(this.ta1);
        this.a2.setOnTouchListener(this.ta2);
        this.a3.setOnTouchListener(this.ta3);
        this.a4.setOnTouchListener(this.ta4);
        this.a5.setOnTouchListener(this.ta5);
        this.a6.setOnTouchListener(this.ta6);
        this.a7.setOnTouchListener(this.ta7);
        this.a8.setOnTouchListener(this.ta8);
        this.a9.setOnTouchListener(this.ta9);
        this.a10.setOnTouchListener(this.ta10);
        this.a11.setOnTouchListener(this.ta11);
        this.a12.setOnTouchListener(this.ta12);
        this.a13.setOnTouchListener(this.ta13);
        this.a14.setOnTouchListener(this.ta14);
        final Handler handler = new Handler();
        this.stopWorker = false;
        this.readBufferPosition = 0;
        this.readBuffer = new byte[1024];
        this.workerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted() && !MainActivity.this.stopWorker){
                    try {
                        int byteAvailable = MainActivity.this.mmInputStream.available();
                        if (byteAvailable > 0){
                            byte[] packetBytes = new byte[byteAvailable];
                            MainActivity.this.mmInputStream.read(packetBytes);
                            for (int i = 0; i< byteAvailable; i++){
                                byte b = packetBytes[i];
                                if (b == (byte) 10){
                                    byte[] encodedBytes = new byte[MainActivity.this.readBufferPosition];
                                    System.arraycopy(MainActivity.this.readBuffer, 0, encodedBytes,0, encodedBytes.length);
                                    final String data = new String(encodedBytes, "US-ASCII");
                                    MainActivity.this.readBufferPosition = 0;
                                    handler.post(new Runnable() {
                                        @Override
                                        public void run() {MainActivity.this.e.setText(data); }
                                    });
                                } else {
                                    byte[] bArr = MainActivity.this.readBuffer;
                                    MainActivity mainActivity = MainActivity.this;
                                    int i2 = mainActivity.readBufferPosition;
                                    mainActivity.readBufferPosition = i2 + 1;
                                    bArr[i2] = b;
                                }
                            }
                        }
                    }catch (IOException e){
                        MainActivity.this.stopWorker = true;
                    }
                }
            }
        });
        this.workerThread.start();
    }

    void fa1() throws IOException {
        this.mmOutputStream.write("!".getBytes());
    }

    void fa2() throws IOException {
        this.mmOutputStream.write("@".getBytes());
    }

    void fa3() throws IOException {
        this.mmOutputStream.write("|".getBytes());
    }

    void fa4() throws IOException {
        this.mmOutputStream.write("$".getBytes());
    }

    void fa5() throws IOException {
        this.mmOutputStream.write("%".getBytes());
    }

    void fa6() throws IOException {
        this.mmOutputStream.write("^".getBytes());
    }

    void fa7() throws IOException {
        this.mmOutputStream.write("&".getBytes());
    }

    void fa8() throws IOException {
        this.mmOutputStream.write("*".getBytes());
    }

    void fa9() throws IOException {
        this.mmOutputStream.write("(".getBytes());
    }

    void fa10() throws IOException {
        this.mmOutputStream.write(")".getBytes());
    }

    void fa11() throws IOException {
        this.mmOutputStream.write("-".getBytes());
    }

    void fa12() throws IOException {
        this.mmOutputStream.write("_".getBytes());
    }

    void fa13() throws IOException {
        this.mmOutputStream.write("=".getBytes());
    }

    void fa14() throws IOException {
        this.mmOutputStream.write("+".getBytes());
    }

    void fa15() throws IOException {
        this.mmOutputStream.write("s".getBytes());
    }

    void Z() throws IOException {
        this.mmOutputStream.write("9".getBytes());
    }

    void uji2() throws IOException {
        this.mmOutputStream.write(this.d.getBytes());
    }

    void sandi() throws IOException {
        this.mmOutputStream.write("Z".getBytes());
    }

    void save() throws IOException {
        this.mmOutputStream.write("x".getBytes());
    }

    void gagal() throws IOException {
        this.mmOutputStream.write("y".getBytes());
    }

    void back() throws IOException {
        this.mmOutputStream.write("w".getBytes());
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
