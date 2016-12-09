package lib;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.WritableImage;

public class GameAnimation {
	private Image image = null;
	private int frameCount, frameDelay;
	private int currentFrame, frameDelayCount;
	private int x, y, frameWidth, frameHeight;
	private boolean visible = false, playing = false;

	public GameAnimation(Image shootanim, int frameCount, int frameDelay) {
		this.frameCount = frameCount;
		this.frameDelay = frameDelay;
		image = shootanim;
		currentFrame = 0;
		frameDelayCount = 0;
		x = 0;
		y = 0;
		if (image != null) {
			frameWidth = (int) image.getWidth() / frameCount;
			frameHeight = (int) image.getHeight();
		} else {
			frameWidth = 0;
			frameHeight = 0;
		}
	}

	protected void topLeftAnimationAt(int x, int y) {
		this.x = x;
		this.y = y;
	}

	protected void centerAnimationAt(int x, int y) {
		this.x = x - frameWidth / 2;
		this.y = y - frameHeight / 2;
	}

	public void play() {
		currentFrame = 0;
		playing = true;
		visible = true;
	}

	public void stop() {
		currentFrame = 0;
		playing = false;
		visible = false;
	}

	public void updateAnimation() {
		if (!playing)
			return;
		if (frameDelayCount > 0) {
			frameDelayCount--;
			return;
		}
		frameDelayCount = frameDelay;
		currentFrame++;
		if (currentFrame == frameCount) {
			stop();
		}
	}

	public boolean isVisible() {
		return visible;
	}

	public int getZ() {
		return Integer.MAX_VALUE - 1;
	}

	public void render(GraphicsContext gc) {
		if (visible && image != null) {
			gc.drawImage(
					new WritableImage(image.getPixelReader(), currentFrame * frameWidth, 0, frameWidth, frameHeight), x,
					y);
		}
	}

}
