package baitap.stopwatch;

import java.time.LocalTime;

public class StopWatch {
    LocalTime startTime , endTime ;
    public StopWatch () {
        startTime = LocalTime.now();
    }
    public StopWatch(LocalTime startTime, LocalTime endTime){
        this.startTime = startTime ;
        this.endTime = endTime ;
    }

    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void end() {
        endTime = LocalTime.now();
    }
    public double getElapseTime() {
        return (endTime.getHour() - startTime.getHour() * 3600 + (endTime.getMinute() -startTime.getMinute()) * 60 + (endTime.getSecond() - startTime.getSecond())) * 1000 ;
    }
    public static int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i] ;
                    arr[i] = arr[j];
                    arr[j] = temp ;
                }
            }
        }
        return arr ;
    }

    public static void main(String[] args) {
        int[] array = new int[100000] ;
        for (int i = 0 ; i < array.length; i++ ){
            array[i] = (int)(Math.random() * 100000) ;
        }
        LocalTime start = LocalTime.now();
        sortArr(array);
        LocalTime end = LocalTime.now() ;
        StopWatch stopWatch = new StopWatch(start, end) ;
        System.out.println("Time to respond: " + stopWatch.getElapseTime() );

    }
}
