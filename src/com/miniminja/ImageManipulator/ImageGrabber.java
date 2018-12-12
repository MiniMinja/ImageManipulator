package com.miniminja.ImageManipulator;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageGrabber {

	public static BufferedImage getImage(String filePath) {
		BufferedImage ret = null;
		try { 
			ret = ImageIO.read(new File(filePath));
		}catch(IOException e) {
			System.out.println("Card not found!");
		}
		return ret;
	}
}
