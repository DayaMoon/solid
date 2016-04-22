package edu.endava.solid.isp;

public class XeroxMachine implements IMachine
{

	@Override
	public void print() {
		System.out.println("Printing Job");
	}

	@Override
	public void staple() {
		System.out.println("Stapling Job");
	}

	@Override
	public void scan() {
		System.out.println("Scan Job");
	}

	@Override
	public void photoCopy() {
		System.out.println("Photo Copy");
	}

}
