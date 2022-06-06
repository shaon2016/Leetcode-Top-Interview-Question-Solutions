package line

/*
import android.os.Bundle
import android.widget.TextView
import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView

class MainActivity : Activity() {

    var tasklist = mutableListOf<Pair<String, TaskState>>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing this adapter in local scope.
        // No need to initialize it global
        val myadapter = Myadapter()
        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = myadapter

        val todoRepository = TodoRepository()
        var i = 0
        todoRepository.instance.fetch_all().forEach { task ->
            tasklist.add(i++, task)
        }

        // Notifying after adding all the task list to update the view
        myadapter.notifyDataSetChanged()
    }

    override fun onDestroy() {
        tasklist.clear()
    }

    inner class Myadapter : BaseAdapter() {

        override fun getCount() = tasklist.size

        override fun getItem(position: Int): Any {
            // Handled the filter with && operator
            val li = tasklist.filter { it.second == TaskState.todo && it.second == TaskState.done }
            return li[position]
        }

        override fun getItemId(position: Int): Long {
            return 0
        }

        override fun getView(position: Int, convertView: View?, container: ViewGroup?): View {
            val convertView =
                convertView ?: layoutInflater.inflate(R.layout.list_item, container, false)

            val i = getItem(position) as Pair<String, TaskState>
            convertView.findViewById<TextView>(R.id.item_label)
                .apply {
                    when (i.second) {
                        TaskState.todo -> {
                            setText("TODO")
                            setBackgroundColor(Color.YELLOW)
                        }
                        else -> {
                            setText("DONE")
                        }
                    }
                }
            convertView.findViewById<TextView>(R.id.item_text).text = i.first

            return convertView
        }
    }
}

enum class TaskState {
    todo,
    done
}*/
