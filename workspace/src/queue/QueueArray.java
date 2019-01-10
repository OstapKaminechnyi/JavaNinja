package queue;

public class QueueArray {
    private int capacity =2;
    int queueArr[];
    int front=0;
    int rear = -1;
    int currentSize=0;
    public QueueArray(){
        queueArr=new int[this.capacity];
    }
    public void enQueue(int item){
        if(isQueueFull()){
            System.out.println("Queue is full, Increase Capacity");
            increaseCapacity();
        }
        rear++;
        if(rear>=queueArr.length && currentSize!=queueArr.length){
            rear=0;
        }
        queueArr[rear]=item;
        currentSize++;
        System.out.println("Adding " + item);
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow! Unable to remove element from queue");
        }
        else {
            front++;
            if(front>queueArr.length-1){
                System.out.println("Remove " + queueArr[front-1]);
                front = 0;
            }
            else {
                System.out.println("Removed" + queueArr[front-1]);
            }
            currentSize--;
        }
    }
    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize==queueArr.length){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSize==0){
            status = true;
        }
        return status;
    }
    private void increaseCapacity(){
        int newCapacity = this.queueArr.length*2;
        int [] newArr = new int [newCapacity];
        int tmpFront = front;
        int index =-1;
        while (true){
            newArr[++index] = this.queueArr[tmpFront];
            tmpFront++;
            if(tmpFront==this.queueArr.length){
                tmpFront = 0;
            }
            if(currentSize==index+1){
                break;
            }

        }
        this.queueArr=newArr;
        System.out.println("new Array capacity" + this.queueArr.length);
        this.front=0;
        this.rear = index;

    }

    public static void main(String args[]){
        QueueArray que = new QueueArray();
        que.enQueue(4);
        que.dequeue();
        que.enQueue(56);
        que.enQueue(2);
        que.enQueue(60);
        que.dequeue();
        que.enQueue(24);
        que.enQueue(98);
        que.dequeue();
        que.dequeue();
        que.dequeue();
        que.enQueue(300);
        que.dequeue();
        que.dequeue();
    }
}
