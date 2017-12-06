package xyz.rimon.smrtest;

import android.app.Application;
import android.util.Log;

import xyz.rimon.ael.domains.Event;
import xyz.rimon.ael.factory.EventFactory;
import xyz.rimon.smr.SMR;
import xyz.rimon.smr.exceptions.InvalidException;
import xyz.rimon.smr.model.User;

/**
 * Created by SAyEM on 7/12/17.
 */

public class App extends Application {
    private static final String TAG = "ERROR";

    @Override
    public void onCreate() {
        super.onCreate();
        try {
            SMR.initialize(
                    getApplicationContext(),
                    "8bheq0so8mo3rdced0tmh15to1",
                    "bl482aps529a8o817vs4uppepa",
                    new User("Rimon Ranbir", "rimonranbir", "rimonranbir@gmail.com", "qwerty")
            );

            EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "very_low_btn_press_event", (byte) 1);
            Event lowEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "low_btn_press_event", (byte) 2);
            Event normalEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "normal_btn_press_event", (byte) 3);
            Event highEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "high_btn_press_event", (byte) 4);
            Event veryHighEvent = EventFactory.getInstance().createEvent(Event.Type.APP_EVENT, "very_high_btn_press_event", (byte) 5);
        } catch (InvalidException e) {
            Log.d(TAG, "onCreate: User invalid " + e.toString());
        }
    }
}
