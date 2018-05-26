package com.aniiki.fisrtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.getMenuInflater().inflate(R.menu.main, menu);

        Button butao = (Button)findViewById(R.id.btnButao);

    butao.setOnClickListener(new OnClickListener(){
        @Override
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "BOTÃO CLICADO", Toast.LENGTH_SHORT).show();
        }
        });
        return true;

}
}