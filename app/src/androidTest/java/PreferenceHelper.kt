import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(context:Context) {
    // Declarar el shared preference para guardar información
    private val sharedPreferences:SharedPreferences = context.getSharedPreferences("Myprefers", Context.MODE_PRIVATE)

    fun saveData( key:String, value: String ){
        // Le doy a la variable editor, la posibilidad de editar
        val editor = sharedPreferences.edit()
    }

    fun getData(key:String, defaultValue:String){

    }

    fun removeData(key:String){

    }

}