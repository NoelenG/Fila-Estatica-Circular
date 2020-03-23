package br.paduan;

public class Queue {
    private static final int _minimumQueueSize = 3;
    private int data[];
    private int start, end, amount;

    public Queue(int size){
        if(size <= _minimumQueueSize){
            size = _minimumQueueSize;;
        }
        data = new int[size];
        start = amount = end = 0;
    }

    public boolean isEmpty(){
        return (amount == 0);
    }

    public void enqueue(int value){
        if(isFull()){
            return;
        }
        data[end] = value;
        amount++;
        end = (end+1) % data.length;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return data[start];
    }
    public int size(){
        return amount;
    }
    public boolean isFull(){
        return (amount == data.length);
    }
    public int dequeue(){
       if(isEmpty()){
           return 0;
       }
        int value = data[start];
        amount--;
        start = (start+1)%data.length;
        return value;
    }

}