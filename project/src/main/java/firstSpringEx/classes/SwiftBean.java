package firstSpringEx.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import firstSpringEx.interfaces.Car;
import firstSpringEx.interfaces.Engine;
@Component
public class SwiftBean  implements Car{
	@Autowired
	@Qualifier("v6Engine")
	Engine engine;

	public String specs() {
		// TODO Auto-generated method stub
		return "Normal Car" + engine.type();
	}

}
