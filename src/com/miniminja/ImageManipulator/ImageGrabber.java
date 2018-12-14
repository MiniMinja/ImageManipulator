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
	
	public static BufferedImage[] getAnimation(String filePath, int rows, int cols, int width, int height, int frames) {
		BufferedImage[] ret = new BufferedImage[frames];
		BufferedImage sprite = getImage(filePath);
		int frameIndex = 0;
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<cols;j++) {
				ret[frameIndex++] = sprite.getSubimage(j*width, i*height, width, height);
				if(frameIndex == frames) return ret;
			}
		}
		return ret;
	}
}
