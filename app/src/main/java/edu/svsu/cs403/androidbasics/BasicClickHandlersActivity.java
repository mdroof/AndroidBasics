package edu.svsu.cs403.androidbasics;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BasicClickHandlersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_click_handlers);
        Button secondButton = (Button) findViewById(R.id.btnClick2);
        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondButtonClicked(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_basic_click_handlers, menu);
        return true;
    }

    public void firstButtonClicked(View v) {
        Toast.makeText(BasicClickHandlersActivity.this, "firstButton clicked! XML!", Toast.LENGTH_SHORT).show();
    }

    private void secondButtonClicked(View v) {
        Toast.makeText(BasicClickHandlersActivity.this, "secondButton clicked! Java!", Toast.LENGTH_SHORT).show();
    }

}
