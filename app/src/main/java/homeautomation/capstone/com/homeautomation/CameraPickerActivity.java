package homeautomation.capstone.com.homeautomation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import homeautomation.capstone.com.homeautomation.simplemjpeg.MjpegActivity;


public class CameraPickerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Context context = this;

        Button camera1_button = (Button) findViewById(R.id.camera1_button);

        //Register
        camera1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(context, MjpegActivity.class);
                startActivity(registerIntent);
            }
        });
    }
}
