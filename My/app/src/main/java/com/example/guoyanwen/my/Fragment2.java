package com.example.guoyanwen.my;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fragment2 extends Fragment {
    private GridView gridView;
    private List<Map<String,Object>> list;
    private Map<String,Object> map;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment2,null);
        gridView=view.findViewById(R.id.gridview);
        fragment2();
        return view;
    }
    private void fragment2(){
        initData();
        String [] from = {"img","text"};
        int[] to ={R.id.img,R.id.text};
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),list, R.layout.book,from,to);

        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),list.get(position).get("text").toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initData(){
        int[] inoc={
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp,
                R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp, R.drawable.ic_dashboard_black_24dp
        };
        String[] label={
                "1","2","3","4","5","6","7","8",
                "1","2","3","4","5","6","7","8",
                "1","2","3","4","5","6","7","8",
                "1","2","3","4","5","6","7","8",
                "1","2","3","4","5","6","7","8"
        };
        list = new ArrayList<Map<String, Object>>();

        for(int i=0;i<label.length;i++){
            map = new HashMap<String,Object>();
            map.put("img",inoc[i]);
            map.put("text",label[i]);
            list.add(map);
        }

    }
}
