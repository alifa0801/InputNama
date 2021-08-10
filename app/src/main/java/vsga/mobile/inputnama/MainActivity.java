package vsga.mobile.inputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText InputNama;
    TextView hasilnya;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InputNama = (EditText)findViewById(R.id.InputNama);
        hasilnya = (TextView)findViewById(R.id.tampil);
        btn1 = (Button)findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                hasilnya.setText("Nama Anda: "+ InputNama.getText());
            }
        });
    }



//    public void TampilNama(View v){
//        label1.setText("Nama Anda: "+ TextNama.getText());
//    }
}