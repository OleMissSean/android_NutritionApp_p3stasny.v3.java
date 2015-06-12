package edu.olemiss.p3stasnyv3;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button B_callNutrInfo = (Button) (findViewById(R.id.B_callNutrInfo));
        B_callNutrInfo.setOnClickListener(nutrInfoListener);

        ImageView clicker = (ImageView) (findViewById(R.id.clickz));
        clicker.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ImageView iv = (ImageView) (findViewById(R.id.iv));
                Random r = new Random();
                int ranNum = r.nextInt(8);
                Resources res = getResources();

                String[] nameArr2 = res.getStringArray(R.array.nameArray2);

                TextView type = (TextView)(findViewById(R.id.type));
                type.setText(nameArr2[ranNum]);

                //*This satisfies the Drawable Concept
                //Pictures from: https://en.wikipedia.org/wiki/B_vitamins
                //http://stackoverflow.com/questions/9156698/how-to-get-images-dynamically-from-drawable-folder
                String uri = "@drawable/" + imageName(ranNum);

                int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                Drawable res2 = getResources().getDrawable(imageResource);
                iv.setImageDrawable(res2);
                return false;
            }
        });
    }

    public String imageName(int num)
    {
        Resources res = getResources();

        String[] nameArr = res.getStringArray(R.array.nameArray);
        String ret = nameArr[num];
        showToast(ret);
        return ret;
    }

    public void showToast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public View.OnClickListener nutrInfoListener = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            Intent i = new Intent("edu.olemiss.NutrInfo");
            startActivity(i);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
