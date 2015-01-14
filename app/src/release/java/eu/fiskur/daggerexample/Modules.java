package eu.fiskur.daggerexample;

/**
 * Created by jonathan.fisher on 13/01/2015.
 */
final class Modules {
    static Object[] list(DaggerExampleApp app) {
        return new Object[] {
                new DaggerExampleModule(app)
        };
    }

    private Modules() {
    }
}
