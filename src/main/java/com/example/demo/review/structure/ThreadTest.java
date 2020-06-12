package com.example.demo.review.structure;


public class ThreadTest {


    public static void main(String[] args) {
            ThreadGroup threadGroup = new ThreadGroup("测试线程组");

            ThreadA threadA = new ThreadA(threadGroup, "线程A");
            ThreadB threadB = new ThreadB(threadGroup, "线程B");
            ThreadC threadC = new ThreadC(threadGroup, "线程C");
            threadA.start();
            threadB.start();
            threadC.start();
            int nthreads = 3;
            Thread[] threads = {threadA, threadB, threadC};

            for (int i = 0; i < nthreads; i++) {
                //如果要删除线程B
                if (threads[i] == threads[1]) {
                    System.out.println("删除线程B");

                    //copy一份数组 从被删除的线程坐标点开始,复制从被删除坐标点到数组的最后一个坐标前的数据
                    //替换到原数据被删除的位置
                    //例子：arr1 =  {1,2,3,4,5}
                    //如果要删除2这个元素 【数组下标为1】
                    //从下标1后面复制 {3,4,5}
                    //替换2元素所在位置长度为3的所有元素
                    //变成[1,3,4,5,5}
                    //最后将最后一个多余的元素删除
                    //这样就完成了数组元素的删除
                    System.arraycopy(threads, i + 1, threads, i, --nthreads - i);

                    //打印copy之后的数组结构
                    for (int j=0;j<threads.length;j++){
                        System.out.println("数组下标:"+j+"线程名:"+threads[j].getName());
                    }
                    // Zap dangling reference to the dead structure so that
                    // the garbage collector will collect it.
                    System.out.println("交给垃圾收集器的线程下标:"+nthreads+"线程名:"+threads[nthreads].getName());
                    threads[nthreads] = null;
                    break;
                }
            }

        }




}
