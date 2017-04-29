package gotheme.googledistancecalculatorapi;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;

/**
 * Created by Dell on 29/04/2017.
 */

public class GeoCodingExample extends AppCompatActivity {
    private EditText edAddress,edLatitude,edLongitude;
    private TextView tvResultData, tvResult;
    private TextView reversetResultData,reversetvResult;
    private List<Address> addressList = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geocoding);

        tvResult = (TextView) findViewById(R.id.tv_result);
        tvResultData = (TextView) findViewById(R.id.tv_result_data);
        edAddress= (EditText) findViewById(R.id.ed_address);
        edLatitude= (EditText) findViewById(R.id.ed_latitude);
        edLongitude= (EditText) findViewById(R.id.ed_longitude);
        reversetvResult= (TextView) findViewById(R.id.tv_result_reverse_geo_coding);
        reversetResultData= (TextView) findViewById(R.id.tv_result_data_reverse_geo_coding);


        tvResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getData();
            }
        });


        reversetvResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             getReverseData();
            }
        });


    }

    private void getData() {
        Geocoder geocoder = new Geocoder(this);
        try {
            addressList = geocoder.getFromLocationName(edAddress.getText().toString().trim(), 1);//we are passing 1 for find only one result
        } catch (IOException e) {
            e.printStackTrace();
        }


        if(!addressList.isEmpty())
        {
            double latitude=addressList.get(0).getLatitude();
            double longitude=addressList.get(0).getLongitude();
            tvResultData.setText("Lat :"+latitude+"\nLong :"+longitude);
        }
    }

    //Now we getting data from  list



    private void getReverseData()
    {

        Geocoder geocoder=new Geocoder(this);

        try {
            addressList = geocoder.getFromLocation(Double.valueOf(edLatitude.getText().toString()),Double.valueOf(edLongitude.getText().toString()), 1);//we are passing 1 for find only one result
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(!addressList.isEmpty())
        {
            String address1=addressList.get(0).getAddressLine(0);
            String address2=addressList.get(0).getAddressLine(1);
            String countryName=addressList.get(0).getCountryName();
            String postalCode=addressList.get(0).getPostalCode();
            reversetResultData.setText(""+address1+","+address2+","+countryName+"\n"+postalCode);
        }
    }

}