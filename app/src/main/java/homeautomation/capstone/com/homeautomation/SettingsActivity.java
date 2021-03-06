package homeautomation.capstone.com.homeautomation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        final Context c = getApplicationContext();


        final EditText ip = (EditText) findViewById(R.id.ip);
        ip.setText(Settings.getInstance().getURL());

        final EditText cam_ip = (EditText) findViewById(R.id.cam_ip);
        cam_ip.setText(Settings.getInstance().getCamURL());

        Button setURLBtn = (Button) findViewById(R.id.set_url);
        setURLBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Settings.getInstance().setURL(ip.getText().toString());
                Toast.makeText(c, "URL Set", Toast.LENGTH_SHORT).show();
            }
        });

        Button setWebcamURLBTN = (Button) findViewById(R.id.set_cam_url);
        setWebcamURLBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Settings.getInstance().setWebcamURL(cam_ip.getText().toString());
                Toast.makeText(c, "Cam URL Set", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
