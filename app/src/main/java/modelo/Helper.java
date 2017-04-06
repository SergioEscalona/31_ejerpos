package modelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Sergio on 06/04/2017.
 */

public class Helper extends SQLiteOpenHelper{
    public Helper(Context ctx, String nombre){
        super(ctx,nombre,null,1);
    }
    //este método se ejecuta cuando Android crea la BD
    @Override
    public void onCreate(SQLiteDatabase db) {
        //montamos la instrucción SQL de creación de la tabla
        String sqlCreaTabla="create table coordenadas (";
        sqlCreaTabla+="_id integer primary key autoincrement,";
        sqlCreaTabla+="latitud text,";
        sqlCreaTabla+="longitud text)";

        //ejecutamos la instrucción
        db.execSQL(sqlCreaTabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
