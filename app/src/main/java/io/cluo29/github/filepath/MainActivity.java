package io.cluo29.github.filepath;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView Text_filePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView

        Text_filePath = (TextView)findViewById(R.id.textView);

        String aaa=""+getApplicationContext().getExternalFilesDir(null);
        Text_filePath.setText(aaa);

    }
}
