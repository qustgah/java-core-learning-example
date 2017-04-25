package algorithm.stack;

import java.util.Stack;

/**
 * Created by apple on 2017/4/23.
 */
public class StackMin {
    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public StackMin() {
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getmin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    public int pop(){
        if (this.stackData.isEmpty()){
            throw new RuntimeException("");
        }
        int value = this.stackData.pop();
        if (value == this.getmin()) {
            this.stackMin.pop();
        }
        return value;
    }


    public int getmin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("...");
        }
        return this.stackMin.peek();
    }


}
