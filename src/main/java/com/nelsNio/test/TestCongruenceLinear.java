package com.nelsnio.test;

import com.nelsnio.logic.CongruenceLinear;
import com.nelsnio.logic.OperationCongruenceLinear;
import javafx.collections.FXCollections;

/**
 * main del programa, permite su ejecuci�n
 *
 * @author Walter
 */
class TestCongruenceLinear {
    public static void main(String[] args) {
        OperationCongruenceLinear linear = new OperationCongruenceLinear(new CongruenceLinear(5, 7, 8, 1, 15));
        linear.iteration(FXCollections.observableArrayList());
        System.out.println("Xi+1 : " + linear.getListXi() + " Ui: " + linear.getListUi());


    }
}
