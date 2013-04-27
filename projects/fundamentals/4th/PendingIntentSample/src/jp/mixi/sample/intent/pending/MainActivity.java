
package jp.mixi.sample.intent.pending;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intent の準備。明示的 Intent でも、暗黙的 Intent でもどちらでも構わない
        Intent intent = new Intent(this, SubActivity.class);

        // PendingIntent オブジェクトの生成。このオブジェクトを他のアプリに渡すことで、引数に渡した Intent の送信を委ねることができる
        PendingIntent activityIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }
}