package lial1613.ju.se.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectButtonClicked(View view) {
        System.out.println("Select button clicked!");

        Intent intent = new Intent(this, PickTodoActivity.class);
        startActivity(intent);
    }

    public void createButtonClicked(View view) {
        System.out.println("Create button clicked!");

        Intent intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }
}
