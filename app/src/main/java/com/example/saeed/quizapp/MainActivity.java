package com.example.saeed.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    int marks = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setQuestions();
    }

    /**
     * This method is called when SUBMIT ANSWER button is pressed
     *
     */
    public void submitAnswer(View view){

        checkAnswer();  //Calling method to check answers and calculate points
        String text = "Your score " + marks + ". " ;

        if (marks < 5)
            text = text + "LEARN MORE!";
        else if (marks>=5 || marks<=9)
            text = text + "Good Result!";
        else
            text = text + "WOW Great Result";

        Toast toast = Toast.makeText(this,text,Toast.LENGTH_LONG);
        toast.show();   //Toast message appears to display the result
        marks = 0;  //Neutralizes points showing result
    }
    /**
     * This method set the questions and options
     */
    private void setQuestions(){

        TextView appDescription = (TextView) findViewById(R.id.appDescription);
        appDescription.setText("This is a quiz application designed for UDACITY project. " +
                "The following quiz is about ISTANBUL.");

        //Questions of the quiz
         String questions[] =  { "1. Istanbul is a city of",
                "2. The famous İstiklal Avenue which stretches from Taksim Square to Tünel is in",
                "3. The covered bazaar of Istanbul, which was built in 1660, is called",
                "4. The largest mosque in Istanbul is",
                "5. Galata tower was built in 1348 by",
                "6. What legendary warrior is said to be buried in Gebze, near Istanbul?",
                "7. The primary residence of the Ottoman sultans for approximately 400 years (1465–1856) was",
                "8. Hagia Sophia is now a",
                "9. The largest of the Princes' Islands in Marmara Sea is",
                "10. By what other name is the Kiz Kulesi known?"};


        TextView question1 = (TextView) findViewById(R.id.question1);
        TextView question2 = (TextView) findViewById(R.id.question2);
        TextView question3 = (TextView) findViewById(R.id.question3);
        TextView question4 = (TextView) findViewById(R.id.question4);
        TextView question5 = (TextView) findViewById(R.id.question5);
        TextView question6 = (TextView) findViewById(R.id.question6);
        TextView question7 = (TextView) findViewById(R.id.question7);
        TextView question8 = (TextView) findViewById(R.id.question8);
        TextView question9 = (TextView) findViewById(R.id.question9);
        TextView question10 = (TextView) findViewById(R.id.question10);

        //Options for the answer to each question respectively
        //String options1[] = {"Turkey","Jordan","Pakistan"};
        String options2[] = {"Sultan Ahmet","Beyoglu","Fatih"};
        String options3[] = {"Mısır çarşısı","Çiçek Pasajı","Kapalı çarşı"};
        String options4[] = {"Çamlıca Cami "," Sultanahmet","Süleymaniye"};
        String options5[] = {"Turks","Byzantine Greeks","Genoese"};
        String options6[] = {"Alexander the Great","Tamerlane","Hannibal"};
        String options7[] = {"Dolmabahçe Palace","Topkapi Palace","Beylerbeyi Palace"};
        String options8[] = {"Church","Mosque","Museum"};
        String options9[] = {"Heybeli Island","Buyukada","Kinaliada"};
        String options10[] = {"Galata Tower","Maiden’s Tower","Marble Tower"};

        question1.setText(questions[0]);
        question2.setText(questions[1]);
        question3.setText(questions[2]);
        question4.setText(questions[3]);
        question5.setText(questions[4]);
        question6.setText(questions[5]);
        question7.setText(questions[6]);
        question8.setText(questions[7]);
        question9.setText(questions[8]);
        question10.setText(questions[9]);

        EditText editText1 = (EditText) findViewById(R.id.editText1);

        RadioButton radioButton21 = (RadioButton) findViewById(R.id.radioButton21);
        RadioButton radioButton22 = (RadioButton) findViewById(R.id.radioButton22);
        RadioButton radioButton23 = (RadioButton) findViewById(R.id.radioButton23);

        CheckBox checkBox31 = (CheckBox) findViewById(R.id.checkBox31);
        CheckBox checkBox32 = (CheckBox) findViewById(R.id.checkBox32);
        CheckBox checkBox33 = (CheckBox) findViewById(R.id.checkBox33);

        CheckBox checkBox41 = (CheckBox) findViewById(R.id.checkBox41);
        CheckBox checkBox42 = (CheckBox) findViewById(R.id.checkBox42);
        CheckBox checkBox43 = (CheckBox) findViewById(R.id.checkBox43);

        CheckBox checkBox51 = (CheckBox) findViewById(R.id.checkBox51);
        CheckBox checkBox52 = (CheckBox) findViewById(R.id.checkBox52);
        CheckBox checkBox53 = (CheckBox) findViewById(R.id.checkBox53);

        CheckBox checkBox61 = (CheckBox) findViewById(R.id.checkBox61);
        CheckBox checkBox62 = (CheckBox) findViewById(R.id.checkBox62);
        CheckBox checkBox63 = (CheckBox) findViewById(R.id.checkBox63);

        CheckBox checkBox71 = (CheckBox) findViewById(R.id.checkBox71);
        CheckBox checkBox72 = (CheckBox) findViewById(R.id.checkBox72);
        CheckBox checkBox73 = (CheckBox) findViewById(R.id.checkBox73);

        CheckBox checkBox81 = (CheckBox) findViewById(R.id.checkBox81);
        CheckBox checkBox82 = (CheckBox) findViewById(R.id.checkBox82);
        CheckBox checkBox83 = (CheckBox) findViewById(R.id.checkBox83);

        CheckBox checkBox91 = (CheckBox) findViewById(R.id.checkBox91);
        CheckBox checkBox92 = (CheckBox) findViewById(R.id.checkBox92);
        CheckBox checkBox93 = (CheckBox) findViewById(R.id.checkBox93);

        CheckBox checkBox101 = (CheckBox) findViewById(R.id.checkBox101);
        CheckBox checkBox102 = (CheckBox) findViewById(R.id.checkBox102);
        CheckBox checkBox103 = (CheckBox) findViewById(R.id.checkBox103);





        radioButton21.setText(options2[0]);
        radioButton22.setText(options2[1]);
        radioButton23.setText(options2[2]);

        checkBox31.setText(options3[0]);
        checkBox32.setText(options3[1]);
        checkBox33.setText(options3[2]);

        checkBox41.setText(options4[0]);
        checkBox42.setText(options4[1]);
        checkBox43.setText(options4[2]);

        checkBox51.setText(options5[0]);
        checkBox52.setText(options5[1]);
        checkBox53.setText(options5[2]);

        checkBox61.setText(options6[0]);
        checkBox62.setText(options6[1]);
        checkBox63.setText(options6[2]);

        checkBox71.setText(options7[0]);
        checkBox72.setText(options7[1]);
        checkBox73.setText(options7[2]);

        checkBox81.setText(options8[0]);
        checkBox82.setText(options8[1]);
        checkBox83.setText(options8[2]);

        checkBox91.setText(options9[0]);
        checkBox92.setText(options9[1]);
        checkBox93.setText(options9[2]);

        checkBox101.setText(options10[0]);
        checkBox102.setText(options10[1]);
        checkBox103.setText(options10[2]);
    }

        public void checkAnswer(){

            EditText editText1 = (EditText) findViewById(R.id.editText1);

            RadioButton radioButton21 = (RadioButton) findViewById(R.id.radioButton21);
            RadioButton radioButton22 = (RadioButton) findViewById(R.id.radioButton22);
            RadioButton radioButton23 = (RadioButton) findViewById(R.id.radioButton23);

            CheckBox checkBox31 = (CheckBox) findViewById(R.id.checkBox31);
            CheckBox checkBox32 = (CheckBox) findViewById(R.id.checkBox32);
            CheckBox checkBox33 = (CheckBox) findViewById(R.id.checkBox33);

            CheckBox checkBox41 = (CheckBox) findViewById(R.id.checkBox41);
            CheckBox checkBox42 = (CheckBox) findViewById(R.id.checkBox42);
            CheckBox checkBox43 = (CheckBox) findViewById(R.id.checkBox43);

            CheckBox checkBox51 = (CheckBox) findViewById(R.id.checkBox51);
            CheckBox checkBox52 = (CheckBox) findViewById(R.id.checkBox52);
            CheckBox checkBox53 = (CheckBox) findViewById(R.id.checkBox53);

            CheckBox checkBox61 = (CheckBox) findViewById(R.id.checkBox61);
            CheckBox checkBox62 = (CheckBox) findViewById(R.id.checkBox62);
            CheckBox checkBox63 = (CheckBox) findViewById(R.id.checkBox63);

            CheckBox checkBox71 = (CheckBox) findViewById(R.id.checkBox71);
            CheckBox checkBox72 = (CheckBox) findViewById(R.id.checkBox72);
            CheckBox checkBox73 = (CheckBox) findViewById(R.id.checkBox73);

            CheckBox checkBox81 = (CheckBox) findViewById(R.id.checkBox81);
            CheckBox checkBox82 = (CheckBox) findViewById(R.id.checkBox82);
            CheckBox checkBox83 = (CheckBox) findViewById(R.id.checkBox83);

            CheckBox checkBox91 = (CheckBox) findViewById(R.id.checkBox91);
            CheckBox checkBox92 = (CheckBox) findViewById(R.id.checkBox92);
            CheckBox checkBox93 = (CheckBox) findViewById(R.id.checkBox93);

            CheckBox checkBox101 = (CheckBox) findViewById(R.id.checkBox101);
            CheckBox checkBox102 = (CheckBox) findViewById(R.id.checkBox102);
            CheckBox checkBox103 = (CheckBox) findViewById(R.id.checkBox103);

            /**
             * Checking answers in if-statements
             */
            if (editText1.getText().toString().toLowerCase() == "istanbul" ) {
                marks = marks + 1;
            }

            if (radioButton22.isChecked()) {
                if (radioButton21.isChecked() || radioButton23.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox33.isChecked()) {
                if (checkBox32.isChecked() || checkBox31.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox41.isChecked()) {
                if (checkBox42.isChecked() || checkBox43.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox53.isChecked()) {
                if (checkBox52.isChecked() || checkBox51.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox63.isChecked()) {
                if (checkBox62.isChecked() || checkBox61.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox72.isChecked()) {
                if (checkBox71.isChecked() || checkBox73.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox83.isChecked()) {
                if (checkBox81.isChecked() || checkBox82.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox92.isChecked()) {
                if (checkBox91.isChecked() || checkBox93.isChecked());
                else
                    marks = marks + 1;
            }

            if (checkBox102.isChecked()) {
                if (checkBox101.isChecked() || checkBox103.isChecked());
                else
                    marks = marks + 1;
            }
            /**
            * Once the app check for answer the answers are uncheck to reset the app.
            * */
            editText1.setText("");

            radioButton21.setChecked(false);
            radioButton22.setChecked(false);
            radioButton23.setChecked(false);

            checkBox31.setChecked(false);
            checkBox32.setChecked(false);
            checkBox33.setChecked(false);

            checkBox41.setChecked(false);
            checkBox42.setChecked(false);
            checkBox43.setChecked(false);

            checkBox51.setChecked(false);
            checkBox52.setChecked(false);
            checkBox53.setChecked(false);

            checkBox61.setChecked(false);
            checkBox62.setChecked(false);
            checkBox63.setChecked(false);

            checkBox71.setChecked(false);
            checkBox72.setChecked(false);
            checkBox73.setChecked(false);

            checkBox81.setChecked(false);
            checkBox82.setChecked(false);
            checkBox83.setChecked(false);

            checkBox91.setChecked(false);
            checkBox92.setChecked(false);
            checkBox93.setChecked(false);

            checkBox101.setChecked(false);
            checkBox102.setChecked(false);
            checkBox103.setChecked(false);
        }




}
