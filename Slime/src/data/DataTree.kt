package data

import java.lang.Exception

class DataTree() {
    val data = mutableMapOf<String, Variable>()
    fun add(path: MutableList<String>, v: Variable) {
        if (path.isNotEmpty()) {
            val turn = path[0]
            path.removeAt(0)
            data[turn]?.get(path)?.insert(v)
        } else {
            for (n in v.names)
                data[n.content] = v
            if (v.names.size == 0) data["@nameless"] = v
        }
    }

    fun delete(way: MutableList<String>, name: String) {
        if (way.isNotEmpty()) {
            val turn = way[0]
            way.removeAt(0)
            (data[turn] ?: throw  Exception("No variable found with name ${way[0]}")).delete(way)
        } else {
            data.remove(name)
        }
    }
}