

public class Animation2D extends Animation implements Drawable{
public static void main(String[] args) {
	Animation2D a = new Animation2D();
	a.getFramerate();
	a.draw();
}
	@Override
	int getFramerate() {
		// TODO Auto-generated method stub
		return 24;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	System.out.println("drawing");
	}

}
