package heo;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import wserver.HelloStub;

public class MainJava {
	public static void main(String[] args) {
		try {
			HelloStub stb = new HelloStub();
			HelloStub.GetHello request = new HelloStub.GetHello();
			request.setMsg("stuuuuuuuuubbbbbbbbbbbbbb!");
						
			HelloStub.GetHelloResponse res = stb.getHello(request);
			System.out.println(res.get_return());
			
		} catch (AxisFault e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}

		
	}
}
