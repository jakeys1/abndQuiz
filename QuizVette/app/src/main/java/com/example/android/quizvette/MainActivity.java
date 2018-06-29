package com.example.android.quizvette;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int grade = 0;
    int radioGrade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitScore(View view){

        //Checks for the correct answers for the Radio button
        RadioButton designVette = (RadioButton)findViewById(R.id.gm_Design);
        boolean correctDesign = designVette.isChecked();
        RadioButton originVette = (RadioButton)findViewById(R.id.corvette_Name);
        boolean corvetteOrigin = originVette.isChecked();
        RadioButton homeCorvette = (RadioButton)findViewById(R.id.corvette_Home);
        boolean hCorvette = homeCorvette.isChecked();
        RadioButton uCorvette = (RadioButton)findViewById(R.id.unique_Corvette);
        boolean uVette = uCorvette.isChecked();
        RadioButton horsePower = (RadioButton)findViewById(R.id.six_Horse);
        boolean horseVette = horsePower.isChecked();
        RadioButton motoVette = (RadioButton)findViewById(R.id.corvette_Prototype);
        boolean aVette = motoVette.isChecked();

        //Checks for the correct answers for the Checkboxes
        CheckBox redInter = (CheckBox)findViewById(R.id.redInterior);
        boolean whiteRed = redInter.isChecked();
        CheckBox fiberGlass = (CheckBox)findViewById(R.id.fiberglassBody);
        boolean fgBody = fiberGlass.isChecked();
        CheckBox redPrice = (CheckBox)findViewById(R.id.reduced_price);
        boolean notPrice = redPrice.isChecked();

        CheckBox hpInprove = (CheckBox)findViewById(R.id.horsePower);
        boolean horseP = hpInprove.isChecked();
        CheckBox convert = (CheckBox)findViewById(R.id.dropTop);
        boolean rConvert = convert.isChecked();
        CheckBox eightCylinder = (CheckBox)findViewById(R.id.eight_cyl);
        boolean notCylinder = eightCylinder.isChecked();

        //Checks for the correct answer for the EditText
        EditText corvetteAns = (EditText)findViewById(R.id.correct_Vette);
        String correctVette = corvetteAns.getText().toString();
        if (correctVette.equalsIgnoreCase("Sting Ray")){
            grade = grade + 1;
        }

        if(correctDesign) {
            radioGrade = grade++;
        }
        if(corvetteOrigin) {
            radioGrade = grade++;
        }
        if(hCorvette) {
            radioGrade = grade++;
        }
        if(uVette) {
            radioGrade = grade++;
        }
        if(horseVette){
            radioGrade = grade++;
        }
        if(aVette){
            radioGrade = grade++;
        }

        if(notCylinder){
            grade = grade + 0;
            displayGrade(grade);
        }else if(fgBody && whiteRed){
            grade = grade++;
            displayGrade(grade);
        }

        if(notPrice){
            grade = grade + 0;
            displayGrade(grade);
        }else if( horseP && rConvert ){
            grade = grade++;
            displayGrade(grade);
        }

    }
    private void displayGrade(int number){
        TextView quizGrade = (TextView)findViewById(R.id.gradeScore);
        quizGrade.setText(grade + "/9");
    }
}
