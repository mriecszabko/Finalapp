package szabo.fpv.umb.binarynator;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TransfersBetweenSystems extends AppCompatActivity {
private Spinner spinnerFrom,spinnerTo;
private Button generateExample,confirmResult,correctResult;
private EditText ETgetText;
private TextView randomExample,resultWarnning,correctResultTV;
private String fristSpinner,secondSpinner,returnedRandomExample;
private Boolean result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers_between_systems);
            Initialise();
            //


        generateExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fristSpinner= spinnerFrom.getSelectedItem().toString();
                secondSpinner = spinnerTo.getSelectedItem().toString();
                resultWarnning.setText(R.string.Space);
                returnedRandomExample = transferLogic.generateExmaple(fristSpinner);
                randomExample.setText(returnedRandomExample);
                correctResultTV.setText(R.string.Space);
            }
        });
        confirmResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fristSpinner = spinnerFrom.getSelectedItem().toString();
                    secondSpinner = spinnerTo.getSelectedItem().toString();
                    //TODO on slectedItemid retuned int value 0-3 rework switch
                    Log.d("hello", String.valueOf(spinnerFrom.getSelectedItemId()));

                   result = transferLogic.checkResult(fristSpinner,secondSpinner,ETgetText.getText().toString(),randomExample.getText().toString());
                   if(result == true){
                       resultWarnning.setText(R.string.CorrectResult);
                       resultWarnning.setTextColor(Color.GREEN);

                   }
                   else{
                       resultWarnning.setText(R.string.WarrningResult);
                       resultWarnning.setTextColor(Color.RED);

                   }


                }
            });
        correctResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fristSpinner = spinnerFrom.getSelectedItem().toString();
                secondSpinner = spinnerTo.getSelectedItem().toString();
                correctResultTV.setText( transferLogic.returnCorrectResult(fristSpinner,secondSpinner,randomExample.getText().toString()));

            }
        });




    }
    public void Initialise(){
        spinnerFrom = findViewById(R.id.SP_transferFrom);
        spinnerTo = findViewById(R.id.SP_transferTo);
        generateExample = findViewById(R.id.BT_GenerateExample);
        confirmResult = findViewById(R.id.BT_ConfrimResult);
        resultWarnning = findViewById(R.id.TV_ResultWarnning);
        ETgetText = findViewById(R.id.ET_Result);
        randomExample = findViewById(R.id.TV_ExampleRand);
        correctResult = findViewById(R.id.BT_CorrectResult);
        correctResultTV = findViewById(R.id.TV_CorrectResult);
    }


}