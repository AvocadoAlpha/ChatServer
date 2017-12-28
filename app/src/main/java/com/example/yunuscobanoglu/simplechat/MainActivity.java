package com.example.yunuscobanoglu.simplechat;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    private static Socket s;
    private static ServerSocket ss;
    private static InputStreamReader isr;
    private PrintWriter
    private static BufferedReader br;

    String message ="";
    private static String ip = "192.168.0.103";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1= (EditText) findViewById(R.id.editText1);
    }
    public void send_text(View v){
        myTask mt =new myTask();
        mt.excecute();
    }
    class myTask extends AsyncTask<Void,Void,Void> {
        @Override
        protected void doInBackround

    }
}
