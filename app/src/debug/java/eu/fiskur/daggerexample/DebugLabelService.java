package eu.fiskur.daggerexample;

/**
 * Created by jonathan.fisher on 13/01/2015.
 */
public class DebugLabelService extends AbstractLabelService {

    @Override
    public String getLabel() {
        return "HelloDagger! (DebugLabelService.class)";
    }
}
