package lib;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class DrawingUtility {
	protected static final Font standardFont = Font.font("Tahoma", FontWeight.BOLD, 30);
	protected static final Font smallFont = Font.font("Tahoma", FontWeight.MEDIUM, 9);
	protected static final Image bg = getImage("img/bg.jpg");
	protected static final Image gun = getImage("img/gun.png");
	protected static final Image gun_inf = getImage("img/gun_inf.png");
	protected static final Image shootAnim = getImage("img/shootAnim.png");

	protected static final double transcluentWhite = 0.7;
	protected static final double opaque = 1;

	private static Image getImage(String directory) {
		try {
			return new Image(ClassLoader.getSystemResource(directory).toString());
		} catch (NullPointerException e) {
			return null;
		}
	}

	public static Image getShootanim() {
		return shootAnim;
	}

	public static void drawShootableObject(GraphicsContext gc, int x, int y, int radius, String name,
			boolean isPointerOver) {
	
	}

	public static void drawItemGun(GraphicsContext gc, int x, int y, int radius, String name, boolean isPointerOver) {
		
	}

	public static void drawItemBullet(GraphicsContext gc, int x, int y, int radius, boolean isPointerOver) {
		
	}

	public static void drawIconGun(GraphicsContext gc, int bulletQuantity, int maxBullet, boolean isInfiniteBullet) {
		
	}

	public static void drawStatusBar(GraphicsContext gc, int remainingSecond, int score, boolean isPaused) {
		
	}

	public static GameAnimation createShootingAnimationAt(int x, int y) {
		GameAnimation anim = new GameAnimation(DrawingUtility.shootAnim, 7, 1);
		anim.centerAnimationAt(x, y);
		anim.play();
		return anim;
	}
}
