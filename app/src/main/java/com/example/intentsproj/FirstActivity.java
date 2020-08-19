package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.ViewGroupCompat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA = "com.example.intentsproj.msg";
    public static final String EXTRA1 = "com.example.intentsproj.msg1";
    EditText editText1,editText2;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText1.findViewById(R.id.editTextNumber);
        editText2.findViewById(R.id.editTextNumber2);
        btn.findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //Creating the layoutInflater instance
                LayoutInflater li = getLayoutInflater();
                //Getting the view object as defined in the customer.xml file
                View layout = li.inflate(R.layout.customtoast,(ViewGroup) findViewById(R.id.custom_toast_layout));
                //creating the toast object

                Context context = getApplicationContext();//The context to use,usually your application or activity object
                CharSequence message = "You just clicked the OK button";
                //display string
                int duration = Toast.LENGTH_SHORT; //how long the toast message will lasts
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.TOP| Gravity.LEFT,0,0);
                toast.show();

                EditText editText = (EditText) findViewById(R.id.editTextNumber);
                String msg1 = editText.getText().toString();
                intent.putExtra(EXTRA,msg1);
                startActivity(intent);

                EditText editText1 = (EditText) findViewById(R.id.editTextNumber2);
                String msg2= editText.getText().toString();
                intent.putExtra(EXTRA1,msg2);
                startActivity(intent);

            }
        });

    }
}