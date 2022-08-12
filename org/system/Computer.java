package org.system;

public class Computer extends Desktop {
	
	public void desktopSize()
	{
		System.out.println("desktopSize: 24 inch");
	}
	
	public static void main(String[] args) {
		
		Computer c = new Computer();
		c.computerModel();
		c.desktopSize();
	}

}
