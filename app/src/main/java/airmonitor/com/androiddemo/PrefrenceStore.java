package airmonitor.com.androiddemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.SharedPreferences.Editor;
import android.widget.TextView;

public class PrefrenceStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context ctx = PrefrenceStore.this;
        SharedPreferences sp = ctx.getSharedPreferences("SP",MODE_PRIVATE);

        setContentView(R.layout.activity_prefrence_store);
        TextView phone = (TextView)findViewById(R.id.acquire);
        phone.setText(sp.getString("phone","none"));


        Button store = (Button)findViewById(R.id.store);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 存储值
                Context ctx = PrefrenceStore.this;
                SharedPreferences sp = ctx.getSharedPreferences("SP",MODE_PRIVATE);
                Editor editor = sp.edit();
                editor.putString("phone","1591990");
                editor.commit();

            }
        });


    }
}
