package br.com.testefragmentsviewpager.adapters;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

// sempre implementar os metodos qdo extende, construtor tb

public class FragmentsAdapter extends FragmentStatePagerAdapter {

    //lista vai receber os fragments
    private List<Fragment> listaFragment;

    public FragmentsAdapter(FragmentManager fm, List<Fragment> listaFragment) {
        super(fm);
        this.listaFragment = listaFragment;
    }

    //acha o fragment na lista pela posição
    @Override
    public Fragment getItem(int i) {

        return listaFragment.get(i);
    }

    @Override
    public int getCount() {
        return listaFragment.size();
    }

    // seta no fragment o nome da página
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        //achar o fragment
        Fragment fragment = listaFragment.get(position);

        //recebe bundle
        Bundle bundle = fragment.getArguments();

        String titulo = bundle.getString("TITULO");

        return titulo;


    }
}
