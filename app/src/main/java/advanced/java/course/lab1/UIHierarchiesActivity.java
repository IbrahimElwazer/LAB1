package advanced.java.course.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UIHierarchiesActivity extends AppCompatActivity {

    //this is the main method of the app, that will run at first when the app start running
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //we are calling our activity_main.xml file here
        setContentView(R.layout.ui_hierarchies_layout);

        //Here we define an array called "COUNTRIES" with the list of countries
        //that start with the letter 'A' represented as strings
        final String[] COUNTRIES = new String[]{

                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };

        //Here we call the ListView component from activity_main.xml file with its id
        //that we gave and save it into "myListView" variable
        ListView myListView = (ListView) findViewById(R.id.country_list_view);

        //The ArrayAdapter converts the ArrayList of objects into a View so it can be rendered in the ListView
        //Here we create an ArrayAdapter with the name "array_adapter", with the type of the
        //item that will be converted into a View being a string (we set the type with <String>)
        final ArrayAdapter<String> array_adapter;
        //Here we instantiate the ArrayAdapter (create a new object from it) and attach it to our ListView,
        //referring to our array named "COUNTRIES" to be used as the ArrayList
        //The "simple_item_1" will print out each string in the array as a TextView
        array_adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, COUNTRIES);

        //Here we connect our ListView (which we named "myListView") to the ArrayAdapter
        myListView.setAdapter(array_adapter);

    }
}
