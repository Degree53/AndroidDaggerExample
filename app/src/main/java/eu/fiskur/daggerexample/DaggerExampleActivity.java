package eu.fiskur.daggerexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;


public class DaggerExampleActivity extends ActionBarActivity {

    @Inject
    AbstractLabelService mLabelService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtitles);

        ((DaggerExampleApp) getApplication()).inject(this);

        TextView label = TextView.class.cast(findViewById(R.id.label));
        String subtitlesStr = mLabelService.getLabel();
        label.setText(subtitlesStr);
    }
}
