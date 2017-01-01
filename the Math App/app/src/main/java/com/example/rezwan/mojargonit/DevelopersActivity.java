package com.example.rezwan.mojargonit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class DevelopersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
        int pos = 0;

        LinearLayout ll = (LinearLayout) findViewById(R.id.LLayout);

        ImageView image = (ImageView) findViewById(R.id.imageView1);
        image.setImageResource(getImageID(pos));

        TextView tv[] = new TextView[9];

        for(int i=0; i<9; i++)
        {
            tv[i] = new TextView(this);
            ll.addView(tv[i]);
        }

        int i=1;



        String str_links = "<a href='http://google.com'>Google</a><br /><a href='http://facebook.com'>Facebook</a>" +
                "br /><a href='http://gmail.com'>Gmail</a>"+"br /><a href='http://github'>Github</a>";

        tv[i].setText(data[pos][i++]);
        tv[i].setText(data[pos][i++]);
        tv[i].setText(data[pos][i++]);

        tv[i].setMovementMethod(LinkMovementMethod.getInstance());
        tv[i].setText( Html.fromHtml( "<a href='"+data[pos][i]+"'>Email: "+data[pos][i]+"</a>" ));
        i++;
        tv[i].setMovementMethod(LinkMovementMethod.getInstance());
        tv[i].setText( Html.fromHtml( "<a href='"+data[pos][i]+"'>Github: "+data[pos][i]+"</a>" ));
        i++;

        for(i=0; i<9; i++)
        {
            tv[i].setTextSize(18);
            tv[i].setGravity(Gravity.CENTER);
            tv[i].setTextColor(Color.parseColor("#228B22"));
        }

        int pos2 = 1;

        LinearLayout ll2 = (LinearLayout) findViewById(R.id.LLayout2);

        ImageView image2 = (ImageView) findViewById(R.id.imageView2);
        image2.setImageResource(getImageID2(pos2));

        TextView tv2[] = new TextView[9];

        for(int j=0; j<9; j++)
        {
            tv2[j] = new TextView(this);
            ll2.addView(tv2[j]);
        }

        int j=1;


//        String str_links2 = "<a href='http://google.com'>Google</a><br /><a href='http://facebook.com'>Facebook</a>" +
//                "br /><a href='http://gmail.com'>Gmail</a>"+"br /><a href='http://github'>Github</a>";

        tv2[j].setText(data[pos2][j++]);
        tv2[j].setText(data[pos2][j++]);
        tv2[j].setText(data[pos2][j++]);

        tv2[j].setMovementMethod(LinkMovementMethod.getInstance());
        tv2[j].setText( Html.fromHtml( "<a href='"+data[pos2][j]+"'>Email: "+data[pos2][j]+"</a>" ));
        j++;
        tv2[j].setMovementMethod(LinkMovementMethod.getInstance());
        tv2[j].setText( Html.fromHtml( "<a href='"+data[pos2][j]+"'>Github: "+data[pos2][j]+"</a>" ));
        j++;

        for(j=0; j<9; j++)
        {
            tv2[j].setTextSize(18);
            tv2[j].setGravity(Gravity.CENTER);
            tv2[j].setTextColor(Color.parseColor("#228B22"));
        }


    }

    private int getImageID(int pos) {
        // TODO Auto-generated method stub
        int i=0;
        return R.drawable.rez;

    }

    private int getImageID2(int pos2) {
        // TODO Auto-generated method stub
        int i=0;
        return R.drawable.arpan_new;

    }

    public void showMessage(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

        /**
         * Developers
         */

    String data[][] =
        {
                {
                        "Name : Md.Rezwanul Haque(Rezwan)",
                        "University : Khulna University of Engineering & Technonology(KUET)",
                        "Department : Computer Science & Engineering(CSE)",
                        "College : Rajshahi Govt. City College,Rajshahi ",
                        "https://r.haque.249.rh@gmail.com",
                        "https://github.com/rezwanulhaquerezwan"

                },
                {
                        "Name : Arpan Bhowmik",
                        "University : Khulna University of Engineering & Technonology(KUET)",
                        "Department : Computer Science & Engineering(CSE)",
                        "College : Dhaka College, Dhaka",
                        "https://bhowmik.arpan1@gmail.com",
                        "https://github.com/Arpancse"


                }

        };

}


