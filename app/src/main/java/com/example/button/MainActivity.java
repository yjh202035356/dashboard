package com.example.button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter);

        final TextView tv = (TextView) findViewById(R.id.tvNum);
        Button bDec = (Button) findViewById(R.id.bDec);
        Button bInc = (Button) findViewById(R.id.bInc);
        final TextView tv2 = (TextView) findViewById(R.id.tvNum2);
        Button bDec2 = (Button) findViewById(R.id.bDec2);
        Button bInc2 = (Button) findViewById(R.id.bInc2);

        Button.OnClickListener listener = new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(tv.getText().toString());
                int num2 = Integer.parseInt(tv2.getText().toString());
                switch (v.getId()){



                    case R.id.bDec :
                        num--;
                        break;

                    case R.id.bInc:
                        num++;
                        break;

                }

                switch (v.getId()){
                    case R.id.bDec2:
                        num2--;
                        break;

                    case R.id.bInc2:
                        num2++;
                        break;
                }

                tv.setText(""+num);
                tv2.setText(""+num2);
            }
        };

        bDec.setOnClickListener(listener);
        bInc.setOnClickListener(listener);
        bDec2.setOnClickListener(listener);
        bInc2.setOnClickListener(listener);

    }

}