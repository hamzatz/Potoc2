package com.company;

public class Consumer extends Thread {
    private Store store;
    public Producer producer;

    public Consumer(Producer producer,Store store) {
        this.producer = producer;
        this.store = store;
    }

        public void run(){
        try{
            producer.join();

        }catch (Exception e)
        {}

        for (int i = 0; i <5 ; i++) {
            store.get();
        }

}
}

