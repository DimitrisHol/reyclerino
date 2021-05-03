package dimitrishol.com.reyclerino;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

// Step 5 : Create the Adapter class.
// The adapter populates the data to the RecyclerView, by converting the object into a list row.
// Step 11 : The Adapter must extend RecyclerView.Adapter<BlueAdapter.ViewHolder>
public class BlueAdapter extends RecyclerView.Adapter<BlueAdapter.ViewHolder> {

    // Step 6 : Create a variable for your data
    private List<Student> studentsData;

    // Step 7 : Pass the student array into the constructor
    public BlueAdapter(List<Student> studentsData){

        this.studentsData = studentsData;
    }

    // Step 8 : Create a ViewHolder class that extends RecyclerView.ViewHolder
    // The ViewHolder describes and provides the view for each of the rows.
    public class ViewHolder extends RecyclerView.ViewHolder{

        // Step 9 : Create variables according to the itemList
        public TextView nameTextView;
        public TextView ageTextView;

        // Step 10 : In the constructor get the reference to the views.
        public ViewHolder(View itemView) {
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.item_name);
            ageTextView = (TextView) itemView.findViewById(R.id.item_age);
        }
    }

    // Step 12 : Override the following methods, onCreateViewHolder , onBindViewHolder, getItemCount.

    // Step 13 : onCreateViewHolder : Create the Holder, basically the view that we want to show.
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int i) {

        // Boilerplate android code.
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Step 14 : Inflate the custom layout
        // Create a view based on the layout file that we created.
        View studentView = inflater.inflate(R.layout.recyclerview_item, parent, false);

        // Step 15 : Create a ViewHolder instance and return it.
        ViewHolder viewHolder = new ViewHolder(studentView);
        return viewHolder;
    }

    // Step 16 : Bind the data to the ViewHolder.
    @Override
    public void onBindViewHolder(BlueAdapter.ViewHolder viewHolder, int position) {

        // Step 17 : Based on the position, get the data from the list.
        Student student = studentsData.get(position);

        // Step 18 : Set the item views based on your data.

        // We have the ViewHolder that contains all the TextViews and ImageViews etc
        // so that's what we reference to set the Text of each widget.

        TextView nameTextView = viewHolder.nameTextView;
        TextView ageTextView = viewHolder.ageTextView;

        nameTextView.setText(student.getName());
        ageTextView.setText(student.getAge());
    }

    // Step 19 : Implement the final method
    @Override
    public int getItemCount() {
        return studentsData.size();
    }
}


