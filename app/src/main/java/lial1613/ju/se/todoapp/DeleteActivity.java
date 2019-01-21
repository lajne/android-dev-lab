package lial1613.ju.se.todoapp;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

public class DeleteActivity extends AppCompatActivity {
    public int todoPos;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detete_todo);
        Intent intent = getIntent();
        String todoTitle = intent.getStringExtra("todoIndex");
        todoPos = intent.getIntExtra("todoPos", 0);
        System.out.println("title: " + todoTitle + "Pos: " + todoPos);
        TextView textView = (TextView) findViewById(R.id.todoTitle);
        textView.setText(todoTitle);
    }

    public void deleteButtonClicked_deleteActivity(View view) {
        new AlertDialog.Builder(this)
            .setTitle("Delete ToDo")
            .setMessage("Do you really want to delete it?")
            .setPositiveButton(
                android.R.string.yes,
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        // Delete it
                        Data.todos.remove(todoPos);
                        finish();
                    }
                }
            ).setNegativeButton(
            android.R.string.no,
            new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    //Do not delete it
                    dialog.cancel();
                }
            }
        ).show();
    }
}
