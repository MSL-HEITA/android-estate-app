package com.example.comoestate.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.comoestate.Adapter.item_Adapter;
import com.example.comoestate.Domain.Item_Domain;
import com.example.comoestate.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private RecyclerView.Adapter adapterPopular,adapterNew;
 private RecyclerView recyclerViewPopular,recyclerViewNew;
 private TextView  text_See_All,text_See;
 private ConstraintLayout press;
    private ConstraintLayout office;

    private ConstraintLayout Apartment;
    private ConstraintLayout court;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initRecyclerView();
      initTextView();
      initConstraintLayout();
    }

    private void initConstraintLayout() {
        press =findViewById(R.id.press);
        press.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,InActivity.class)));


        office =findViewById(R.id.office);
        office.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,OfficeActivity.class)));

        Apartment =findViewById(R.id. Apartment);
        Apartment.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,ApartmentActivity.class)));

        court =findViewById(R.id. court);
        court.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,CourtActivity.class)));

    }

    private void initTextView() {
        text_See_All =findViewById(R.id.text_See_All);
        text_See_All.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,ViewActivity.class)));

        text_See =findViewById(R.id.text_See);
        text_See.setOnClickListener(v -> startActivity(new Intent(MainActivity.this,ViewActivity.class)));


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
        ItemsArraylist.add(new Item_Domain("A Apartment house","Walvis Bay  ","In publishing and graphic design," +
                " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                "It is also used to temporarily replace text in a process called greeking,\n" +
                " which allows designers to consider the form of a webpage or publication,\n " +
                "without the meaning of the text influencing the design.\n",2,1,5142200,"cat_2",false));
        ItemsArraylist.add(new Item_Domain("A Apartment","Bella Rosa ,Windhoek, unit 27 ","In publishing and graphic design," +
                " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                "It is also used to temporarily replace text in a process called greeking,\n" +
                " which allows designers to consider the form of a webpage or publication,\n " +
                "without the meaning of the text influencing the design.\n",3,1,340000,"cat_3",true));
        ItemsArraylist.add(new Item_Domain("A house","Ondangwa,  ","In publishing and graphic design," +
                " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                "It is also used to temporarily replace text in a process called greeking,\n" +
                " which allows designers to consider the form of a webpage or publication,\n " +
                "without the meaning of the text influencing the design.\n",3,2,500000,"pic_new_1",true));
        ItemsArraylist.add(new Item_Domain("A house","Oshakati,  ","In publishing and graphic design," +
                " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                "It is also used to temporarily replace text in a process called greeking,\n" +
                " which allows designers to consider the form of a webpage or publication,\n " +
                "without the meaning of the text influencing the design.\n",2,1,5142200,"pic_new_2",false));
        ItemsArraylist.add(new Item_Domain("A house with a great vila","Bella Rosa Callorina, unit 27 ","In publishing and graphic design," +
                " Lorem ipsum is a placeholder text commonly used to demonstrate the visual form of a document\n or a typeface without relying on meaningful content." +
                " Lorem ipsum may be used as a placeholder before final copy is available.\n " +
                "It is also used to temporarily replace text in a process called greeking,\n" +
                " which allows designers to consider the form of a webpage or publication,\n " +
                "without the meaning of the text influencing the design.\n",3,1,340000,"pic1",true));

        recyclerViewPopular=findViewById(R.id.viewPopular);
        recyclerViewNew= findViewById(R.id.viewNew);

        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerViewNew.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        adapterNew = new item_Adapter(ItemsArraylist);
        adapterPopular = new item_Adapter(ItemsArraylist);

        recyclerViewNew.setAdapter(adapterNew);
        recyclerViewPopular.setAdapter(adapterPopular);

    }
}