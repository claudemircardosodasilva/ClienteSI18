package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.os.Bundle;

public class ListaClientesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivit.BUSCA);
        ListView listView = findViewById(R.id.lista_clientes;
        ArrayList<String> Clientes = this.clientes();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, clientes);
        listView.setAdapter(adapter);
        



    }

    private ArrayList<String> clientes(){}
    ArrayList<String> lista = new ArrayList<>();

        lista.add("Carlos Drummond de Andrade");
        lista.add("Manuel Bandeira");
        lista.add("Olavo Bilac");
        lista.add("Vinícius de Moraes");
        lista.add("Cecília Meireles");
        lista.add("Castro Alves");
        lista.add("Gonçalves Dias");
        lista.add("Ferreira Gullar");
        lista.add("Machado de Assis");
        lista.add("Mário de Andrade");
        lista.add("Cora Coralina");
        lista.add("Manoel de Barros");
        lista.add("João Cabral de Melo Neto");
        lista.add("Casimiro de Abreu");
        lista.add("Paulo Leminski");
        lista.add("Álvares de Azevedo");
        lista.add("Guilherme de Almeida");
        lista.add("Alphonsus de Guimarães");
        lista.add("Mário Quintana");
        lista.add("Gregório de Matos");
        lista.add("Augusto dos Anjos");

    return list;

}
