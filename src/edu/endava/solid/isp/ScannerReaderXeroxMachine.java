package edu.endava.solid.isp;

public class ScannerReaderXeroxMachine implements IScanner, IPrinter
{

	@Override
	public void print()
	{
		System.out.println("do print");

	}

	@Override
	public void scan()
	{
		System.out.println("do scan");
	}

}
