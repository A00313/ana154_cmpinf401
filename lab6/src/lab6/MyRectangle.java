package lab6;

public class MyRectangle {
	 private int xDimension;
	 private int yDimension;
	 
	 private int xStart;
	 private int yStart;

	 MyRectangle (){
		 xDimension = 0;
		 yDimension = 0;
		 
		 xStart = 0;
		 yStart = 0;
	 }
	 MyRectangle (int width, int hight, int xPosition, int yPosition){
		 xDimension = width;
		 yDimension = hight;
		 
		 xStart = xPosition;
		 yStart = yPosition;
	 }
	 
	 public int area()
		{
			return xDimension * yDimension;
		}

		// I have written this method for you.  Note how a StringBuilder is
		// utilized, since (as we discussed in lecture) it can be modified
		// without having to create a new object each time (unlike a String).
		public String toString()
		{
			StringBuilder S = new StringBuilder();
			S.append("Width: " + xDimension);
			S.append(" Height: " + yDimension);
			S.append(" X: " + xStart);
			S.append(" Y: " + yStart);
			return S.toString();
		}

		public boolean isInside(int x, int y)
		{
			// This is the trickiest of the methods to write.  This should
			// return true if point (x,y) is anywhere within the borders of the
			// current MyRectangle (including the borders themselves).  Use a
			// pencil and paper to figure out how this can be determined with
			// just a few simple relational operations.
			if ((x >= xStart & x <= xStart + xDimension) & (y >= yStart & y <= yStart + yDimension)) {
				return true;
			}
			else {
				return false;
			}
		}

		public void setSize(int w, int h)
		{
			// Update width and height as shown
			xDimension = w;
			yDimension = h;
		}

		public void setPosition(int x, int y)
		{
			// Update startX and startY as shown
			xStart = x;
			yStart = y;
		}
	

}
