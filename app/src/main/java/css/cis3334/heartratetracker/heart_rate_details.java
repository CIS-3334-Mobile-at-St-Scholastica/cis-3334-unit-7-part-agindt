package css.cis3334.heartratetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class heart_rate_details extends AppCompatActivity {

    TextView txtvHR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_rate_details);
        txtvHR = (TextView) findViewById(R.id.tvHR);

        Bundle extras = getIntent().getExtras();

        HeartRate hr1 = (HeartRate)extras.getSerializable("heartrate");
        txtvHR.setText(hr1.toString());
    }


}
