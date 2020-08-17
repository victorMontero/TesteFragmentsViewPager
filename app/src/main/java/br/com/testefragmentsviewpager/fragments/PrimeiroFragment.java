package br.com.testefragmentsviewpager.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import br.com.testefragmentsviewpager.R;
import br.com.testefragmentsviewpager.adapters.FragmentsAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {

    private TextView tituloTextView;


    public PrimeiroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        Bundle bundle = getArguments();

        String titulo = bundle.getString("TITULO");

        tituloTextView = view.findViewById(R.id.titulo_text_view);

        tituloTextView.setText(titulo);

        return view;
    }

    //static usa classe (pesquisar)
    public static PrimeiroFragment newInstance(String titulo){
        PrimeiroFragment primeiroFragment = new PrimeiroFragment();

        Bundle bundle = new Bundle();

        bundle.putString("TITULO", titulo);

        primeiroFragment.setArguments(bundle);

        return primeiroFragment;
    }

}
