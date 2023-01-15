package com.tester;

public class TesterMain {

    static CarCRUD carCRUD= new CarCRUDImpl();
    public static void main(String[] args) {

        carCRUD.save();
        carCRUD.finAll();
        carCRUD.delete();

    }
}
