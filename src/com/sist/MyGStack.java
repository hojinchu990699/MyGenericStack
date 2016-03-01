package com.sist;

/**
 * Created by hojin on 16. 3. 1.
 */

class GStack<T>{        //제네릭 클래스 선언, 제네릭 타입 T
    int current;
    Object[] stack;     //스택에 저장된 요소의 개수(용도).

    public GStack(){
        current=0;
        stack=new Object[10];
    }

    public void push(T item){
        if(current==10)     //스택이 꽉차서 더 이상 요소 삽입할수 없음.
            return;
        stack[current]=item;
        current++;
    }

    public T pop(){
        if(current==0)      //스택이 비어있어 꺼낼 요소가 없음.
            return null;
        current--;
        return (T)stack[current];   //type매개변수 타입으로 캐스팅.
    }
}


public class MyGStack {
    public static void main(String[] args){
        //String 타입의 GStack 생성.
        GStack<String> stringGStack=new GStack<String>();

        stringGStack.push("Apple");
        stringGStack.push("Google");
        stringGStack.push("FaceBook");

        for(int i=0;i<3;i++){
            //stringGStack 스택에 있는 3개 문자열 팝.
            System.out.println(stringGStack.pop());
        }

        System.out.println();

        //Integer 타입의 GStack 생성.
        GStack<Integer> integerGStack=new GStack<Integer>();
        integerGStack.push(2016);
        integerGStack.push(2017);
        integerGStack.push(2018);

        for(int j=0;j<3;j++){
            //integerGStack 스택에 있는 3개 정수 팝.
            System.out.println(integerGStack.pop());
        }
    }
}






























