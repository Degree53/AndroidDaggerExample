package eu.fiskur.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jonathan.fisher on 13/01/2015.
 */
@Module(
        injects = {DaggerExampleApp.class, DaggerExampleActivity.class},
        library = true
)
public class DaggerExampleModule {

    private final DaggerExampleApp app;

    public DaggerExampleModule(DaggerExampleApp app){
        this.app = app;
    }

    @Provides
    AbstractLabelService provideFileContents(){
        return new LabelService();
    }

    @Provides @Singleton public DaggerExampleApp provideApp() { return app; }
}
