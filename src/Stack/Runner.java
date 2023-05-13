package Stack;

//import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        //TODO:Internal Stack Class

//        Stack<Integer> stack=new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }

        //TODO:Stack using Array Class

//        MyStack mystack=new MyStack(5);
//        mystack.push(1);
//        mystack.push(2);
//        mystack.push(3);
//        mystack.pop();
//        mystack.pop();
//        mystack.pop();
//        mystack.pop();
        //TODO:Stack using LinkedList Class

        MyStackList stackList=new MyStackList();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);
        stackList.push(4);
        stackList.push(5);
        stackList.push(10);
        System.out.println(stackList.size());
        System.out.println(stackList.pop());
        System.out.println(stackList);




    }
}
