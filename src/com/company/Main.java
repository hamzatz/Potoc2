package com.company;

public class Main {

    public static void main(String[] args) {
        Store store= new Store();
        Producer producer = new Producer(store);
        Consumer consumer= new Consumer(producer,store);
        producer.start();

        consumer.start();
        System.out.println("Главный поток завершил свои операции");
        }


    }

