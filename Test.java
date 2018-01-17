//package edu.buffalo.cse116;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args){
        BetterArray array = new BetterArray(10);
        String cmd;
    	String size;
    	
            for(int i = 0; i < 10; i++){
            	array.put((int)(Math.random() * 50), i);
            }
            
            try {
    			for(int j = 0; j < 20; j++){
    				System.out.println(array.get(j));
    			}
    		} catch (IndexOutOfBoundsException e) {
    			System.out.println("Index should be less than the number of nodes.");
    		}
            System.out.println();

    		for(int i = 0; i < 20; i++){
            	array.put((int)(Math.random() * 50), i);
            }
            
            try {
    			for(int j = 0; j < 20; j++){
    				System.out.println(array.get(j));
    			}
    		} catch (IndexOutOfBoundsException e) {
    			System.out.println("Index should be less than the number of nodes.");
    		}
            System.out.println();

    		for(int i = 0; i < 20; i++){
            	array.put((int)(Math.random() * 50), i);
            }
    		array.insert(999, 14);
    		try {
    			for(int j = 0; j < 20; j++){
    				System.out.println(array.get(j));
    			}
    		} catch (IndexOutOfBoundsException e) {
    			System.out.println("Index should be less than the number of nodes.");
    		}
    		System.out.println();
    	
    		for(int i = 0; i < 20; i++){
            	array.put((int)(Math.random() * 50), i);
            }
    		array.insert(999, 14);
    		array.delete(15);
    		try {
    			for(int j = 0; j < 20; j++){
    				System.out.println(array.get(j));
    			}
    		} catch (IndexOutOfBoundsException e) {
    			System.out.println("Index should be less than the number of nodes.");
    		}
    		System.out.println();
    		

    		BetterArray array2 = new BetterArray(1000);
    		for(int i = 0; i < 1000; i++){	
    			array2.put((int)(Math.random() * 1000), i);
    		}
    		System.out.println();

        
    }
}