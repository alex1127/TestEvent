package com.example.dello.testevent;

import android.app.Activity;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.util.Log;
import android.view.MotionEvent;

import com.example.dello.view.TouchEventChilds;
import com.example.dello.view.TouchEventUtil;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TouchEventChilds childs = (TouchEventChilds) findViewById(R.id.childs);
//        childs.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                Log.e("SUN", "ONTOUCH");
//                return  true;
//            }
//        });



    }

    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.w("sunzn", "TouchEventActivity | dispatchTouchEvent --> " + TouchEventUtil.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    public boolean onTouchEvent(MotionEvent event) {
        Log.w("sunzn", "TouchEventActivity | onTouchEvent --> " + TouchEventUtil.getTouchAction(event.getAction()));
        return super.onTouchEvent(event);
    }

}
