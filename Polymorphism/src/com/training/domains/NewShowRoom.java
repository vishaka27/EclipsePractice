package com.training.domains;

import com.training.domains.ShowRoom;
import com.training.ifaces.Automobile;;


public class NewShowRoom extends ShowRoom {
	
	
	@Override
       public Automobile getModel(int key){
		
		if(key==3)
		{
			return new Bike();
			
		}
		else
		{
			return super.getModel(key);
		}
		
		}
}
