package vishal.go;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    int count=3;
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
        setContentView(R.layout.activity_main3);
        final Button bt1 = (Button) findViewById(R.id.button);
        final Button bt2 = (Button) findViewById(R.id.button2);
        final Button bt3 = (Button) findViewById(R.id.button3);
        bt1.setClickable(false);
        bt2.setClickable(false);
        bt3.setClickable(false);
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
                                bt1.setClickable(true);
                                bt2.setClickable(true);
                                bt3.setClickable(true);
                                bt1.setBackgroundColor(Color.TRANSPARENT);
                                bt2.setBackgroundColor(Color.TRANSPARENT);
                                bt3.setBackgroundColor(Color.TRANSPARENT);
                            }
                        }
                    });
            }
        }).start();
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.level1);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "0";
                Intent i = new Intent(Main3Activity.this,Main8Activity.class);
                i.putExtra("score",a);
                startActivity(i);
            }
        });

    }

    public void click1(View view) {
        //Toast.makeText(this, "Count: " + count, Toast.LENGTH_SHORT).show();
        count--;
        Button btn = (Button) findViewById(R.id.button);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main3Activity.this,Main4Activity.class);
            startActivity(i);
        }
    }

    public void click2(View view) {
        //Toast.makeText(this, "Count: " + count, Toast.LENGTH_SHORT).show();
        count--;
        Button btn = (Button) findViewById(R.id.button2);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            Intent i =new Intent(Main3Activity.this,Main4Activity.class);
            startActivity(i);
        }
    }

    public void click3(View view) {
        //Toast.makeText(this, "Count: " + count, Toast.LENGTH_SHORT).show();
        count--;
        Button btn = (Button) findViewById(R.id.button3);
        btn.setBackgroundResource(R.drawable.round_after);
        btn.setClickable(false);
        if(count==0){
            Intent i =new Intent(Main3Activity.this,Main4Activity.class);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
