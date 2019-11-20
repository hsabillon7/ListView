package tech.twentytwobits.listviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frutas = ArrayList<Fruta>()
        frutas.add(Fruta("Manzana", R.drawable.manzana))
        frutas.add(Fruta("Plátano", R.drawable.platano))
        frutas.add(Fruta("Sandía", R.drawable.sandia))
        frutas.add(Fruta("Durazno", R.drawable.durazno))

        val adapter = AdapterCustom(this, frutas)

        listViewFrutas.adapter = adapter

        listViewFrutas.onItemClickListener = AdapterView.OnItemClickListener{parent, view, position, id ->
            Toast.makeText(this, frutas.get(position).nombre, Toast.LENGTH_SHORT).show()
        }
    }
}
