package android.example.doctormobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class FeverCause extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever_cause);
        final CheckBox c1 = (CheckBox) findViewById(R.id.checkBox1);
        final CheckBox c2 = (CheckBox) findViewById(R.id.checkBox2);
        final CheckBox c3 = (CheckBox) findViewById(R.id.checkBox3);
        Button checkResultBtn = (Button)findViewById(R.id.check_result_btn);

        checkResultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String a = c1.getText().toString();
//                Toast.makeText(getApplicationContext(),"Em"+c1.isChecked(),Toast.LENGTH_LONG).show();

                if(c1.isChecked() && !c3.isChecked()){
//                    Toast.makeText(getApplicationContext(),"ok"+c1.isChecked(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(FeverCause.this, Results.class);
                    startActivity(intent);
                }
                else if(c2.isChecked() && !c1.isChecked() && !c3.isChecked()){
                    Intent intent = new Intent(FeverCause.this, Option2.class);
                    startActivity(intent);
                }
                else if(c3.isChecked() && !c1.isChecked() && !c2.isChecked()){
                    Intent intent = new Intent(FeverCause.this, option3.class);
                    startActivity(intent);
                }


            }
        });

    }
}
