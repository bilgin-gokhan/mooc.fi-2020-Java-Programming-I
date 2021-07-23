/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CASPER
 */
public class Container {

    int existAmount = 0;

    public Container() {
    }

    public int contains() {
        return existAmount;
    }

    public void add(int amount) {
        if (amount > 0) {
            existAmount = existAmount + amount;
            if (existAmount > 100) {
                existAmount = 100;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            existAmount = existAmount - amount;
            if (existAmount < 0) {
                existAmount = 0;
            }
        }
    }

    public String toString() {
        return existAmount + "/100";
    }
}
