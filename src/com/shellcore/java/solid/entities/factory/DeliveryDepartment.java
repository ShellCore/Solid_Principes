package com.shellcore.java.solid.entities.factory;

/**
 * Ésta es una mejor implementación aplicando la Segregación de interfaces
 * Segregado de la interfaz Factory en interfaces por departamento
 * Created by Cesar. 01/06/2017.
 */
public interface DeliveryDepartment {
    void logistics();
    void distribution();
}
