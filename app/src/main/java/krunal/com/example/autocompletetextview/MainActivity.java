package krunal.com.example.autocompletetextview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> listOfText = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfText.add("Mat");
        listOfText.add("Banana");
        listOfText.add("Cherry");
        listOfText.add("Date");
        listOfText.add("Grape");
        listOfText.add("Kiwi");
        listOfText.add("Mango");
        listOfText.add("Pear");
        listOfText.add("aa");
        listOfText.add("car");
        listOfText.add("cat");
        listOfText.add("Mango");

        AutoSuggestAdapter autoSuggestAdapter = new AutoSuggestAdapter(this,
                android.R.layout.simple_list_item_1, listOfText);


        AutoCompleteTextView autotext = findViewById(R.id.autoCompleteTextView);
        autotext.setAdapter(autoSuggestAdapter);
        autotext.setThreshold(1);//comparesion start from first character


    }


}
