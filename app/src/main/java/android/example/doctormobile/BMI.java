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
        edtxtHeight = findViewById(R.id.edt_height);
        edtxtWeight = findViewById(R.id.edt_weight);


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

                    else if(height>0.0){
                        double h2 = height * 0.0254;
                        result = weight / (h2*h2);
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
                        double h2 = height * 0.0254;
                        result = weight / (h2*h2);
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

                    else if(weight>0.0){

                        double h2 = height * 0.0254;
                        result = weight / (h2*h2);
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
                        double h2 = height * 0.0254;
                        result = weight / (h2*h2);
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
