package eu.fiskur.daggerexample;

import android.app.Application;

import dagger.ObjectGraph;

/**
 * Created by jonathan.fisher on 12/01/2015.
 */
public class DaggerExampleApp extends Application {

    private ObjectGraph objectGraph;

    @Override public void onCreate() {
        super.onCreate();

        objectGraph = ObjectGraph.create(Modules.list(this));
        objectGraph.inject(this);
    }

    public void inject(Object object) {
        objectGraph.inject(object);
    }
}
