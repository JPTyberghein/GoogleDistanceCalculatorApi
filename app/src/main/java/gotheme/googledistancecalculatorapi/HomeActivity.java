package gotheme.googledistancecalculatorapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Dell on 29/04/2017.
 */

public class HomeActivity extends AppCompatActivity{
    private Button btnGeocoder;
    private Button btnDistance;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_home);
        btnGeocoder= (Button) findViewById(R.id.btn_geocoder);
        btnDistance= (Button) findViewById(R.id.btn_distance);

        btnGeocoder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,GeoCodingExample.class));
            }
        });


        btnDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,MapsActivity.class));

            }
        });
    }
}
