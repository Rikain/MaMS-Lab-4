package pl.edu.pwr.lab4.i242571;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import pl.edu.pwr.lab4.i242571.ui.main.EventFragment;

public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        TextView nameTv = findViewById(R.id.event_name_tv);
        TextView descTv = findViewById(R.id.event_description_tv);
        ImageView imageIv = findViewById(R.id.event_icon_iv);

        Intent intent = getIntent();
        EventModel event = (EventModel) intent.getSerializableExtra(EventFragment.EventPosMessage);

        nameTv.setText(event.getName());
        descTv.setText(event.getDescription());
        imageIv.setImageResource(event.getImageResource());
    }
}