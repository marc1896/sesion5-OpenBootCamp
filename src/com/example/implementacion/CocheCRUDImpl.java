package com.example.implementacion;

import com.example.interfaces.CocheCRUD;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Metodo para guardar.");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo para buscar.");
    }

    @Override
    public void delete() {
        System.out.println("Metodo para eliminar.");
    }
}
