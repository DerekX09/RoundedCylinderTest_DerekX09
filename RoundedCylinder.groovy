//create a rounded cube
import eu.mihosoft.vrl.v3d.RoundedCylinder;

CSG roundedCylinder = new RoundedCylinder(5.0,40.0)
				.cornerRadius(3)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCylinder