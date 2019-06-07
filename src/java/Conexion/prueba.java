/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import Dao.CategoriaDao;
import TransFerObject.Categoria;
import java.util.ArrayList;

public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CategoriaDao catedao=new CategoriaDao();
        ArrayList<Categoria> lista = new ArrayList<>();
//        Categoria cate= new Categoria();
//        cate.setIdcategoria(1);
//        cate.setDescripcion("metal");
//        cate.setEstado('b');
//        catedao.insertarCategoria(cate);
        lista = catedao.listaCategorias();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(" datos "+lista.get(i).getDescripcion());
            
        }
        catedao.eliminarCategoria(1);
    }
    
}
