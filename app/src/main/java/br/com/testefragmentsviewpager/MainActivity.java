package br.com.testefragmentsviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.com.testefragmentsviewpager.adapters.FragmentsAdapter;
import br.com.testefragmentsviewpager.fragments.PrimeiroFragment;


public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // chama pelo id definido para o view pager
        viewPager = findViewById(R.id.view_pager);

        //posição definida pelo add, lista tem posição
        List<Fragment> listaFragments = new ArrayList<>();

        //metodo estatico é da classe, não da instância, por isso "PrimeiroFragment" (classe)
        listaFragments.add(PrimeiroFragment.newInstance("Primeiro"));
        listaFragments.add(PrimeiroFragment.newInstance("Segundo"));
        listaFragments.add(PrimeiroFragment.newInstance("Terceiro"));
        listaFragments.add(PrimeiroFragment.newInstance("Quarto"));

        FragmentsAdapter fragmentsAdapter = new FragmentsAdapter(getSupportFragmentManager(), listaFragments);

        viewPager.setAdapter(fragmentsAdapter);

        tabLayout = findViewById(R.id.tab_layout);

        //fala q o tab tá junto com o view pager

        tabLayout.setupWithViewPager(viewPager);



    }
}
