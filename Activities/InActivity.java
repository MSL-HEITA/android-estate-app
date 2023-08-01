package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.comoestate.Adapter.item_Adapter;
import com.example.comoestate.Domain.Item_Domain;
import com.example.comoestate.R;

import java.util.ArrayList;

public class InActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in);

        initRecyclerView();
    }

    private void initRecyclerView() {




            ArrayList<Item_Domain> ItemsArraylist= new ArrayList<>();

            ItemsArraylist.add(new Item_Domain("A house with a great vila","Bella Rosa Callorina, unit 27 ","In publishing and graphic design," +
                    " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                    " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                    "It is also used to temporarily replace text in a process called greeking,\n" +
                    " which allows designers to consider the form of a webpage or publication,\n " +
                    "without the meaning of the text influencing the design.\n",3,2,500000,"pic1",true));
            ItemsArraylist.add(new Item_Domain("A house with a great Roof top","Aus Blick, house 5 ","In publishing and graphic design," +
                    " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                    " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                    "It is also used to temporarily replace text in a process called greeking,\n" +
                    " which allows designers to consider the form of a webpage or publication,\n " +
                    "without the meaning of the text influencing the design.\n",2,1,5142200,"pic2",false));
            ItemsArraylist.add(new Item_Domain("A house with a great yard","Aus Blick, house_vila 10 ","In publishing and graphic design," +
                    " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                    " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                    "It is also used to temporarily replace text in a process called greeking,\n" +
                    " which allows designers to consider the form of a webpage or publication,\n " +
                    "without the meaning of the text influencing the design.\n",3,1,340000,"pic_detail",true));
            ItemsArraylist.add(new Item_Domain("It has a very good swimming pool","Swkopmund ","In publishing and graphic design," +
                    " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                    " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                    "It is also used to temporarily replace text in a process called greeking,\n" +
                    " which allows designers to consider the form of a webpage or publication,\n " +
                    "without the meaning of the text influencing the design.\n",3,2,500000,"cat_1",true));



            recyclerViewPopular=findViewById(R.id.viewPopular);
            recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
            adapterPopular = new item_Adapter(ItemsArraylist);
            recyclerViewPopular.setAdapter(adapterPopular);
    }
}