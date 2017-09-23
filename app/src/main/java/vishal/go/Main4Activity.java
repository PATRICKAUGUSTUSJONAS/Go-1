package vishal.go;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main4Activity extends AppCompatActivity {
    int count=4;
    int progressStatus = 0;
    private Handler handler = new Handler();
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
        setContentView(R.layout.activity_main4);
        final Button bt4 = (Button) findViewById(R.id.button4);
        final Button bt5 = (Button) findViewById(R.id.button5);
        final Button bt6 = (Button) findViewById(R.id.button6);
        final Button bt7 = (Button) findViewById(R.id.button7);
        bt4.setClickable(false);
        bt5.setClickable(false);
        bt6.setClickable(false);
        bt7.setClickable(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Update the progress status
                progressStatus =1;

                // Try to sleep the thread for 20 milliseconds
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                // Update the progress bar
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        // Show the progress on TextView
                        if(progressStatus==1){
                            bt4.setClickable(true);
                            bt5.setClickable(true);
                            bt6.setClickable(true);
                            bt7.setClickable(true);
                            bt4.setBackgroundColor(Color.TRANSPARENT);
                            bt5.setBackgroundColor(Color.TRANSPARENT);
                            bt6.setBackgroundColor(Color.TRANSPARENT);
                            bt7.setBackgroundColor(Color.TRANSPARENT);
                        }
                    }
                });
            }
        }).start();
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.level2);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "1";
                Intent i = new Intent(Main4Activity.this,Main8Activity.class);
                i.putExtra("score",a);
                startActivity(i);
            }
        });
    }

    public void click4(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button4);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(i);
        }
    }

    public void click5(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button5);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(i);
        }
    }

    public void click6(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button6);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(i);
        }
    }

    public void click7(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button7);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main4Activity.this,Main5Activity.class);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
