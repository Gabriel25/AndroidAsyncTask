package com.android1.gabriel.simpleasynctask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startTask (View view){
        mTextView.setText("Napping");

        //inicializa el AsyncTask
        new SimpleAsyncTask(mTextView).execute();
    }

    private TextView mTextView;
}
