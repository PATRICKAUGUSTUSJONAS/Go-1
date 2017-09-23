package vishal.go;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Main7Activity extends AppCompatActivity {
    int count=7;
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
        setContentView(R.layout.activity_main7);
        final Button bt19 = (Button) findViewById(R.id.button19);
        final Button bt20 = (Button) findViewById(R.id.button20);
        final Button bt21 = (Button) findViewById(R.id.button21);
        final Button bt22 = (Button) findViewById(R.id.button22);
        final Button bt23 = (Button) findViewById(R.id.button23);
        final Button bt24 = (Button) findViewById(R.id.button24);
        final Button bt25 = (Button) findViewById(R.id.button25);
        bt19.setClickable(false);
        bt20.setClickable(false);
        bt21.setClickable(false);
        bt22.setClickable(false);
        bt23.setClickable(false);
        bt24.setClickable(false);
        bt25.setClickable(false);
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
                            bt19.setClickable(true);
                            bt20.setClickable(true);
                            bt21.setClickable(true);
                            bt22.setClickable(true);
                            bt23.setClickable(true);
                            bt24.setClickable(true);
                            bt25.setClickable(true);
                            bt19.setBackgroundColor(Color.TRANSPARENT);
                            bt20.setBackgroundColor(Color.TRANSPARENT);
                            bt21.setBackgroundColor(Color.TRANSPARENT);
                            bt22.setBackgroundColor(Color.TRANSPARENT);
                            bt23.setBackgroundColor(Color.TRANSPARENT);
                            bt24.setBackgroundColor(Color.TRANSPARENT);
                            bt25.setBackgroundColor(Color.TRANSPARENT);
                        }
                    }
                });
            }
        }).start();
        RelativeLayout rl1 = (RelativeLayout) findViewById(R.id.level5);
        rl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "4";
                Intent i = new Intent(Main7Activity.this,Main8Activity.class);
                i.putExtra("score",a);
                startActivity(i);
            }
        });
    }

    public void click19(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button19);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click20(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button20);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click21(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button21);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click22(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button22);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click23(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button23);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click24(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button24);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    public void click25(View view) {
        count--;
        Button btn = (Button) findViewById(R.id.button25);
        btn.setClickable(false);
        btn.setBackgroundResource(R.drawable.round_after);
        if(count==0){
            String a = "5";
            Intent i =new Intent(Main7Activity.this,Main8Activity.class);
            i.putExtra("score",a);
            startActivity(i);
        }
    }

    @Override
    public void onBackPressed() {
    }
}
