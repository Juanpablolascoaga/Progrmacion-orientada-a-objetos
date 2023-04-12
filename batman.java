package Imagenes;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class batman {
	 static int width = 1650;
	 static int height = 950;
	 
	 static Color yellowish = new Color(252,214,5);
	 
	 static Graphics2D g;

	    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		private static byte[] jpg;
	    private final static int PIXEL_SIZE = 50;
	    private final static Color[][] PIXELS = {
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.RED, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.BLUE, Color.BLUE, Color.BLUE, Color.WHITE},
	        {Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE}
	    };
	    
	    public static void paint() {
	    	drawBackground(PIXEL_SIZE, Color.white);     
	        drawHorizontalLine(9, 23, 1, Color.black);
	        drawHorizontalLine(7, 25, 2, Color.black);
	        drawHorizontalLine(6, 26, 3, Color.black);
	        drawHorizontalLine(5, 27, 4, Color.black);
	        drawHorizontalLine(4, 28, 5, Color.black);
	        drawHorizontalLine(3, 29, 6, Color.black);
	        drawVerticalLine(7,12,2,Color.BLACK);
	        drawVerticalLine(7,12,30,Color.BLACK);
	        drawHorizontalLine(3, 29, 13, Color.black);
	        drawHorizontalLine(4, 28, 14, Color.black);
	        drawHorizontalLine(5, 27, 15, Color.black);
	        drawHorizontalLine(6, 26, 16, Color.black);
	        drawHorizontalLine(8, 24, 17, Color.black);
	        
	        drawHorizontalLine(9, 23, 2, yellowish);
	        drawHorizontalLine(7, 25, 3, yellowish);
	        drawHorizontalLine(6, 26, 4, yellowish);
	        drawHorizontalLine(5, 27, 5, yellowish);
	        drawHorizontalLine(4, 28, 6, yellowish);
	        drawHorizontalLine(3, 29, 7, yellowish);
	        drawHorizontalLine(3, 29, 8, yellowish);
	        drawHorizontalLine(3, 29, 9, yellowish);
	        drawHorizontalLine(3, 29, 10, yellowish);
	        drawHorizontalLine(3, 29, 11, yellowish);
	        drawHorizontalLine(3, 29, 12, yellowish);
	        drawHorizontalLine(4, 28, 13, yellowish);
	        drawHorizontalLine(5, 27, 14, yellowish);
	        drawHorizontalLine(6, 26, 15, yellowish);
	        drawHorizontalLine(8, 24, 16, yellowish);
	   	        
	        drawVerticalLine(8,11,4,Color.BLACK);
	        drawVerticalLine(7,12,5,Color.BLACK);
	        drawVerticalLine(6,13,6,Color.BLACK);
	        drawVerticalLine(5,14,7,Color.BLACK);
	        drawVerticalLine(4,10,8,Color.BLACK);
	        drawVerticalLine(13,14,8,Color.BLACK);
	        drawVerticalLine(3,10,9,Color.BLACK);
	        drawVerticalLine(14,15,9,Color.BLACK);
	        putPixel(10,3, Color.black);
	        drawVerticalLine(7,11,10,Color.BLACK);
	        drawVerticalLine(8,13,11,Color.BLACK);
	        drawVerticalLine(8,11,12,Color.BLACK);
	        drawVerticalLine(7,11,13,Color.BLACK);
	        drawVerticalLine(3,12,14,Color.BLACK);
	        drawVerticalLine(4,13,15,Color.BLACK);
	        drawVerticalLine(4,14,16,Color.BLACK);
	        drawVerticalLine(4,13,17,Color.BLACK);
	        drawVerticalLine(3,12,18,Color.BLACK);
	        drawVerticalLine(7,11,19,Color.BLACK);
	        drawVerticalLine(8,11,20,Color.BLACK);
	        drawVerticalLine(8,13,21,Color.BLACK);
	        drawVerticalLine(7,11,22,Color.BLACK);
	        putPixel(22,3, Color.black);
	        drawVerticalLine(14,15,23,Color.BLACK);
	        drawVerticalLine(3,11,23,Color.BLACK);
	        drawVerticalLine(13,14,24,Color.BLACK);
	        drawVerticalLine(4,10,24,Color.BLACK);
	        drawVerticalLine(5,10,25,Color.BLACK);
	        drawVerticalLine(13,14,25,Color.BLACK);
	        drawVerticalLine(6,13,26,Color.BLACK);
	        drawVerticalLine(7,12,27,Color.BLACK);
	        drawVerticalLine(8,11,28,Color.BLACK);
	        
	        drawSquareGrid(PIXEL_SIZE, Color.black);
	        try {       
	        	String folderPath = "C:\\Users\\maest\\eclipse-workspace\\main\\src\\Imagenes";
	            ImageIO.write(image, "jpg", new File(folderPath + "\\batman.jpg"));
	            System.out.println("Archivo guardado exitosamente.");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    private static void drawVerticalLine(int a, int b, int x, Color c){
	    	for(int i=a;i<=b;i++){
	     	   g.setColor(c);
	           g.fillRect(x * PIXEL_SIZE, i * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	        }
	    }
	    
	    private static void drawHorizontalLine(int a, int b, int y, Color c){
	        for(int i=a;i<=b;i++){
	     	   g.setColor(c);
	           g.fillRect(i * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	        }
	    }
	    
	    private static void putPixel(int x, int y, Color c){       
		   g.setColor(c);
		   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
	    }
	    
	    private static void fillRect(int x, int y, int width, int height, Color c){
	    	g.setColor(c);
	    	g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, width*PIXEL_SIZE, height*PIXEL_SIZE);
	    }
	    
	    private static void drawSquareGrid(int size, Color c) {
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {                
	                g.setColor(c);
	                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
	            }
	        }
	    }
	    private static void drawBackground(int size, Color c) {
	    	for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                g.setColor(c);
	                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
	            }
	        }
	    }
	    
	    
	    public static void main(String[] args) {
	        g = image.createGraphics();        
	        paint();
	    }
}
