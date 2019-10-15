package com.anaaa.biodataanaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtnpm;
    TextView txtnama;
    TextView txtalamat;
    TextView txtprodi;
    EditText editnpm;
    EditText editnama;
    EditText editalamat;
    EditText editprodi;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnpm = (TextView) findViewById(R.id.txtnpm);
        txtnama = (TextView) findViewById(R.id.txtnama);
        txtalamat = (TextView) findViewById(R.id.txtalamat);
        txtprodi = (TextView) findViewById(R.id.txtoprodi);
        editnpm = (EditText) findViewById(R.id.editnpm);
        editnama = (EditText) findViewById(R.id.editnama);
        editalamat = (EditText) findViewById(R.id.editalamat);
        editprodi = (EditText) findViewById(R.id.editprodi);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strnpm = editnpm.getText().toString();
                String strnama = editnama.getText().toString();
                String stralamat = editalamat.getText().toString();
                String strprodi = editprodi.getText().toString();

                txtnpm.setText(strnpm);
                txtnama.setText(strnama);
                txtalamat.setText(stralamat);
                txtprodi.setText(strprodi);
            }
        });
    }
}
