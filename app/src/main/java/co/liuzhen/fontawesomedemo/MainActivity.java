package co.liuzhen.fontawesomedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        initList(list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_home);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(new Adapter(this, list));
    }


    private List<String> initList(List<String> list){
        list.add(getResources().getString(R.string.icon_a));
        list.add(getResources().getString(R.string.icon_b));
        list.add(getResources().getString(R.string.icon_c));
        list.add(getResources().getString(R.string.icon_d));
        list.add(getResources().getString(R.string.icon_e));
        list.add(getResources().getString(R.string.icon_f));
        list.add(getResources().getString(R.string.icon_g));
        list.add(getResources().getString(R.string.icon_h));
        list.add(getResources().getString(R.string.icon_i));
        list.add(getResources().getString(R.string.icon_j));
        list.add(getResources().getString(R.string.icon_k));
        list.add(getResources().getString(R.string.icon_l));
        list.add(getResources().getString(R.string.icon_m));
        list.add(getResources().getString(R.string.icon_n));
        list.add(getResources().getString(R.string.icon_o));
        list.add(getResources().getString(R.string.icon_p));
        list.add(getResources().getString(R.string.icon_q));
        list.add(getResources().getString(R.string.icon_r));
        list.add(getResources().getString(R.string.icon_s));
        list.add(getResources().getString(R.string.icon_t));
        list.add(getResources().getString(R.string.icon_u));
        list.add(getResources().getString(R.string.icon_v));
        list.add(getResources().getString(R.string.icon_w));
        list.add(getResources().getString(R.string.icon_x));
        list.add(getResources().getString(R.string.icon_y));
        list.add(getResources().getString(R.string.icon_z));
        list.add(getResources().getString(R.string.icon_end));

        return list;
    }
}
