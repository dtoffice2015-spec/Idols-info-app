package com.example.myfirstapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    IdolAdapter adapter;
    List<IdolModel> idolList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        idolList = new ArrayList<>();

        // Add Data Here
        idolList.add(new IdolModel(
                "Chhatrapati Shivaji Maharaj",
                "Founder of Maratha Empire",
                "Chhatrapati Shivaji Maharaj was a legendary Indian warrior king and the founder of the Maratha Empire. Known for his military genius, guerrilla warfare tactics, progressive administration, and respect for all religions.",
                R.drawable.shivaji_maharaj));

        idolList.add(new IdolModel(
                "Chhatrapati Sambhaji Maharaj",
                "Second Chhatrapati of Maratha Empire",
                "Chhatrapati Sambhaji Maharaj was the eldest son of Shivaji Maharaj. He was a great warrior, scholar of 14 languages, and brave ruler who fought relentlessly against the Mughal Empire.",
                R.drawable.sambhaji_maharaj));

        idolList.add(new IdolModel(
                "Maharani Tarabai",
                "Regent of Maratha Empire",
                "Maharani Tarabai was the queen who led the Maratha resistance against Aurangzeb after the death of Rajaram Maharaj. Her strategic brilliance kept the Maratha Empire alive during its tough times.",
                R.drawable.tarabai));

        idolList.add(new IdolModel(
                "Rani Lakshmibai",
                "Queen of Jhansi",
                "Rani Lakshmibai was one of the leading figures of the Indian Rebellion of 1857 and a symbol of resistance to the British Raj for Indian nationalists.",
                R.drawable.lakshmibai));

        idolList.add(new IdolModel(
                "Dr. B. R. Ambedkar",
                "Father of Indian Constitution",
                "Dr. Bhimrao Ramji Ambedkar was a great social reformer, jurist, economist, and politician. He was the chief architect of the Constitution of India and fought for human rights.",
                R.drawable.ambedkar));

        adapter = new IdolAdapter(this, idolList);
        recyclerView.setAdapter(adapter);
    }
}