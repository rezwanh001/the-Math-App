package com.example.rezwan.mojargonit;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Level1Activity extends AppCompatActivity  {

    static final Set<Integer> linkedHashSet_Right = new LinkedHashSet<>();// Right Answer's Marks

    public int []clickCount = new int[10000];
    public int []flag = new int[10000];




    {
     dec();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        linkedHashSet_Right.clear();




        // Question - 1

        final Button myButton1 = (Button) findViewById(R.id.button1);
        final EditText myInput1 = (EditText) findViewById(R.id.editQues1);

        myButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (myInput1.getText().toString().equals("2")) {
                    myInput1.setEnabled(false);
                    myButton1.setBackgroundResource(R.drawable.right_click);
                    myButton1.setEnabled(false);


                    //clickCount[1] = 0;
                    if(flag[1] == 0){
                        linkedHashSet_Right.add(1);

                    }

                    showAlert_Right("rgt");

                } else {
                    clickCount[1] = clickCount[1] + 1;
                    if(clickCount[1] == 3){
                        Toast.makeText(getApplicationContext(), "Answer is: 2", Toast.LENGTH_LONG).show();
                        flag[1]  = 1;
                        myInput1.setEnabled(false);
                        myButton1.setBackgroundResource(R.drawable.cross_click);
                        myButton1.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[1] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 2", Toast.LENGTH_LONG).show();
                    clickCount[1] = 0;
                    flag[1] = 1;
                }
            }

        });
        // Database



        // Question - 2
        final Button myButton2 = (Button) findViewById(R.id.button2);
        final EditText myInput2 = (EditText) findViewById(R.id.editQues2);

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput2.getText().toString().equals("70")) {
                    myInput2.setEnabled(false);
                    myButton2.setBackgroundResource(R.drawable.right_click);
                    myButton2.setEnabled(false);

                    //clickCount[2] = 0;

                    showAlert_Right("rgt");
                    if(flag[2] == 0){
                        linkedHashSet_Right.add(2);
                    }


                }
                else {
                    clickCount[2] = clickCount[2] + 1;
                    if (clickCount[2] == 3){
                        flag[2] = 1;
                        myInput2.setEnabled(false);
                        myButton2.setBackgroundResource(R.drawable.cross_click);
                        myButton2.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[2] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 70", Toast.LENGTH_LONG).show();
                    clickCount[2] = 0;
                    flag[2] = 1;
                }

            }

        });

        //Question - 3
        final Button myButton3 = (Button) findViewById(R.id.button3);
        final EditText myInput3 = (EditText) findViewById(R.id.editQues3);

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput3.getText().toString().equals("1")) {
                    myInput3.setEnabled(false);
                    myButton3.setBackgroundResource(R.drawable.right_click);
                    myButton3.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[3] == 0){
                        linkedHashSet_Right.add(3);
                    }

                }
                else {
                    clickCount[3] = clickCount[3] + 1;
                    if (clickCount[3] == 3){
                        flag[3] = 1;
                        myInput3.setEnabled(false);
                        myButton3.setBackgroundResource(R.drawable.cross_click);
                        myButton3.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[3] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 1", Toast.LENGTH_LONG).show();
                    clickCount[3] = 0;
                    flag[3] = 1;
                }

            }

        });
        //Question - 4
        final Button myButton4 = (Button) findViewById(R.id.button4);
        final EditText myInput4 = (EditText) findViewById(R.id.editQues4);

        myButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput4.getText().toString().equals("3")) {
                    myInput4.setEnabled(false);
                    myButton4.setBackgroundResource(R.drawable.right_click);
                    myButton4.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[4] == 0){
                        linkedHashSet_Right.add(4);
                    }

                }
                else {
                    clickCount[4] = clickCount[4] + 1;
                    if (clickCount[4] == 3){
                        flag[4] = 1;
                        myInput4.setEnabled(false);
                        myButton4.setBackgroundResource(R.drawable.cross_click);
                        myButton4.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[4] == 4){
                    Toast.makeText(getApplicationContext(), "Answer is: 3", Toast.LENGTH_LONG).show();
                    clickCount[4] = 0;
                    flag[4] = 1;
                }

            }

        });

        //Question - 5
        final Button myButton5 = (Button) findViewById(R.id.button5);
        final EditText myInput5 = (EditText) findViewById(R.id.editQues5);

        myButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput5.getText().toString().equals("4")) {
                    myInput5.setEnabled(false);
                    myButton5.setBackgroundResource(R.drawable.right_click);
                    myButton5.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[5] == 0){
                        linkedHashSet_Right.add(5);
                    }

                }
                else {
                    clickCount[5] = clickCount[5] + 1;
                    if (clickCount[5] == 3){
                        flag[5] = 1;
                        myInput5.setEnabled(false);
                        myButton5.setBackgroundResource(R.drawable.cross_click);
                        myButton5.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[5] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 4", Toast.LENGTH_LONG).show();
                    clickCount[5] = 0;
                    flag[5] = 1;
                }

            }

        });

        //Question - 6
        final Button myButton6 = (Button) findViewById(R.id.button6);
        final EditText myInput6 = (EditText) findViewById(R.id.editQues6);

        myButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput6.getText().toString().equals("1")) {
                    myInput6.setEnabled(false);
                    myButton6.setBackgroundResource(R.drawable.right_click);
                    myButton6.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[6] == 0){
                        linkedHashSet_Right.add(6);
                    }

                }
                else {
                    clickCount[6] = clickCount[6] + 1;
                    if (clickCount[6] == 3){
                        flag[6] = 1;
                        myInput6.setEnabled(false);
                        myButton6.setBackgroundResource(R.drawable.cross_click);
                        myButton6.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[6] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 1", Toast.LENGTH_LONG).show();
                    clickCount[6] = 0;
                    flag[6] = 1;
                }

            }

        });
        // Question - 7
        final Button myButton7 = (Button) findViewById(R.id.button7);
        final EditText myInput7 = (EditText) findViewById(R.id.editQues7);

        myButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput7.getText().toString().equals("5106")) {
                    myInput7.setEnabled(false);
                    myButton7.setBackgroundResource(R.drawable.right_click);
                    myButton7.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[7] == 0){
                        linkedHashSet_Right.add(7);
                    }

                }
                else {
                    clickCount[7] = clickCount[7] + 1;
                    if (clickCount[7] == 3){
                        flag[7] = 1;
                        myInput7.setEnabled(false);
                        myButton7.setBackgroundResource(R.drawable.cross_click);
                        myButton7.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[7] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 5106", Toast.LENGTH_LONG).show();
                    clickCount[7] = 0;
                    flag[7] = 1;
                }

            }

        });
        // Question - 8
        final Button myButton8 = (Button) findViewById(R.id.button8);
        final EditText myInput8 = (EditText) findViewById(R.id.editQues8);

        myButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput8.getText().toString().equals("5")) {
                    myInput8.setEnabled(false);
                    myButton8.setBackgroundResource(R.drawable.right_click);
                    myButton8.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[8] == 0){
                        linkedHashSet_Right.add(8);
                    }

                }
                else {
                    clickCount[8] = clickCount[8] + 1;
                    if (clickCount[8] == 3){
                        flag[8] = 1;
                        myInput8.setEnabled(false);
                        myButton8.setBackgroundResource(R.drawable.cross_click);
                        myButton8.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[8] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 5", Toast.LENGTH_LONG).show();
                    clickCount[8] = 0;
                    flag[8] = 1;
                }

            }

        });

        // Question - 9
        final Button myButton9 = (Button) findViewById(R.id.button9);
        final EditText myInput9 = (EditText) findViewById(R.id.editQues9);

        myButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput9.getText().toString().equals("6")) {
                    myInput9.setEnabled(false);
                    myButton9.setBackgroundResource(R.drawable.right_click);
                    myButton9.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[9] == 0){
                        linkedHashSet_Right.add(9);
                    }

                }
                else {
                    clickCount[9] = clickCount[9] + 1;
                    if (clickCount[9] == 3){
                        flag[9] = 1;
                        myInput9.setEnabled(false);
                        myButton9.setBackgroundResource(R.drawable.cross_click);
                        myButton9.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[9] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 6", Toast.LENGTH_LONG).show();
                    clickCount[9] = 0;
                    flag[9] = 1;
                }

            }

        });
        // Question - 10
        final Button myButton10 = (Button) findViewById(R.id.button10);
        final EditText myInput10 = (EditText) findViewById(R.id.editQues10);

        myButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput10.getText().toString().equals("2")) {
                    myInput10.setEnabled(false);
                    myButton10.setBackgroundResource(R.drawable.right_click);
                    myButton10.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[10] == 0){
                        linkedHashSet_Right.add(10);
                    }

                }
                else {
                    clickCount[10] = clickCount[10] + 1;
                    if (clickCount[10] == 3){
                        flag[10] = 1;
                        myInput10.setEnabled(false);
                        myButton10.setBackgroundResource(R.drawable.cross_click);
                        myButton10.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[10] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 2", Toast.LENGTH_LONG).show();
                    clickCount[10] = 0;
                    flag[10] = 1;
                }

            }

        });
        // Question - 11 /// New Add

        final Button myButton11 = (Button) findViewById(R.id.button11);
        final EditText myInput11 = (EditText) findViewById(R.id.editQues11);

        myButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput11.getText().toString().equals("true")) {
                    myInput11.setEnabled(false);
                    myButton11.setBackgroundResource(R.drawable.right_click);
                    myButton11.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[11] == 0){
                        linkedHashSet_Right.add(11);
                    }

                }
                else {
                    clickCount[11] = clickCount[11] + 1;
                    if (clickCount[11] == 3){
                        flag[11] = 1;
                        myInput11.setEnabled(false);
                        myButton11.setBackgroundResource(R.drawable.cross_click);
                        myButton11.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[11] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: true", Toast.LENGTH_LONG).show();
                    clickCount[11] = 0;
                    flag[11] = 1;
                }

            }

        });
        // Question - 12
        final Button myButton12 = (Button) findViewById(R.id.button12);
        final EditText myInput12 = (EditText) findViewById(R.id.editQues12);

        myButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput12.getText().toString().equals("11")) {
                    myInput12.setEnabled(false);
                    myButton12.setBackgroundResource(R.drawable.right_click);
                    myButton12.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[12] == 0){
                        linkedHashSet_Right.add(12);
                    }

                }
                else {
                    clickCount[12] = clickCount[12] + 1;
                    if (clickCount[12] == 3){
                        flag[12] = 1;
                        myInput12.setEnabled(false);
                        myButton12.setBackgroundResource(R.drawable.cross_click);
                        myButton12.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[12] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 11", Toast.LENGTH_LONG).show();
                    clickCount[12] = 0;
                    flag[12] = 1;
                }

            }

        });
        // Question - 13
        final Button myButton13 = (Button) findViewById(R.id.button13);
        final EditText myInput13 = (EditText) findViewById(R.id.editQues13);

        myButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput13.getText().toString().equals("55")) {
                    myInput13.setEnabled(false);
                    myButton13.setBackgroundResource(R.drawable.right_click);
                    myButton13.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[13] == 0){
                        linkedHashSet_Right.add(13);
                    }

                }
                else {
                    clickCount[13] = clickCount[13] + 1;
                    if (clickCount[13] == 3){
                        flag[13] = 1;
                        myInput13.setEnabled(false);
                        myButton13.setBackgroundResource(R.drawable.cross_click);
                        myButton13.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[13] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 55", Toast.LENGTH_LONG).show();
                    clickCount[13] = 0;
                    flag[13] = 1;
                }

            }

        });
        //Question - 14
        final Button myButton14 = (Button) findViewById(R.id.button14);
        final EditText myInput14 = (EditText) findViewById(R.id.editQues14);

        myButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput14.getText().toString().equals("1")) {
                    myInput14.setEnabled(false);
                    myButton14.setBackgroundResource(R.drawable.right_click);
                    myButton14.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[14] == 0){
                        linkedHashSet_Right.add(14);
                    }

                }
                else {
                    clickCount[14] = clickCount[14] + 1;
                    if (clickCount[14] == 3){
                        flag[14] = 1;
                        myInput14.setEnabled(false);
                        myButton14.setBackgroundResource(R.drawable.cross_click);
                        myButton14.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[14] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 1", Toast.LENGTH_LONG).show();
                    clickCount[14] = 0;
                    flag[14] = 1;
                }

            }

        });
        //Question - 15
        final Button myButton15 = (Button) findViewById(R.id.button15);
        final EditText myInput15 = (EditText) findViewById(R.id.editQues15);

        myButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(myInput15.getText().toString().equals("100")) {
                    myInput15.setEnabled(false);
                    myButton15.setBackgroundResource(R.drawable.right_click);
                    myButton15.setEnabled(false);
                    showAlert_Right("rgt");
                    if(flag[15] == 0){
                        linkedHashSet_Right.add(15);
                    }

                }
                else {
                    clickCount[15] = clickCount[15] + 1;
                    if (clickCount[15] == 3){
                        flag[15] = 1;
                        myInput15.setEnabled(false);
                        myButton15.setBackgroundResource(R.drawable.cross_click);
                        myButton15.setEnabled(false);
                    }
                    showAlert_Wrong("wrg");
                }
                if(clickCount[15] == 3){
                    Toast.makeText(getApplicationContext(), "Answer is: 100", Toast.LENGTH_LONG).show();
                    clickCount[15] = 0;
                    flag[15] = 1;
                }

            }

        });



        // Marks
        Button mark = (Button) findViewById(R.id.mark);
        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //dblevel1.getFriends();

                //String s = dblevel1.getUser("l", 1, "dm");
                //Toast.makeText(getApplicationContext(), "Your Score is : " + s, Toast.LENGTH_SHORT).show();

                showMakrs();
            }
        });
        //Award
        Button award = (Button) findViewById(R.id.award);
        award.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                awardList();
            }
        });




    }


    public void showMakrs(){
        int m = 0;
        int R = linkedHashSet_Right.size();
        m = R*10;

        Toast.makeText(getApplicationContext(), "Your Score is : " + m, Toast.LENGTH_SHORT).show();
    }

    public void showAlert_Right(String view){

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Congratutions,Your Answer is Right!")
                .setPositiveButton("Continue...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("Welcome!")
                .setIcon(R.drawable.right_1)
                .create();
        myAlert.show();

    }
    public void showAlert_Wrong(String  view){

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Your Answer is Wrong!")
                .setPositiveButton("Try Again...", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("Oops! Wrong Answer")
                .setIcon(R.drawable.wrong)
                .create();
        myAlert.show();

    }

    public void dec(){
        for (int i=0; i<clickCount.length; i++){
            clickCount[i] = 0;
            flag[i] = 0;
        }

    }

    public void awardList(){
        int size  = linkedHashSet_Right.size();
        int marks = 0;
        marks = size*10;
        if(marks >=0 && marks <= 40){
            newbie(marks);
        }
        else if(marks == 50){
            pupil(marks);
        }
        else if(marks == 60){
            specialist(marks);
        }
        else if(marks == 70){
            expert(marks);
        }
        else if(marks >= 80 && marks <= 100){
            master(marks);
        }
        else if(marks >= 110 && marks <= 200){
            grandmaster(marks);
        }
    }

    public void newbie(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Newbie in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("NEWBIE")
                .setIcon(R.drawable.newbie)
                .create();
        myAlert.show();
    }

    public void pupil(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Pupil in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("PUPIL")
                .setIcon(R.drawable.pupil)
                .create();
        myAlert.show();
    }

    public void specialist(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Specialist in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("SPECIALIST")
                .setIcon(R.drawable.specialist)
                .create();
        myAlert.show();
    }
    public void expert(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Expert in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("EXPERT")
                .setIcon(R.drawable.expert)
                .create();
        myAlert.show();
    }
    public void master(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Master in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("MASTER")
                .setIcon(R.drawable.master)
                .create();
        myAlert.show();
    }

    public void grandmaster(int marks){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("You are Grandmaster in Level-1" + " & Scores : " + marks)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .setTitle("GRANDMASTER")
                .setIcon(R.drawable.grandmaster)
                .create();
        myAlert.show();
    }

    private void displayToast(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

}


