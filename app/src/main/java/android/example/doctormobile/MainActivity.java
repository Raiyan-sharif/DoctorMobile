package android.example.doctormobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText email;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInBtn = (Button) findViewById(R.id.sign_in_btn);
        email = (EditText) findViewById(R.id.email_etv);
        password = (EditText) findViewById(R.id.password_etv);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.getText().toString().equals("rappi@gmail.com") && password.getText().toString().equals("123456789")){
                    Intent intent = new Intent(MainActivity.this, UserPannel.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
