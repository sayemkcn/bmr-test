package xyz.rimon.smrtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import xyz.rimon.ael.domains.Event;
import xyz.rimon.ael.registry.EventRegistry;
import xyz.rimon.smr.SMR;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnVeryLow = findViewById(R.id.btnVeryLow);
        Button btnLow = findViewById(R.id.btnLow);
        Button btnNormal = findViewById(R.id.btnNormal);
        Button btnHigh = findViewById(R.id.btnHigh);
        Button btnVeryHigh = findViewById(R.id.btnVeryHigh);

        btnVeryLow.setOnClickListener(this);
        btnLow.setOnClickListener(this);
        btnNormal.setOnClickListener(this);
        btnHigh.setOnClickListener(this);
        btnVeryHigh.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Event event;
        switch (id) {
            case R.id.btnVeryLow:
                event = EventRegistry.getInstance().getEventByTag("very_low_btn_press_event");
                SMR.logOnline(this, event);
                break;
            case R.id.btnLow:
                event = EventRegistry.getInstance().getEventByTag("low_btn_press_event");
                SMR.logOnline(this, event);
                break;
            case R.id.btnNormal:
                event = EventRegistry.getInstance().getEventByTag("normal_btn_press_event");
                SMR.logOnline(this, event);
                break;
            case R.id.btnHigh:
                event = EventRegistry.getInstance().getEventByTag("high_btn_press_event");
                SMR.logOnline(this, event);
                break;
            case R.id.btnVeryHigh:
                event = EventRegistry.getInstance().getEventByTag("very_high_btn_press_event");
                SMR.logOnline(this, event);
                break;
        }
    }
}
