package com.example.odc_finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class AdressAdapter extends RecyclerView.Adapter<AdressAdapter.ViewHolder> {
    String[] productNames = {"Organic Bananas","Red pepper","beef bones","chicken","banana","pepper"};
    String[] Prices = {"$4.99","2$","$4.99","$4.99","5$","6$"};
    String[] LongDesc = {"Bananas are nutritious. Bananas may be good for weight loss. apples may be good for your heart. As part of a healthful and varied diet.",
            "Red pepper can be used to cook sauce and many more recipes",
            "2 kilos of beef bones",
            "One and half kilo of pure chicken",
            "Bananas are nutritious. Bananas may be good for weight loss. apples may be good for your heart. As part of a healthful and varied diet.",
            "Red pepper can be used to cook sauce and many more recipes"," "};
    String[] productDesc = {"7pcs, Priceg","0.5 kilo pepper","1kg, Priceg","1kg, Priceg","7pcs, Priceg","0.5 kilo pepper"};

    int[] productImages = {R.drawable.pizzafood,R.drawable.tacos,R.drawable.spaghetti,
            R.drawable.burger,R.drawable.burger,R.drawable.burger,R.drawable.pizzafood,R.drawable.tacos,R.drawable.spaghetti,
            R.drawable.burger,R.drawable.burger,R.drawable.burger};
    // variable for our array list and context
    private ArrayList<AdressModel> courseModalArrayList;
    private Context context;

    // constructor
    public AdressAdapter(ArrayList<AdressModel> courseModalArrayList, Context context) {
        this.courseModalArrayList = courseModalArrayList;
        this.context = context;
    }

    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.address_item, parent, false);
        return new ViewHolder(view);    }

    @Override
    public void onBindViewHolder(AdressAdapter.ViewHolder holder, int position) {
        AdressModel modal = courseModalArrayList.get(position);
        //holder.courseNameTV.setText("test");
        holder.courseDescTV.setText(modal.getAddress());

      //  holder.courseTracksTV.setText("test");

    }




    @Override
    public int getItemCount() {
        // returning the size of our array list
        return courseModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private TextView courseNameTV, courseDescTV, courseTracksTV;
        private ImageView courseDurationTV;

        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            // initializing our text views
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseDescTV = itemView.findViewById(R.id.idTVCourseDescription);
            courseDurationTV = itemView.findViewById(R.id.idTVCourseDuration);
            courseTracksTV = itemView.findViewById(R.id.idTVCourseTracks);
        }
    }
}
