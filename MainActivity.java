package sg.edu.np.mad.week3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final String title = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(title, "Created!");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v(title, "App Running");

        final EditText etUsername = findViewById(R.id.editTextText);
        final EditText etpassword = findViewById(R.id.editTextText2);
        final Button loginButton = findViewById(R.id.button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, MainActivity2.class);
                myIntent.putExtra("Username", etUsername.getText().toString());
                myIntent.putExtra("Password", etpassword.getText().toString());
                startActivity(myIntent);
                Log.v(title, "Username" + etUsername.getText().toString() + " : Password" + etpassword.getText().toString());
            }
        });
    }
}