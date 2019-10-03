package br.senac.es.trabalhoHelpDesk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

import br.senac.es.trabalhoHelpDesk.model.Mensagem;
import br.senac.es.trabalhoHelpDesk.model.Status;

public class Solucao extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =
                inflater.inflate(R.layout.solucao, container, false);

        ListView listaDeChamadosTela = (ListView) view.findViewById(R.id.lista);
        List<Mensagem> listaMensagem = new ArrayList<Mensagem>();
        List<Mensagem> listaDeMensagensAbertas = new ArrayList<Mensagem>();


        Mensagem novaMensagem1 = new Mensagem(1L, "rennan", Status.SOLUCIONADOS);
        Mensagem novaMensagem2 = new Mensagem(2L, "Coquinha", Status.NAOENVIADA);
        Mensagem novaMensagem3 = new Mensagem(3L, "Luiz", Status.SOLUCIONADOS);
        Mensagem novaMensagem4 = new Mensagem(4L, "Zemerson", Status.ENVIADA);
        Mensagem novaMensagem5 = new Mensagem(5L, "Professor", Status.SOLUCIONADOS);
        Mensagem novaMensagem6 = new Mensagem(6L, "Thiaguinho", Status.NAOENVIADA);


        listaMensagem.add(novaMensagem1);
        listaMensagem.add(novaMensagem2);
        listaMensagem.add(novaMensagem3);
        listaMensagem.add(novaMensagem4);
        listaMensagem.add(novaMensagem5);
        listaMensagem.add(novaMensagem6);


        for (int i = 0; i < listaMensagem.size(); i++) {

            if (listaMensagem.get(i).getStatus().equals(Status.SOLUCIONADOS)) {
                listaDeMensagensAbertas.add(listaMensagem.get(i));

            } else {

            }
            ArrayAdapter<Mensagem> adapter = new ArrayAdapter<Mensagem>(getActivity(), android.R.layout.simple_list_item_1, listaDeMensagensAbertas);

            listaDeChamadosTela.setAdapter(adapter);


        }


        return view;
    }

}
