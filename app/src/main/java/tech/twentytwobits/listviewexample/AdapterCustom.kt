package tech.twentytwobits.listviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterCustom(var context: Context, var items: ArrayList<Fruta>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView
        val holder: ViewHolder

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.list_template, null)
            holder = ViewHolder(view)
            view.tag = holder
        } else {
            holder = view.tag as ViewHolder
        }

        val item = items.get(position) as Fruta
        holder.nombre.text = item.nombre
        holder.imagen.setImageResource(item.imagen)

        return view!!
    }

    override fun getItem(position: Int): Any {
        return items.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.count()
    }

    private class ViewHolder(view: View) {
        var nombre: TextView
        var imagen: ImageView

        init {
            nombre = view.findViewById(R.id.nombre)
            imagen = view.findViewById(R.id.imagen)
        }
    }
}