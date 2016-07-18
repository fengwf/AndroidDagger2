package cn.woblog.androiddagger2;

import android.location.LocationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    //可以看到我们没有显示的初始化LocationManager
    @Inject
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_info = (TextView) findViewById(R.id.tv_info);

        //注解依赖
        ((AppApplication) getApplication()).component().inject(this);

        tv_info.setText(locationManager.toString());
    }
}
