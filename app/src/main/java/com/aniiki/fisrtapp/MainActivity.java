package com.aniiki.fisrtapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity
{
    /** Chamada para quando a aplicação for criada. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botao_Click(View v)
    {
        if(v.getId() == R.id.BotaoHelloWorld)
        {
            Mensagem("Olá Mundo!");
        }
    }

    public void Mensagem(String message)
    {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}