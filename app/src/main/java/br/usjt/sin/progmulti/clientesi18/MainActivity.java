package br.usjt.sin.progmulti.clientesi18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    public static final String BUSCA= "package br.usjt.sin.progmulti.clientesi18;"



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText= findViewById(R.idtxt_busca);

        public void buscaClientes(View view){
            String text = editText.getText().toString();
            Intent intent = new Intent (ListaClientesActivity.class);

            intent.putExtra(BUSCA, texto);
            startActivity(intent);

        }






        }


