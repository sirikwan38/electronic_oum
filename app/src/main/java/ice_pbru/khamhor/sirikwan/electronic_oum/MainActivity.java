package ice_pbru.khamhor.sirikwan.electronic_oum;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button aboutmeButton;
    private ListView electroniclistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //bind widget
        bindWidget();
        buttonController();
        createListView();






    }//Main Metod

    private void createListView() {
        final int[] intIcon = {R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6,
                R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10, R.drawable.a11, R.drawable.a12, R.drawable.a13, R.drawable.a14,
                R.drawable.a15, R.drawable.a16, R.drawable.a17, R.drawable.a18, R.drawable.a19, R.drawable.a20};

        final String[] titleStrings = new String[20];
        titleStrings[0] = "ภาพ1";
        titleStrings[1] = "ภาพ1";
        titleStrings[2] = "ภาพ1";
        titleStrings[3] = "ภาพ1";
        titleStrings[4] = "ภาพ1";
        titleStrings[5] = "ภาพ1";
        titleStrings[6] = "ภาพ1";
        titleStrings[7] = "ภาพ1";
        titleStrings[8] = "ภาพ1";
        titleStrings[9] = "ภาพ1";
        titleStrings[10] = "ภาพ1";
        titleStrings[11] = "ภาพ1";
        titleStrings[12] = "ภาพ1";
        titleStrings[13] = "ภาพ1";
        titleStrings[14] = "ภาพ1";
        titleStrings[15] = "ภาพ1";
        titleStrings[16] = "ภาพ1";
        titleStrings[17] = "ภาพ1";
        titleStrings[18] = "ภาพ1";
        titleStrings[19] = "ภาพ1";
        titleStrings[20] = "ภาพ1";


    }//create list view

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
            }
        });


    }//button controller

    private void bindWidget() {
        aboutmeButton = (Button) findViewById(R.id.button);
        electroniclistview = (ListView) findViewById(R.id.listView);
    }//bind widget


}//Main Class

