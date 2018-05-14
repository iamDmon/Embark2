package ml.vkdev.dev.embark.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import ml.vkdev.dev.embark.R;

/**
 * Created by vedant on 5/14/2018.
 */

public class newAlarm extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_alarm);
    }
}
