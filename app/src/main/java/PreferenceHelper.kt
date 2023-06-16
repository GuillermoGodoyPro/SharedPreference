import android.content.Context
import android.content.SharedPreferences

class PreferenceHelper(context: Context) {
    // Declarar el shared preference para guardar información
    private val sharedPreferences: SharedPreferences = context.getSharedPreferences("Myprefs", Context.MODE_PRIVATE)

    // guardamos la info en el sharedPreferences
    fun saveData( key:String, value: String ){
        // Le doy a la variable editor, la posibilidad de editar
        val editor = sharedPreferences.edit()
        editor.putString(key, value)
        // aplica el cambio
        editor.apply()
    }

    fun getData(key:String, defaultValue:String):String{
        return sharedPreferences.getString(key, defaultValue)?:defaultValue
    }

    fun removeData(key:String){
        val editor = sharedPreferences.edit()
        editor.remove(key)
        // aplica el cambio
        editor.apply()
    }

}