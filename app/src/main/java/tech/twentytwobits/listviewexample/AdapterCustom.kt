package tech.twentytwobits.listviewexample

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class AdapterCustom(var context: Context, var items: ArrayList<Fruta>): BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    }
}