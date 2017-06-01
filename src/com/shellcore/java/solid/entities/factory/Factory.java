package com.shellcore.java.solid.entities.factory;

/**
 * Esta es una mala implementación de las tareas de una fábrica
 * Created by Cesar. 01/06/2017.
 */
public interface Factory {
    void administration();
    void manufacture();
    void accountancy();
    void transformRawMaterial();
    void createNewProduct();
    void costReduction();
    void logistics();
    void distribution();
}
