package com.scolari.datosread;

import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.scolari.datosread.model.Student;

public class MainActivity extends AppCompatActivity {

    private static final String STUDENT_NODE = "Students";
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);// Ejecuto la persistencia de firbase cuando esta sin internet
        databaseReference = FirebaseDatabase.getInstance().getReference(); // esta liniea es para obtener el nodo principal padre

    }



    public void createStudent (View view){

        Student student = new Student(databaseReference.push().getKey(),"Jorge Ortiz");
        databaseReference.child(STUDENT_NODE).child(student.getId()).setValue(student);

    }

}
