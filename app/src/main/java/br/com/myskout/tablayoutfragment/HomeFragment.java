package br.com.myskout.tablayoutfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    ListView lstGatos;

    //Criando os dados
    String nomeGato[] = {"Soneca", "Juma", "Toby", "Mingau"};
    String descricaoGato[] = {"Quero ser adotado, sou preguiçoso e gosto de dormir", "Gosto de humanos e de carinho", "Quero uma casa e família", "Sou carinhoso e cheiroso"};
    String numGato[] = {"10.0", "10.0", "10.0", "10.0"};
    int imgGato[] = {
            R.drawable.cat, R.drawable.cat_um,
            R.drawable.cat_dois, R.drawable.cat_tres
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstGatos = view.findViewById(R.id.lstGatos);

        //instanciando a classe adaptadora
        AdapterGatos adapterGatos = new AdapterGatos();

        //carregar lista com adaptador
        lstGatos.setAdapter(adapterGatos);
        return view;
    }
    //CRIANDO INNER CLASS
    public class AdapterGatos extends BaseAdapter{

        @Override
        public int getCount() {
            return nomeGato.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            //Declarando as variáveis do modelo
            TextView txtNomeGato, txtDescricaodoGato, txtNumGato;
            ImageView imagemGato;

            //Instanciando a janela do Adapter
            View v = getLayoutInflater().inflate(R.layout.modelo_gatos, null);

            txtNomeGato = v.findViewById(R.id.txtNomeGato);
            txtDescricaodoGato = v.findViewById(R.id.txtDescricaoGato);
            txtNumGato = v.findViewById(R.id.txtNumGato);
            imagemGato = v.findViewById(R.id.imgModeloGato);

            //Inserindo valores nos objetos do modelo
            txtNomeGato.setText(nomeGato[i]);
            txtDescricaodoGato.setText(descricaoGato[i]);
            txtNumGato.setText(numGato[i]);
            imagemGato.setImageResource(imgGato[i]);


            return v;
        }
    }
}