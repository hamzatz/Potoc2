package com.company;

import com.company.Store;

public class Producer extends Thread {

    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    public void run(){
        for (int i = 0; i <5 ; i++) {
            store.put();

        }

    }

}
