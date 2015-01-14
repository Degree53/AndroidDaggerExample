package eu.fiskur.daggerexample;

/**
 * Created by jonathan.fisher on 13/01/2015.
 */

import dagger.Module;
import dagger.Provides;

@Module(
        includes = DaggerExampleModule.class,
        overrides = true
)
public class DebugModule {

    @Provides
    AbstractLabelService provideFileContents(){
        return new DebugLabelService();
    }
}
