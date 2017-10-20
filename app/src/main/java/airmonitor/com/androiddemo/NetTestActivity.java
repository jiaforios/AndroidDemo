package airmonitor.com.androiddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
public class NetTestActivity extends AppCompatActivity {
    public static final String TAG = "NetTestActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_test);
        Button net = (Button) findViewById(R.id.netButton);

        final TextView tokenView = (TextView)findViewById(R.id.tokenid);


        net.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v(TAG,"网络请求");

                /* post 加参数
                Request request = buildMultipartFormRequest(
                        url, new File[]{file}, new String[]{fileKey}, null);
                FormEncodingBuilder builder = new FormEncodingBuilder();
                builder.add("username","张鸿洋");

                Request request = new Request.Builder()
                        .url(url)
                        .post(builder.build())
                        .build();
                mOkHttpClient.newCall(request).enqueue(new Callback(){});

                */

                OkHttpClient okhttp = new OkHttpClient();
                String url0 = "https://kidwatch01.hojy.com/hgts/api/acountLogin?mobile=18682047063&password=52d4a83215565368f94d3e340e7125e7";
                Request request = new Request.Builder().url(url0).get().build();
                okhttp.newCall(request).enqueue(new Callback() {
                    @Override
                    public void onFailure(Call call, IOException e) {
                        Log.v(TAG,"返回数据"+e.getLocalizedMessage());

                    }

                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        if (response.isSuccessful()){

                            String json = response.body().string();
                            Log.v(TAG,"返回数据"+json);
                            Gson gson = new Gson();
                            Model model = gson.fromJson(json,new TypeToken<Model>(){}.getType());
                           final String token= model.getResult().getToken();
                            Log.v(TAG,"登录后token = "+token);
                            runOnUiThread(new Runnable() {
                                @Override
                                 public void run() {
                                    tokenView.setText(token);
                                }
                             });
                        }
                    }
                    
                });
            }
        });
    }
}
