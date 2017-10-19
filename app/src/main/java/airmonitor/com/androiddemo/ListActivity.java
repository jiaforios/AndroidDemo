package airmonitor.com.androiddemo;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    public  static  final String TAG = "ListActivity";
     ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Button back = (Button) findViewById(R.id.backid);
        back.setOnClickListener(backAction);

        list = (ListView) findViewById(R.id.listview);
        //组织数据源
        List<HashMap<String, String>> mylist = new ArrayList<HashMap<String, String>>();
        final List<String> dataSource = new ArrayList<String>();
        dataSource.add("音乐");
        dataSource.add("视频");
        dataSource.add("图片");
        dataSource.add("数据库");
        dataSource.add("网络");
        dataSource.add("本地存储");
        dataSource.add("传值");
        dataSource.add("通知");
        dataSource.add("照相机");
        dataSource.add("相册");

        for(int i=0;i<10;i++) {
            HashMap<String, String> map = new HashMap<String, String>();
            map.put("itemTitle", dataSource.get(i));
            mylist.add(map);
        }
        //配置适配器
        SimpleAdapter adapter = new SimpleAdapter(this,
                mylist,//数据源
                R.layout.item,//显示布局
                new String[] {"itemTitle"}, //数据源的属性字段
                new int[] {R.id.title}); //布局里的控件id
        //添加并且显示
        list.setAdapter(adapter);


       list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Log.v(TAG, "点击"+dataSource.get(i));

               if (i == 5){ // 本地存储
                   Intent intent = new Intent();
                   intent.setClass(ListActivity.this,PrefrenceStore.class);
                   ListActivity.this.startActivity(intent);
               }

           }
       });

    }

    Button.OnClickListener backAction = new Button.OnClickListener(){

        public void onClick(View v){
            finish();
        }
    };


}
