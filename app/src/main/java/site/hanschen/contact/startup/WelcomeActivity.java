package site.hanschen.contact.startup;

import android.os.Bundle;
import android.support.annotation.Nullable;

import site.hanschen.common.base.activity.BaseActivity;
import site.hanschen.contact.R;

/**
 * @author HansChen
 */
public class WelcomeActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
