package vishal.go;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_main2);
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"Amatic-Bold.ttf");
        TextView tv1 = (TextView) findViewById(R.id.textView2);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView6);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView7);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView8);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView9);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView9);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.credits,null);
                builder.setCancelable(false);
                builder.setView(dialogView);
                Button btn = (Button) dialogView.findViewById(R.id.button26);
                final AlertDialog dialog = builder.create();
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
        TextView tv2 = (TextView) findViewById(R.id.textView8);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.instructions,null);
                builder.setCancelable(false);
                builder.setView(dialogView);
                Button btn = (Button) dialogView.findViewById(R.id.button27);
                final AlertDialog dialog = builder.create();
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(Main2Activity.this,Main3Activity.class);
                        startActivity(i);
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        int score = prefs.getInt("key", 0);
        TextView tv3 = (TextView) findViewById(R.id.textView7);
        String b = String.valueOf(score);
        tv3.setText(b);
    }

    @Override
    public void onBackPressed() {
    }

    /*@Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }*/

}
