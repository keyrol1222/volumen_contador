package com.example.volumen_contador;

import androidx.appcompat.app.AppCompatActivity;

import android.app.usage.UsageEvents;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView count;
int cuenta =0;
TextView notouch;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count = findViewById(R.id.count);
        notouch=findViewById(R.id.notouch);

    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int x,y;
        x = event.getAction();
        y = event.getKeyCode();
        switch (y){

            case KeyEvent.KEYCODE_VOLUME_UP:
            {if(KeyEvent.ACTION_UP==x){
                 cuenta++;
                 String res = String.valueOf(cuenta);
                 count.setText(res);
            }

            }
            break;
            case KeyEvent.KEYCODE_VOLUME_DOWN:{

                if(KeyEvent.ACTION_DOWN==x){
                    cuenta--;
                    String res = String.valueOf(cuenta);
                    count.setText(res);
                }
            }
             break;
        }
        return super.dispatchKeyEvent(event);
    }

    public boolean onTouchEvent(MotionEvent event) {
        notouch.setText("no se puede usar touch, solo sonido");
        return super.onTouchEvent(event);
    }

}

