package ml.vkdev.dev.embark.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import ml.vkdev.dev.embark.R;

public class Alarms extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alarms);

        findViewById(R.id.addAlarm).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), newAlarm.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadeout, R.anim.fadein);
            }
        });
    }
}
