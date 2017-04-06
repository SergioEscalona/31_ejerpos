package modelo;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import javabean.Posicion;

/**
 * Created by Sergio on 06/04/2017.
 */

public class GestionBD {
    Helper helper;
    SQLiteDatabase db;
    public GestionBD(Context ctx, String nombreBd){
        //creación objeto ayudante
        helper=new Helper(ctx,nombreBd);
        db=helper.getWritableDatabase();
    }


    public void altaPosicion(Posicion pos){
        String sql="insert into coordenadas (latitud,longitud) ";
        sql+="values ('"+pos.getLatitud()+"'," + "'"
                +pos.getLongitud()+"')";
        db.execSQL(sql);

    }

    public void altaPosicion(String latitud,String longitud){
        String sql="insert into coordenadas (latitud, longitud) ";
        sql+="values ('"+latitud+"','"+longitud+"')";
        db.execSQL(sql);

    }

    public Cursor obtenerPosiciones(){
        String sql="select * from coordenadas";
        return db.rawQuery(sql,null);
    }

    public void cerrar(){
        db.close();
    }

    public void eliminarPosiciones(){
        String sql="delete * from coordenadas";

        db.execSQL(sql);
    }
}
