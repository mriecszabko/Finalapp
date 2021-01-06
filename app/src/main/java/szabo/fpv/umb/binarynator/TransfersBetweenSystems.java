package szabo.fpv.umb.binarynator;

import android.os.Bundle;
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
private EditText ETgetTex;
private TextView randomExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfers_between_systems);
            spinnerFrom = findViewById(R.id.SP_transferFrom);
            spinnerTo = findViewById(R.id.SP_transferTo);
            generateExample = findViewById(R.id.BT_GenerateExample);
            confirmResult = findViewById(R.id.BT_ConfrimResult);

         //   ETgetText = findViewById(R.id.ET_Result);
            randomExample = findViewById(R.id.TV_ExampleRand);


            generateExample.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String text;
                    String state = spinnerFrom.getSelectedItem().toString();
                    String state2 = spinnerTo.getSelectedItem().toString();
                    text = transferLogic.generateExmaple(state);
                    randomExample.setText(text);
                }
            });
            confirmResult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });



    }


}