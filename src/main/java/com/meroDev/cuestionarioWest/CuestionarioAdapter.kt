package com.meroDev.cuestionarioWest

import android.opengl.Visibility
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_preguntas.view.*

class CuestionarioAdapter(val cuestionarios:ArrayList<Cuestionario>):RecyclerView.Adapter<CuestionarioAdapter.CuestionarioViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CuestionarioViewHolder {
          var layoutInflate:View=LayoutInflater.from(parent.context).inflate(R.layout.item_preguntas,parent,false)

        return  CuestionarioViewHolder(layoutInflate)
    }


    override fun getItemCount(): Int {
        return cuestionarios.size
    }

    override fun onBindViewHolder(holder: CuestionarioViewHolder, position: Int) {
        var itemCuestionario=cuestionarios[position]
            holder.bindCuestionario(itemCuestionario)



    }

    inner class CuestionarioViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){


        fun bindCuestionario(cuestionario:Cuestionario){
            val rg=itemView.itemPreguntasRgParent
            val txt=itemView.itemPreguntasTitulo
            var id=(adapterPosition+1)*100

            if (rg.isEmpty()){
                txt.text=cuestionario.titulo
                for(opciones in cuestionario.opciones){
                    var rb=RadioButton(rg.context)
                    rb.setId(id)
                    rb.text=opciones
                    rg.addView(rb)
                }
            }


            }




        }

}