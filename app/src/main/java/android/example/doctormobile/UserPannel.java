package android.example.doctormobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserPannel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_pannel);

        Button adultFeverBtn = (Button)findViewById(R.id.adult_fever_btn);

        adultFeverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserPannel.this, FeverCause.class);
                startActivity(intent);
            }
        });

        Button bmical2 = (Button)findViewById(R.id.bmi_cal_id);

        bmical2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserPannel.this, BMI.class);
                startActivity(intent);
            }
        });

    }
}
