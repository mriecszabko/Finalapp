package szabo.fpv.umb.binarynator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        TextView versionName = findViewById(R.id.TV_version);
        versionName.setText("version : " + BuildConfig.VERSION_NAME);

    }
}