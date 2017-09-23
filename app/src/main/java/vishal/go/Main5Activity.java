package vishal.go;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main5Activity extends AppCompatActivity {
    int count=5;
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
        setContentView(R.layout.activity_main5);
        final Button bt8 = (Button) findViewById(R.id.button8);
        final Button bt9 = (Button) findViewById(R.id.button9);
        final Button bt10 = (Button) findViewById(R.id.button10);
        final Button bt11 = (Button) findViewById(R.id.button11);
        final Button bt12 = (Button) findViewById(R.id.button12);
        bt8.setClickable(false);
        bt9.setClickable(false);
        bt10.setClickable(false);
        bt11.setClickable(false);
        bt12.setClickable(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Update the progress status
                progressStatus =1;

                // Try to sleep the thread for 20 milliseconds
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                // Update the progress bar
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        // Show the progress on TextView
                        if(progressStatus==1){
                            bt8.setClickable(true);
                            bt9.setClickable(true);
                            bt10.setClickable(true);
                            bt11.setClickable(true);
                            bt12.setClickable(true);
                            bt8.setBackgroundColor(Color.TRANSPARENT);
                            bt9.setBackgroundColor(Color.TRANSPARENT);
                            bt10.setBackgroundColor(Color.TRANSPARENT);
                            bt11.setBackgroundColor(Color.TRANSPARENT);
                            bt12.setBackgroundColor(Color.TRANSPARENT);
                        }
                    }
                });
            }
        }).start();
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.level3);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "2";
                Intent i = new Intent(Main5Activity.this,Main8Activity.class);
                i.putExtra("score",a);
                startActivity(i);
            }
        });
    }

    public void click8(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button8);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main5Activity.this,Main6Activity.class);
            startActivity(i);
        }
    }

    public void click9(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button9);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main5Activity.this,Main6Activity.class);
            startActivity(i);
        }
    }

    public void click10(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button10);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main5Activity.this,Main6Activity.class);
            startActivity(i);
        }
    }

    public void click11(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button11);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main5Activity.this,Main6Activity.class);
            startActivity(i);
        }
    }

    public void click12(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button12);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main5Activity.this,Main6Activity.class);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
