package project4;

//This is child class named as Rectangle. It has Abstract method inherited from Shape.

//This method calculates the area for Rectangle. It takes width & length as parameters.

 class rectangular extends shape {
	 public float printArea(float width, float length) {
			float area = width * length;
			return area;
		}

	@Override
	protected float printarea() {
		// TODO Auto-generated method stub
		return 0;
	}

		


}
