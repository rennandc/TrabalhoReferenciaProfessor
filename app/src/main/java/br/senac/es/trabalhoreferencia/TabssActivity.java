package br.senac.es.trabalhoreferencia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;



import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;


public class TabssActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private  TabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabss);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

adapter = new TabAdapter(getSupportFragmentManager());
adapter.addFragment(new Tab1Fragment(),"ENVIADAS");
adapter.addFragment(new Solucao(),"SOLUÇÃO");
adapter.addFragment(new Tab2Fragment(),"FECHADAS");
viewPager.setAdapter(adapter);
tabLayout.setupWithViewPager(viewPager);


    }
}
