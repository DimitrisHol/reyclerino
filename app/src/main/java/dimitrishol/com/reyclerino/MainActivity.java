package dimitrishol.com.reyclerino;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 20 : Get the reference to the RecyclerView.
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // Step 21 : Get the Data from somewhere.
        Student student1 = new Student("Demetres", "23");
        Student student2 = new Student("NotDemetres", "Not23");

        ArrayList<Student> studentData = new ArrayList<Student>();
        studentData.add(student1);
        studentData.add(student2);

        // Step 22 : Create an adapter that passes the user data.
        BlueAdapter blueAdapter = new BlueAdapter(studentData);

        // Step 23 : Attach the adapter to the recyclerView.
        recyclerView.setAdapter(blueAdapter);

        // Step 24 : Set a LayoutManager to position the items.
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}
