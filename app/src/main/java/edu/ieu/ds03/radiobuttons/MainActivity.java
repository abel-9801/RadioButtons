package edu.ieu.ds03.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RadioButton radioDeposito;
    private RadioGroup grupo;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup contenedor = (RadioGroup) findViewById(R.id.grupo_dias);
        RadioButton opcionI2 = (RadioButton) contenedor.getChildAt(2);
        contenedor.check(opcionI2.getId());
    }
    public void comprobarModoPago(View v){
        if (radioDeposito.isChecked()){
            final String text = "Comprobar ubicación del usuario";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
        }
}
}