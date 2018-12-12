package com.kritsanaro.week8app.week8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rad1,rad2,rad3;
    Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rad1 = findViewById(R.id.rad1);
        rad2 = findViewById(R.id.rad2);
        rad3 = findViewById(R.id.rad3);

        btn_submit = findViewById(R.id.btn_submit);
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,
                        "Rad 1:"+rad1.isChecked()
                                + " Rad2 : "+rad2.isChecked()
                                + " Rad3 : "+rad3.isChecked()
                        , Toast.LENGTH_SHORT).show();

                rad1.setChecked(false);
                rad2.setChecked(false);
                rad3.setChecked(false);


            }
        });



    }
}
