package xyz.rimon.smrtest;

import android.app.Application;

import xyz.rimon.ael.domains.Event;
import xyz.rimon.ael.factory.EventFactory;
import xyz.rimon.smr.SMR;

/**
 * Created by SAyEM on 7/12/17.
 */

public class App extends Application {
    private static final String TAG = "ERROR";

    @Override
    public void onCreate() {
        super.onCreate();

        SMR.initialize(getApplicationContext(), "c1pdmokem15sdncvu1m0ovivsv", "6baoeb9cqgrv8eug5353njrtc2");

        EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "very_low_btn_press_event", (byte) 1);
        Event lowEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "low_btn_press_event", Event.Weight.LOW);
        Event normalEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "normal_btn_press_event", (byte) 3);
        Event highEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "high_btn_press_event", (byte) 4);
        Event veryHighEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "very_high_btn_press_event", (byte) 5);

    }
}
