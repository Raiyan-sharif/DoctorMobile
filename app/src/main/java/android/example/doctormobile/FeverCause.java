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
        final CheckBox c1 = (CheckBox)findViewById(R.id.checkBox1);
        Button checkResultBtn = (Button)findViewById(R.id.check_result_btn);

        checkResultBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String a = c1.getText().toString();
//                Toast.makeText(getApplicationContext(),"Em"+c1.isChecked(),Toast.LENGTH_LONG).show();

                if(c1.isChecked()){
//                    Toast.makeText(getApplicationContext(),"ok"+c1.isChecked(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(FeverCause.this, Results.class);
                    startActivity(intent);
                }

            }
        });

    }
}
