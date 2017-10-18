package airmonitor.com.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List dataSource = new ArrayList();
     ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Button back = (Button) findViewById(R.id.backid);
        back.setOnClickListener(backAction);

        setInfo();
        list = (ListView) findViewById(R.id.listview);
        list.setAdapter(new ListViewAdapter(dataSource));

    }

    Button.OnClickListener backAction = new Button.OnClickListener(){

        public void onClick(View v){
            finish();
        }
    };
    public class ListViewAdapter extends BaseAdapter {
        View[] itemViews;

        public ListViewAdapter(List mlistInfo) {
            // TODO Auto-generated constructor stub
            itemViews = new View[mlistInfo.size()];
            for(int i=0;i<mlistInfo.size();i++){
                String getInfo=(String) mlistInfo.get(i);    //获取第i个对象
                //调用makeItemView，实例化一个Item
                itemViews[i] = makeItemView();
            }
        }

        public int getCount() {
            return itemViews.length;
        }

        public View getItem(int position) {
            return itemViews[position];
        }

        public long getItemId(int position) {
            return position;
        }

        //绘制Item的函数
        private View makeItemView() {
            LayoutInflater inflater = (LayoutInflater) ListActivity.this
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            // 使用View的对象itemView与R.layout.item关联
            View itemView = inflater.inflate(R.layout.item, null);
            // 通过findViewById()方法实例R.layout.item内各组件
            TextView title = (TextView) itemView.findViewById(R.id.title);
            title.setText("1111");    //填入相应的值
            TextView text = (TextView) itemView.findViewById(R.id.info);
            text.setText("22222");

            return itemView;
        }


        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null)
                return itemViews[position];
            return convertView;
        }
    }

    public  void setInfo(){
        dataSource.clear();
        int i = 0;
        while (i<10){
            dataSource.add("row"+i);
            i++;
        }
    }
}
