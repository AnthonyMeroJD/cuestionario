package com.meroDev.cuestionarioWest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_preguntas.*

class MainActivity : AppCompatActivity() {
    var cuestionarios=ArrayList<Cuestionario>()
    var op=ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        op()
        data()

        activityMainRecyclerView.layoutManager=LinearLayoutManager(this)
        activityMainRecyclerView.adapter=CuestionarioAdapter(cuestionarios)

    }
    fun op(){
        op.add("opcion 1")
        op.add("opcion 2")


    }
    fun data(){

            cuestionarios.add(Cuestionario("pregunta1", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta2", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta3", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta4", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta5", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta6", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta7", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta8", op, "opcion1"))
            cuestionarios.add(Cuestionario("pregunta 9", op, "opcion2"))
            cuestionarios.add(Cuestionario("pregunta 10", op, "opcion3"))
            cuestionarios.add(Cuestionario("pregunta 11", op, "opcion4"))



    }
}
