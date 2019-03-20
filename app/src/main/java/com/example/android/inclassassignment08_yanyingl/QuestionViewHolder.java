package com.example.android.inclassassignment08_yanyingl;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuestionViewHolder extends RecyclerView.ViewHolder{
    public CardView cardView;
    public TextView questionCountry;
    public TextView CountryQuestion;
    public ImageView CountryImage;
    public TextView isTrue;

    public QuestionViewHolder(View itemView,final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        questionCountry=(TextView)itemView.findViewById(R.id.question_country);
        CountryQuestion=(TextView)itemView.findViewById(R.id.country_question);
        CountryImage=(ImageView)itemView.findViewById(R.id.country_image);
        isTrue=(TextView) itemView.findViewById(R.id.question_isTrue);


        cardView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(context, isTrue.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
