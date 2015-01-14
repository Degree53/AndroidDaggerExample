package eu.fiskur.daggerexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import javax.inject.Inject;


public class DaggerExampleActivity extends ActionBarActivity {

    @Inject
    AbstractLabelService mFileContents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtitles);

        ((DaggerExampleApp) getApplication()).inject(this);

        TextView label = TextView.class.cast(findViewById(R.id.label));
        String subtitlesStr = mFileContents.getLabel();
        label.setText(subtitlesStr);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_subtitles, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
