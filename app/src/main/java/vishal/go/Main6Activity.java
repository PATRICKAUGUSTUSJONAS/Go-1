package vishal.go;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main6Activity extends AppCompatActivity {
    int count=6;
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
        setContentView(R.layout.activity_main6);
        final Button bt13 = (Button) findViewById(R.id.button13);
        final Button bt14 = (Button) findViewById(R.id.button14);
        final Button bt15 = (Button) findViewById(R.id.button15);
        final Button bt16 = (Button) findViewById(R.id.button16);
        final Button bt17 = (Button) findViewById(R.id.button17);
        final Button bt18 = (Button) findViewById(R.id.button18);
        bt13.setClickable(false);
        bt14.setClickable(false);
        bt15.setClickable(false);
        bt16.setClickable(false);
        bt17.setClickable(false);
        bt18.setClickable(false);
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
                            bt13.setClickable(true);
                            bt14.setClickable(true);
                            bt15.setClickable(true);
                            bt16.setClickable(true);
                            bt17.setClickable(true);
                            bt18.setClickable(true);
                            bt13.setBackgroundColor(Color.TRANSPARENT);
                            bt14.setBackgroundColor(Color.TRANSPARENT);
                            bt15.setBackgroundColor(Color.TRANSPARENT);
                            bt16.setBackgroundColor(Color.TRANSPARENT);
                            bt17.setBackgroundColor(Color.TRANSPARENT);
                            bt18.setBackgroundColor(Color.TRANSPARENT);
                        }
                    }
                });
            }
        }).start();
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.level4);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "3";
                Intent i = new Intent(Main6Activity.this,Main8Activity.class);
                i.putExtra("score",a);
                startActivity(i);
            }
        });
    }

    public void click13(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button13);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    public void click14(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button14);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    public void click15(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button15);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    public void click16(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button16);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    public void click17(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button17);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    public void click18(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button18);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main6Activity.this,Main7Activity.class);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
