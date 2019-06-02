//create a rounded cube

CSG roundedCylinder = new eu.mihosoft.vrl.v3d.RoundedCylinder(5.0,40.0)
				.cornerRadius(3)// sets the radius of the corner
				.toCSG()// converts it to a CSG tor display
return roundedCylinder