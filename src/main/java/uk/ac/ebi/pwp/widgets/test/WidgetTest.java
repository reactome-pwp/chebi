package uk.ac.ebi.pwp.widgets.test;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.resources.client.TextResource;
import com.google.gwt.user.client.ui.RootPanel;
import uk.ac.ebi.pwp.widgets.chebi.client.ChEBIViewer;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WidgetTest implements EntryPoint {
    // IMPORTANT! ATTENTION!
    // Do NOT use the class name for the place holder ( but it is case sensitive :D )
    private static final String PLACE_HOLDER = "widget_test";

    @Override
    public void onModuleLoad() {
        GWT.runAsync(new RunAsyncCallback() {
            public void onFailure(Throwable caught) {
            }

            @SuppressWarnings("unchecked")
            public void onSuccess() {
                TextResource xml = Resources.INSTANCE.responseText();
                RootPanel.get(PLACE_HOLDER).add(new ChEBIViewer(xml));
            }
        });
    }
}
