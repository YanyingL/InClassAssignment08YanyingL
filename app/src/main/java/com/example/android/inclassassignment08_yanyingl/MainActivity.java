package com.example.android.inclassassignment08_yanyingl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Question> questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData();

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(questions,this));

    }

    private void initialData(){
        questions=new ArrayList<>();
        questions.add(new Question(R.string.title_1,R.string.question_1,R.drawable.africa,true));
        questions.add(new Question(R.string.title_2,R.string.question_2,R.drawable.americas,false));
        questions.add(new Question(R.string.title_3,R.string.question_3,R.drawable.asia,true));
        questions.add(new Question(R.string.title_4,R.string.question_4,R.drawable.australia,true));
        questions.add(new Question(R.string.title_5,R.string.question_5,R.drawable.mideast,false));
        questions.add(new Question(R.string.title_6,R.string.question_6,R.drawable.oceans,true));

    }

}
