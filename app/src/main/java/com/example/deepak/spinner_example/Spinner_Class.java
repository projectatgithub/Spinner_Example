package com.example.deepak.spinner_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Spinner_Class extends AppCompatActivity {




    final ArrayList<String> state_option=new ArrayList<>();


    Spinner state,city;
    String stateName="Andhra Pradesh";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner_activity);

        state = (Spinner) findViewById(R.id.state_spin);
        city = (Spinner) findViewById(R.id.city_spin);


        state_option.add("Select State");
        state_option.add("Andhra Pradesh");
        state_option.add("Arunachal Pradesh");
        state_option.add("Assam");
        state_option.add("Bihar");
        state_option.add("Chhattisgarh");
        state_option.add("Goa");
        state_option.add("Gujarat");
        state_option.add("Haryana");
        state_option.add("Himachal Pradesh");
        state_option.add("Jammu & Kashmir");
        state_option.add("Jharkhand");
        state_option.add("Karnataka");
        state_option.add("Kerala");
        state_option.add("Madhya Pradesh");
        state_option.add("Maharashtra");
        state_option.add("Manipur");
        state_option.add("Meghalaya");
        state_option.add("Mizoram");
        state_option.add("Nagaland");
        state_option.add("Odisha");
        state_option.add("Punjab");
        state_option.add("Rajasthan");
        state_option.add("Sikkim");
        state_option.add("Tamil Nadu");
        state_option.add("Telangana ");
        state_option.add("Tripura");
        state_option.add("Uttar Pradesh");
        state_option.add("West Bengal");
        state_option.add("Uttarakhand");


        ArrayAdapter<String> stateAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, state_option);
        state.setAdapter(stateAdapter);


        state.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                stateName = state_option.get(i).toString();

                 resetCity(stateName);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }


    public void resetCity(String stateName) {



        if (stateName.equals("Select State")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Select_City,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);


        }



        if (stateName.equals("Andhra Pradesh")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Andrapradesh_array,android.R.layout.simple_spinner_item);
  adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }


        if (stateName.equals("Arunachal Pradesh")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.ArunachalPradesh_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);



        }
        if (stateName.equals("Assam")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Assam_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }


        if (stateName.equals("Bihar")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Bihar_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Chhattisgarh")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Chhattisgarh_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }

        if (stateName.equals("Goa")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Goa_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }


        if (stateName.equals("Gujarat")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Gujarat_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }

        if (stateName.equals("Haryana")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Haryana_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Himachal Pradesh")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Himachal_Pradesh_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Jammu & Kashmir")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.JammuKashmir_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Jharkhand")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Jharkhand_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }
        if (stateName.equals("Karnataka")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Karnataka_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Kerala")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Kerala_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Madhya Pradesh")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Madhya_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Maharashtra")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Maharashtra_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }


        if (stateName.equals("Manipur")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Manipur_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Meghalaya")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Meghalaya_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }


        if (stateName.equals("Mizoram")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Mizoram_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Nagaland")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Nagaland_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }

        if (stateName.equals("Odisha ")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Odisha_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Punjab")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Punjab_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }
        if (stateName.equals("Rajasthan")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Rajasthan_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Sikkim")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Sikkim_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Tamil Nadu")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.TamilNadu_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }


        if (stateName.equals("Telangana ")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Telangana_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("Tripura")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Tripura_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource( android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }
        if (stateName.equals("Uttar Pradesh")) {


            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.UttarPradesh_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);
        }


        if (stateName.equals("Uttarakhand")) {

            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.Uttarakhand_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }
        if (stateName.equals("West Bengal")) {
            ArrayAdapter<CharSequence> adapter= ArrayAdapter
                    .createFromResource(this,R.array.WestBengal_array,android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
            city.setAdapter(adapter);

        }


    }
}