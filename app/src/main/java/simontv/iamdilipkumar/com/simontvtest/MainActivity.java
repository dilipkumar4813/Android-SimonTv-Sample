package simontv.iamdilipkumar.com.simontvtest;

import android.content.ContentValues;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        ContentValues newMessage = new ContentValues();
        newMessage.put(TestColumns.NAME, "test");
        newMessage.put(TestColumns.NUMBER, "number" + rand.nextInt());
        getContentResolver().insert(TestProvider.MainContacts.CONTENT_URI, newMessage);

        Cursor cursor = getContentResolver().query(TestProvider.MainContacts.CONTENT_URI, null, null, null, null);
        if (cursor != null) {
            if (cursor.moveToFirst()) {
                do {
                    Log.d(TAG, cursor.getString(1) + "\n" + cursor.getString(2));
                } while (cursor.moveToNext());
            }

            cursor.close();
        }
    }
}
