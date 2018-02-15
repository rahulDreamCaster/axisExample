package org.dreamcaster;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.dreamcaster.AddServiceStub.AddTwoValues;

public class AddTest {

	public static void main(String[] args) throws RemoteException,AxisFault {
		// TODO Auto-generated method stub
		System.out.println("test1");
		AddServiceStub asd=new AddServiceStub();
		System.out.println("test2");
		
		AddTwoValues add = new AddTwoValues();
		add.setI(5);
		add.setI(6);
		//add.localI=1;
		//add.localJ=3;
		System.out.println("test3");
		
		System.out.println("values :: "+asd.addTwoValues(add).get_return());
	}

}
