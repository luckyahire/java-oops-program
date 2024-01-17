package project4;

//This is child class named as Circle. It has Abstract method inherited from Shape.

 class circle extends shape {
	 
	//This method calculates the area for Circle. It takes radius as a parameter.
	 
		public float printArea(float pi, float radius) {
			float area = pi * radius * radius;
			return area;
		}

		@Override
		protected float printarea() {
			// TODO Auto-generated method stub
			return 0;
		}


}
