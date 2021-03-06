package application;

import imageCapture.Console;
import imageCapture.ImageCaptureDevice;

public class ConsoleAdapter implements ImageCaptureDevice {

	private Console c;

	public ConsoleAdapter(Console cc) {
		c = cc;
	}

	@Override
	public byte[] read() {
		return c.getImg();
	}

}
