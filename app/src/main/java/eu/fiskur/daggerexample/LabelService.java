package eu.fiskur.daggerexample;

/**
 * Created by jonathan.fisher on 13/01/2015.
 */

public class LabelService extends AbstractLabelService {

    @Override
    public String getLabel() {
        return "HelloDagger! (LabelService.class)";
    }
}
