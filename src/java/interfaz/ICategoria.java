/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import TransFerObject.Categoria;
import java.util.ArrayList;

/**
 *
 * @author MARTIN
 */
public interface ICategoria {
    public abstract ArrayList<Categoria>listaCategorias();
    public abstract   boolean insertarCategoria(Categoria cate);
    public abstract  boolean actualizarCategoria(Categoria cate);
    public abstract  boolean eliminarCategoria(int idCategoria);
}
