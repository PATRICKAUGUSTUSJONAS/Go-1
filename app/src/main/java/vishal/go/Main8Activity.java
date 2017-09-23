package vishal.go;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main8Activity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main8);
        TextView tv1 = (TextView) findViewById(R.id.textView13);
        Typeface tf1 = Typeface.createFromAsset(getAssets(),"Amatic-Bold.ttf");
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView14);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView15);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView16);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView17);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView18);
        tv1.setTypeface(tf1);
        tv1 = (TextView) findViewById(R.id.textView18);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main8Activity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        TextView tv2 = (TextView) findViewById(R.id.textView15);
        Intent intent = getIntent();
        String a = intent.getExtras().getString("score");
        int b = Integer.parseInt(a)*100;
        a = String.valueOf(b);
        tv2.setText(a);
        SharedPreferences prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        int score = prefs.getInt("key", 0);
        if(score<b){
            prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = prefs.edit();
            editor.putInt("key", b);
            editor.commit();
        }
        prefs = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);
        score = prefs.getInt("key", 0);
        TextView tv3 = (TextView) findViewById(R.id.textView17);
        String c = String.valueOf(score);
        tv3.setText(c);
    }

    @Override
    public void onBackPressed() {
    }
}
