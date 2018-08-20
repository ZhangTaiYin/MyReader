package com.example.guoyanwen.my;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fragment4 extends Fragment {
    private View view;
    private List<Map<String,String>> list;
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment4,null);
        listView = view.findViewById(R.id.userlist);
        fragment4();
        return view;
    }
    private void fragment4(){
        initData();
        String[] from={"title","content"};
        int[] to={R.id.title,R.id.content};
        SimpleAdapter adapter = new SimpleAdapter(getActivity(),list,R.layout.user,from,to);
        Toast.makeText(getActivity(),"this is My",Toast.LENGTH_SHORT).show();
        listView.setAdapter(adapter);
    }
    private void initData(){
        String[] title= {
                "姓名", "性别", "年龄", "生日", "其他"
        };
        String[] content={
                "张三","男","16","1996-06-06","五"
        };
        list=new ArrayList<Map<String,String>>();
        for(int i=0;i<content.length;i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("title", title[i]);
            map.put("content", content[i]);
            list.add(map);
        }
    }
}
