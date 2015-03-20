package cn.dyz.arithmetic;

import java.util.LinkedList;

public class StackAndQueue {

	public static void main(String[] args) {
		
		StackQueue<String> queue = new StackQueue<String>();
		
		queue.put("asdf");
		queue.put("dfs");
		queue.put("dfs3");
		queue.put("dfs4");
		
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}
	
	

}
/**
 * 由两个栈构成的队列
 *
 * @author  daiyongzhi
 * @date 2015年3月17日 上午10:04:03
 * @version V1.0
 */
class StackQueue<T>{
	private LinkedList<T> stack1 = new LinkedList<T>();
	private LinkedList<T> stack2 = new LinkedList<T>();
	
	public void put(T number){
		stack1.push(number);
	}
	
	public T pop(){
		if(stack2.size()<=0){
			while(stack1.size()>0){
				stack2.push(stack1.pop());
			}
		}
		T tmp= stack2.pop();
		return tmp;
	}
	
}
