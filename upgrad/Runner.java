package upgrad;//package name upgrad which have to java classes named as Student and Runner

import java.lang.*;
import java.util.*;

public class Runner {//the Runner class performs the operations
                     //below is the main function
public static void main(String args[]) throws Exception{
		Scanner sc=new Scanner(System.in);//to take input from keyboard
		String name,event;//event is the String which takes ENTER or SERVED as values
                double cgpa;//hold cgpa
                int token,num;//num will hold the number of student user want to enter
		num=sc.nextInt();//enter the quantity of students you want to enter
		PriorityQueue<Student> pQueue = new PriorityQueue<>(3*num,new Comparator<Student>(){
			@Override
                        //compare function sets the priority
			public int compare(Student a,Student b){
				if(a.getCGPA()>b.getCGPA()){//first comparing cgpa
					return -1;
				}
				else if(a.getCGPA()<b.getCGPA()){
					return 1;
				}
				else{//if cgpa is equal then comparing name
					int ans=(a.getName()).compareTo(b.getName());
					if(ans<0){
						return -1;
					}
					else if(ans>0){
						return 1;
					}
					else{//if name are equal then compare token
						if(a.getToken()<b.getToken()){
							return -1;
						}
						else if(a.getToken()<b.getToken()){
							return 1;
						}
					}
				}
				return 0;
			}
		});
		for(int i=0;i<num;i++){
			event=sc.next();//enter the value for event
			if(event.equals("ENTER")){//if event ="ENTER" then add student to the pQueue
				name=sc.next();
				cgpa=sc.nextDouble();
				token=sc.nextInt();
				pQueue.add(new Student(name,cgpa,token));
			}
			else if(event.equals("SERVED")){
                                //if event="SERVED" then serve or delete the highest priority student
				pQueue.poll();
			}
			else{//for invalid value of event
				System.out.println("*********WRONG INPUT********");
				System.exit(1);
			}
		}
		if(pQueue.isEmpty()){//if Queue is empty then print EMPTY
			System.out.println("EMPTY");
		}
		else{
			while(!pQueue.isEmpty()){//else print all remaining elements in pQueue
        		System.out.println(pQueue.poll().getName()+"");
        	}
		}
	}
}
