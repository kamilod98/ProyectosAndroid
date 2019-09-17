package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private SeekBar sbrRed = null;
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private SeekBar sbrAlpha = null;
    private View viewColors = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtenemos los datos
        sbrRed = findViewById(R.id.sbrRed);
        sbrGreen = findViewById(R.id.sbrGreen);
        sbrBlue = findViewById(R.id.sbrBlue);
        sbrAlpha = findViewById(R.id.sbrAlpha);

        sbrRed.setOnSeekBarChangeListener(this);
        sbrGreen.setOnSeekBarChangeListener(this);
        sbrBlue.setOnSeekBarChangeListener(this);
        sbrAlpha.setOnSeekBarChangeListener(this);

        // muestra o aplica el menu contextual cuando se mantiene precionado viewColors, permite
        // aplicar un menu contextual a cualquier view en este caso a viewcolors
        registerForContextMenu(viewColors);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.colors, menu);
    }

    /*@Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.iteTransparent:
                sbrAlpha.setProgress(0);
                return true;

            case R.id.iteSemitransparent:
                sbrAlpha.setProgress(120);
                return true;

            case R.id.iteOpaque:
                sbrAlpha.setProgress(255);
                return true;

            case R.id.iteRed:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                return true;

            case R.id.iteCyan:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                return true;

            case R.id.iteMagenta:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                return true;

            case R.id.iteYellow:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                return true;

            case R.id.iteBlack:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(0);
                return true;

            case R.id.iteWhite:
                sbrRed.setProgress(255);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(255);
                return true;

            case R.id.iteGreen:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(255);
                sbrBlue.setProgress(0);
                return true;

            case R.id.iteBlue:
                sbrRed.setProgress(0);
                sbrGreen.setProgress(0);
                sbrBlue.setProgress(255);
                return true;

            case R.id.iteAboutof:
                Intent intent = new Intent(this, AboutOf.class);
                return true;

            default:
                return super.onContextItemSelected(item);
        }
    }*/
}
