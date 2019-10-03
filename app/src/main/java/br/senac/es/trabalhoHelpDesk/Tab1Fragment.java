package br.senac.es.trabalhoHelpDesk;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import androidx.fragment.app.Fragment;

import com.google.gson.Gson;

import br.senac.es.trabalhoHelpDesk.API.MensagemTask;
import br.senac.es.trabalhoHelpDesk.API.OnEventListener;
import br.senac.es.trabalhoHelpDesk.model.MensagemWrapper;


public class Tab1Fragment extends Fragment {
    ListView listViewMensagensEnviadas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
final View view = inflater.inflate(R.layout.fragment_one, container, false);

        MensagemTask mensagemTask = new MensagemTask(view.getContext(), new OnEventListener<String>() {
            @Override
            public void onSuccess(String result) {
                Toast.makeText(view.getContext(), "SUCCESS: "+result, Toast.LENGTH_LONG).show();
//                Log.e("JSON",result);
                Gson gson = new Gson();
                MensagemWrapper[] mensagens = gson.fromJson(result, MensagemWrapper[].class);
                ArrayAdapter<MensagemWrapper> adapter = new ArrayAdapter<MensagemWrapper>(getActivity(),android.R.layout.simple_list_item_1, mensagens);

                listViewMensagensEnviadas = (ListView) view.findViewById(R.id.lista);
                listViewMensagensEnviadas.setAdapter(adapter);
            }

            @Override
            public void onFailure(Exception e) {
                Toast.makeText(view.getContext(),"ERROR: " + e.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
        mensagemTask.execute();
        return view;
    }
}