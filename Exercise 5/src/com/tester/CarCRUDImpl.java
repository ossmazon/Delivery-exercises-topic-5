package com.tester;

public class CarCRUDImpl implements CarCRUD{
    @Override
    public void save() {
        System.out.println("I'm a save method");
    }

    @Override
    public void finAll() {
        System.out.println("I'm a find All method");

    }

    @Override
    public void delete() {
        System.out.println("I'm a delete method");

    }
}
