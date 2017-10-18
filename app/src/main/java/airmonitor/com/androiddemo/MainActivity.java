package airmonitor.com.androiddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    TextView tf1;
    public static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("HelloWorldActivity","______________onCreate execute______________");
        setContentView(R.layout.activity_main);
        tf1 = (TextView)findViewById(R.id.phone);
        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(clickAction);
    }

    // 登录事件

    Button.OnClickListener clickAction = new Button.OnClickListener() {

        public void onClick(View v){
            String name = "小花";
            tf1.setText(name);
            Toast.makeText(MainActivity.this,"登录按钮的点击事件",Toast.LENGTH_LONG).show();
            Log.v(TAG, "playAction: 打印登录事件");
            MainActivity.this.pushAction();
        }
    };

    // 跳转界面
    private void pushAction(){
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,ListActivity.class);
        MainActivity.this.startActivity(intent);
    }

}
