package android.example.doctormobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    TextView bmiResult;
    EditText edtxtHeight,edtxtWeight;
    double height,weight,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        String[] heightAttr={"Meter","Inc"};
        String[] weightAttr={"Kg","lb"};
        bmiResult = (TextView)findViewById(R.id.cal_BMI_tv);
//        final Spinner spinHeight = findViewById(R.id.Height_spinner);
//        final Spinner spinWeight = findViewById(R.id.weight_spinner);
//        spinHeight.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
//        spinWeight.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);

//Creating the ArrayAdapter instance having the bank name list

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,heightAttr);
        ArrayAdapter bb = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,weightAttr);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//Setting the ArrayAdapter data on the Spinner
//        spinHeight.setAdapter(aa);
//        spinWeight.setAdapter(bb);
        edtxtHeight = findViewById(R.id.edt_height);
        edtxtWeight = findViewById(R.id.edt_weight);

//        spinWeight.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                try {
//
//
//                    edtxtHeight = (EditText) findViewById(R.id.edt_height);
//                    height = Double.parseDouble(edtxtHeight.getText().toString());
//                    edtxtWeight = (EditText) findViewById(R.id.edt_weight);
//                    weight = Double.parseDouble(edtxtWeight.getText().toString());
//                    if(height == 0.0){
//
//                        bmiResult.setText("BMI: 0.0");
//                        bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                        Log.e("Error", "if: "+result);
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Meter") && spinWeight.getSelectedItem().equals("Kg")){
//
//                        result = Math.round(weight / (height*height)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Inc") && spinWeight.getSelectedItem().equals("lb")){
//
//                        result = Math.round(weight / (height*height*703)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Inc") && spinWeight.getSelectedItem().equals("Kg")){
//
//                        result = Math.round((weight/2.2) / (height*height*703.0)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else{
//                        result = Math.round(weight / (height*height)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        Log.e("Error", "else else: "+result);
//                        bmiResult.setText("BMI: "+resultStr);
//                        bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                    }
//
//                }catch (Exception ex){
//                    Log.e("Error", "Report: "+ex.getMessage());
//
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

//        spinHeight.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                try {
//
//
//                    edtxtHeight = (EditText) findViewById(R.id.edt_height);
//                    height = Double.parseDouble(edtxtHeight.getText().toString());
//                    edtxtWeight = (EditText) findViewById(R.id.edt_weight);
//                    weight = Double.parseDouble(edtxtWeight.getText().toString());
//                    if(height == 0.0){
//
//                        bmiResult.setText("BMI: 0.0");
//                        bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                        Log.e("Error", "if: "+result);
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Meter") && spinWeight.getSelectedItem().equals("Kg")){
//
//                        result = Math.round(weight / (height*height)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Inc") && spinWeight.getSelectedItem().equals("lb")){
//
//                        result = Math.round(weight / (height*height*703)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else if(spinHeight.getSelectedItem().equals("Inc") && spinWeight.getSelectedItem().equals("Kg")){
//
//                        result = Math.round((weight/2.2) / (height*height*703)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }
//                    else{
//                        result = Math.round(weight / (height*height)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        Log.e("Error", "else else: "+result);
//                        bmiResult.setText("BMI: "+resultStr);
//                        bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                    }
//
//                }catch (Exception ex){
//                    Log.e("Error", "Report: "+ex.getMessage());
//
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });

        final String w ="";
        final String h = "Inc";

        edtxtHeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {


                    edtxtHeight = (EditText) findViewById(R.id.edt_height);
                    height = Double.parseDouble(edtxtHeight.getText().toString());
                    edtxtWeight = (EditText) findViewById(R.id.edt_weight);
                    weight = Double.parseDouble(edtxtWeight.getText().toString());
                    if(height == 0.0){

                        bmiResult.setText("BMI: 0.0");
                        bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
                        Log.e("Error", "if: "+result);
                    }
//                    else if(spinHeight.getSelectedItem().equals("Meter") && spinWeight.getSelectedItem().equals("Kg")){
//
//                        result = Math.round(weight / (height*height)*100.0)/100.0;
//                        String resultStr = Double.toString(result);
//                        if(result<=18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
//                            Log.e("Error", "if Under: "+resultStr);
//                        }
//                        else if(result <= 24.9 && result>18.5){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
//                            Log.e("Error", "else if Normal: "+result);
//
//                        }
//                        else if(result>=25.0){
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
//                            Log.e("Error", "else if over: "+result);
//
//                        }
//                        else{
//                            bmiResult.setText("BMI: "+resultStr);
//                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
//                            Log.e("Error", "else: "+result);
//
//                        }
//                    }

                    else if(height>0.0){

                        result = Math.round((weight/2.2) / (height*height*703)*100.0)/100.0;
                        String resultStr = Double.toString(result);
                        if(result<=18.5){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
                            Log.e("Error", "if Under: "+resultStr);
                        }
                        else if(result <= 24.9 && result>18.5){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
                            Log.e("Error", "else if Normal: "+result);

                        }
                        else if(result>=25.0){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
                            Log.e("Error", "else if over: "+result);

                        }
                        else{
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                            Log.e("Error", "else: "+result);

                        }
                    }
                    else{
                        result = Math.round(weight / (height*height)*100.0)/100.0;
                        String resultStr = Double.toString(result);
                        Log.e("Error", "else else: "+result);
                        bmiResult.setText("BMI: "+resultStr);
                        bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    }

                }catch (Exception ex){
                    Log.e("Error", "Report: "+ex.getMessage());

                }

            }


            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        edtxtWeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {


                    edtxtHeight = (EditText) findViewById(R.id.edt_height);
                    height = Double.parseDouble(edtxtHeight.getText().toString());
                    edtxtWeight = (EditText) findViewById(R.id.edt_weight);
                    weight = Double.parseDouble(edtxtWeight.getText().toString());
                    if(weight == 0.0){

                        bmiResult.setText("BMI: 0.0");
                        bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
                        Log.e("Error", "if: "+result);
                    }

                    else if(height>0.0){

                        result = Math.round((weight/2.2) / (height*height*703)*100.0)/100.0;
                        String resultStr = Double.toString(result);
                        if(result<=18.5){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.NormalBMI));
                            Log.e("Error", "if Under: "+resultStr);
                        }
                        else if(result <= 24.9 && result>18.5){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.UnderWeight));
                            Log.e("Error", "else if Normal: "+result);

                        }
                        else if(result>=25.0){
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.OverWeight));
                            Log.e("Error", "else if over: "+result);

                        }
                        else{
                            bmiResult.setText("BMI: "+resultStr);
                            bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                            Log.e("Error", "else: "+result);

                        }
                    }
                    else{
                        result = Math.round(weight / (height*height)*100.0)/100.0;
                        String resultStr = Double.toString(result);
                        Log.e("Error", "else else: "+result);
                        bmiResult.setText("BMI: "+resultStr);
                        bmiResult.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    }

                }catch (Exception ex){
                    Log.e("Error", "Report: "+ex.getMessage());

                }

            }


            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


}
