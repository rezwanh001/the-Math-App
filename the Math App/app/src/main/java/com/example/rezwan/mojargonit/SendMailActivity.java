package com.example.rezwan.mojargonit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SendMailActivity extends AppCompatActivity {
    EditText receiver, sub, msg;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_mail);

        receiver = (EditText)findViewById(R.id.editText);
        sub = (EditText)findViewById(R.id.editText2);
        msg = (EditText)findViewById(R.id.editText3);

        b = (Button)findViewById(R.id.button);

        addListnerOnButton();

    }

    public void addListnerOnButton(){
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = receiver.getText().toString();
                String subject = sub.getText().toString();
                String msgs = msg.getText().toString();

                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
                email.putExtra(Intent.EXTRA_SUBJECT, subject);
                email.putExtra(Intent.EXTRA_TEXT, msgs);

                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "Choose an Email Client : "));


            }
        });
    }
}
